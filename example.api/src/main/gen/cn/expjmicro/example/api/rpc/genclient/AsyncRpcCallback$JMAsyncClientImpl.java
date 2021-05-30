package cn.expjmicro.example.api.rpc.genclient;

import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import cn.jmicro.api.objectfactory.AbstractClientServiceProxyHolder;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;

public class AsyncRpcCallback$JMAsyncClientImpl extends AbstractClientServiceProxyHolder implements IAsyncRpcCallback$JMAsyncClient {
  public IPromise<Void> callbackJMAsync(String name) {
    return  this.proxyHolder.invoke("callbackJMAsync", null, (java.lang.Object)(name));
  }

  public void callback(String name) {
    this.proxyHolder.invoke("callback", null,(java.lang.Object)(name));
  }

  @WithContext
  public IPromise<Void> callbackJMAsync(String name, Object context) {
    return this.proxyHolder.invoke("callbackJMAsync",context,(java.lang.Object)(name));
  }
}
