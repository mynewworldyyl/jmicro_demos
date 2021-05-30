package cn.expjmicro.example.api.genclient;

import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import cn.jmicro.api.net.Message;
import cn.jmicro.api.objectfactory.AbstractClientServiceProxyHolder;
import java.lang.Object;
import java.lang.Void;

public class MessageHandler$JMAsyncClientImpl extends AbstractClientServiceProxyHolder implements IMessageHandler$JMAsyncClient {
  public IPromise<Void> onMessageJMAsync(Message msg) {
    return  this.proxyHolder.invoke("onMessageJMAsync", null, (java.lang.Object)(msg));
  }

  public void onMessage(Message msg) {
    this.proxyHolder.invoke("onMessage", null,(java.lang.Object)(msg));
  }

  @WithContext
  public IPromise<Void> onMessageJMAsync(Message msg, Object context) {
    return this.proxyHolder.invoke("onMessageJMAsync",context,(java.lang.Object)(msg));
  }
}
