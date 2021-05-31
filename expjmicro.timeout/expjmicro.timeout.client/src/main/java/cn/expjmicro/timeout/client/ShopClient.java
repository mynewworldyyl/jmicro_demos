package cn.expjmicro.timeout.client;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.expjmicro.timeout.api.ITxShopService;
import cn.jmicro.api.Resp;
import cn.jmicro.api.annotation.Component;
import cn.jmicro.api.annotation.Reference;
import cn.jmicro.api.objectfactory.IObjectFactory;
import cn.jmicro.api.objectfactory.PostFactoryAdapter;

@Component  //容器根据此注解实例化组件
public class ShopClient extends PostFactoryAdapter{

	private final static Logger logger = LoggerFactory.getLogger(ShopClient.class);
	
	//Reference注解获得Shop服务代理引用
	@Reference
	private ITxShopService shop;
	
	//容器启动成功后调用此方法
	@Override
	public void afterInit(IObjectFactory of) {
		AtomicInteger ai = new AtomicInteger(0);
		//为了不Block主线程，我们在此启动一个线程每间隔3秒调用一次商店提供的购买方法
		new Thread(()->{
				for(;true;) {
						try {
						//调用商店服务
						int cnt = ai.getAndIncrement();
						Resp<Boolean> rst = shop.buy(1, cnt);
						if(rst.getCode() != Resp.CODE_SUCCESS) {
							//系统组错误
							logger.info(rst.getMsg()+"," + rst.getCode()+",idx:"+cnt);
						}else if(rst.getData()) {
							//业务购买失败
							logger.info("Success idx: " + cnt);
						}else {
							//成功
							logger.info("Fulure"+rst.getMsg()+"," + rst.getCode()+",idx:"+cnt);
						}
						try {
							TimeUnit.SECONDS.sleep(1);
						} catch (InterruptedException e) {
							logger.error("",e);
						}
						}catch(Throwable e) {
						logger.error(e.getMessage());
					}
				}
		}).start();
		}
}
