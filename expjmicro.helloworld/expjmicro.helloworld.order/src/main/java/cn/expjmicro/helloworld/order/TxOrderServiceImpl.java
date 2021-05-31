package cn.expjmicro.helloworld.order;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.expjmicro.helloworld.api.ITxOrderService;
import cn.expjmicro.helloworld.api.ITxPaymentService;
import cn.expjmicro.helloworld.api.entities.Good;
import cn.expjmicro.helloworld.api.entities.Payment;
import cn.jmicro.api.Resp;
import cn.jmicro.api.annotation.Component;
import cn.jmicro.api.annotation.Reference;
import cn.jmicro.api.annotation.SMethod;
import cn.jmicro.api.annotation.Service;
import cn.jmicro.api.monitor.MC;
import cn.jmicro.api.tx.TxConstants;

@Component
@Service(version="0.0.1",logLevel=MC.LOG_DEBUG,debugMode=1)
public class TxOrderServiceImpl implements ITxOrderService {

	private final static Logger logger = LoggerFactory.getLogger(TxOrderServiceImpl.class);
	
	@Reference
	private ITxPaymentService paymentSrv;
	
	private Random ran = new Random(System.currentTimeMillis()/100);
	
	/**
	 * 同步下单服务， 被商店服务调用
	 * TxConstants.TYPE_TX_DISTRIBUTED 启用分布式服务
	 */
	@Override
	@SMethod(txType=TxConstants.TYPE_TX_DISTRIBUTED)
	public Resp<Boolean> takeOrder(Good g,int num) {
		Resp<Boolean> r = new Resp<>(Resp.CODE_FAIL,false);
		logger.info("开始购买商品:"+g.getId()+",数量:" + num);
		Payment p = new Payment();
		p.setId(ran.nextInt());
		p.setAmount(1);
		p.setOrderId(g.getId());
		r = paymentSrv.pay(p);
		if(r.getData()) {
			logger.info("购买商品成功:"+p.getId()+",数量:" + num);
		}else {
			logger.info("购买商品失败:"+p.getId()+",数量:" + num+",Reason: "+r.getCode()+",msg:"+r.getMsg());
		}
		return r;
	}

}
