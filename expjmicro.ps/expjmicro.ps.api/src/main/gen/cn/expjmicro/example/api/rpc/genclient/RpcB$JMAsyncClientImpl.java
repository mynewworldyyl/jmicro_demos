package cn.expjmicro.example.api.rpc.genclient;

import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import cn.jmicro.api.objectfactory.AbstractClientServiceProxyHolder;
import java.lang.Object;
import java.lang.String;

public class RpcB$JMAsyncClientImpl extends AbstractClientServiceProxyHolder implements IRpcB$JMAsyncClient {
  public IPromise<String> invokeRpcBJMAsync(String bargs) {
    return  this.proxyHolder.invoke("invokeRpcBJMAsync", null, (java.lang.Object)(bargs));
  }

  public String invokeRpcB(String bargs) {
    return (java.lang.String) this.proxyHolder.invoke("invokeRpcB",null, (java.lang.Object)(bargs));
  }

  @WithContext
  public IPromise<String> invokeRpcBJMAsync(String bargs, Object context) {
    return this.proxyHolder.invoke("invokeRpcBJMAsync",context,(java.lang.Object)(bargs));
  }
}
