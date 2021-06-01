package cn.expjmicro.timeout.shop;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.expjmicro.timeout.api.ITxShopService;
import cn.jmicro.api.Resp;
import cn.jmicro.api.annotation.Component;
import cn.jmicro.api.annotation.SMethod;
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
	
	private Random ran = new Random(System.currentTimeMillis());
	
	/**
	 * 0.0.3版本存在Bug，实际超时时间是 3*timeout，所以timeout=1000MS，实际上是3000MS
	 * 
	 */
	@Override
	@SMethod(timeout=1000,retryCnt=2,retryInterval=1000)
	public Resp<Boolean> buy(int goodId,int num) {
		Resp<Boolean> r = new Resp<>(Resp.CODE_SUCCESS,true);
		int st = ran.nextInt(6);
		if(st > 0) {
			logger.info("Sleep time: " + st+" Seconds idx: " +num);
			try {
				TimeUnit.SECONDS.sleep(60);
			} catch (InterruptedException e) {
				logger.error("",e);
			}
		}
		logger.info("Success return idx:" +num);
		return r;
	}

}
