package cn.expjmicro.apigateway.shop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.expjmicro.apigateway.api.ITxOrderService;
import cn.expjmicro.apigateway.api.ITxShopService;
import cn.expjmicro.apigateway.api.entities.Good;
import cn.jmicro.api.Resp;
import cn.jmicro.api.annotation.Component;
import cn.jmicro.api.annotation.Reference;
import cn.jmicro.api.annotation.Service;

/**
 * showFront=true 可以通过后台管理页面查看并调用服务信息
 * external=true 可以通过服务网关调用此服务
 * logLevel=MC.LOG_DEBUG 默认日志级别的Debug
 * 
 * @author Yulei Ye
 * @date 2021年4月18日 上午10:43:23
 */
@Component
@Service(version="0.0.1")
public class TxShopServiceImpl implements ITxShopService {

	private final static Logger logger = LoggerFactory.getLogger(TxShopServiceImpl.class);
	
	@Reference
	private ITxOrderService orderSrv;
	
	/**
	 * 同步实现下单服务
	 * @see txType=TxConstants.TYPE_TX_DISTRIBUTED 启用分布式服务
	 * @see txPhase=TxConstants.TX_3PC 3PC事务提交方案
	 * 
	 */
	@Override
	public Resp<Boolean> buy(int goodId,int num) {
		Resp<Boolean> r = new Resp<>(Resp.CODE_FAIL,false);
		logger.info("开始购买商品:"+goodId+",数量:" + num);
		Good g = new Good();
		g.setId(goodId);
		r = orderSrv.takeOrder(g,num);
		if(r.getData()) {
			logger.info("购买商品成功:"+goodId+",数量:" + num);
		}else {
			logger.info("购买商品失败:"+goodId+",数量:" + num+",Reason: "+r.getCode()+",msg:"+r.getMsg());
		}
		return r;
	}

}
