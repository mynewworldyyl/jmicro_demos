package cn.expjmicro.example.api.rpc.genclient;

import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import cn.jmicro.api.objectfactory.AbstractClientServiceProxyHolder;
import java.lang.Object;
import java.lang.String;

public class RpcA$JMAsyncClientImpl extends AbstractClientServiceProxyHolder implements IRpcA$JMAsyncClient {
  public IPromise<String> invokeRpcAJMAsync(String aargs) {
    return  this.proxyHolder.invoke("invokeRpcAJMAsync", null, (java.lang.Object)(aargs));
  }

  public String invokeRpcA(String aargs) {
    return (java.lang.String) this.proxyHolder.invoke("invokeRpcA",null, (java.lang.Object)(aargs));
  }

  @WithContext
  public IPromise<String> invokeRpcAJMAsync(String aargs, Object context) {
    return this.proxyHolder.invoke("invokeRpcAJMAsync",context,(java.lang.Object)(aargs));
  }
}
