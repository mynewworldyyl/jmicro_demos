package cn.expjmicro.example.api.genclient;

import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import cn.jmicro.api.objectfactory.AbstractClientServiceProxyHolder;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;

public class DynamicInterface$JMAsyncClientImpl extends AbstractClientServiceProxyHolder implements IDynamicInterface$JMAsyncClient {
  public IPromise<Void> runJMAsync(String data) {
    return  this.proxyHolder.invoke("runJMAsync", null, (java.lang.Object)(data));
  }

  public void run(String data) {
    this.proxyHolder.invoke("run", null,(java.lang.Object)(data));
  }

  @WithContext
  public IPromise<Void> runJMAsync(String data, Object context) {
    return this.proxyHolder.invoke("runJMAsync",context,(java.lang.Object)(data));
  }
}
