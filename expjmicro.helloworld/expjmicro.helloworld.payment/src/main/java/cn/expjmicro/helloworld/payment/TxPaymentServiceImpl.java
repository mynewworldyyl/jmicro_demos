package cn.expjmicro.helloworld.payment;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.expjmicro.helloworld.api.ITxPaymentService;
import cn.expjmicro.helloworld.api.entities.Payment;
import cn.jmicro.api.JMicroContext;
import cn.jmicro.api.Resp;
import cn.jmicro.api.annotation.Component;
import cn.jmicro.api.annotation.SMethod;
import cn.jmicro.api.annotation.Service;
import cn.jmicro.api.monitor.LG;
import cn.jmicro.api.monitor.MC;
import cn.jmicro.api.tx.TxConstants;
import cn.jmicro.common.CommonException;

@Component
@Service(version="0.0.1",logLevel=MC.LOG_DEBUG,debugMode=1)
public class TxPaymentServiceImpl implements ITxPaymentService {

	private final static Logger logger = LoggerFactory.getLogger(TxPaymentServiceImpl.class);
	 
	private int exCnt = 0;
	
	private Random ran = new Random(System.currentTimeMillis()/100);
	
	/**
	 * 同步实现支付服务
	 */
	@Override
	@SMethod(txType=TxConstants.TYPE_TX_DISTRIBUTED)
	public Resp<Boolean> pay(Payment p) {
		Resp<Boolean> r = new Resp<>(Resp.CODE_SUCCESS,true);
		
		if(p.getId() % 3 == 0) {
			//模拟支付失败
			if(++exCnt % 2 == 0) {
				r.setCode(Resp.CODE_FAIL);
				r.setData(false);
				r.setMsg("payId: "+p.getId()+",模拟支付失败"+", txid:" + JMicroContext.get().getLong(TxConstants.TX_ID, -1L));
				LG.log(MC.LOG_ERROR, this.getClass(), r.getMsg());
				logger.debug(r.getMsg());
			} else {
				String msg = "payId: "+p.getId()+",余额不足"+", txid:" + JMicroContext.get().getLong(TxConstants.TX_ID, -1L);
				LG.log(MC.LOG_ERROR, this.getClass(), msg);
				logger.debug(msg);
				throw new CommonException(msg);
			}
			return r;
		}
		
		LG.log(MC.LOG_INFO, this.getClass(), "Save payment");
		//保存支付单
		return r;
	}
	
}
