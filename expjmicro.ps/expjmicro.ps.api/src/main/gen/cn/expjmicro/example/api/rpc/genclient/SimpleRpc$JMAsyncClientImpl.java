package cn.expjmicro.example.api.rpc.genclient;

import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import cn.jmicro.api.objectfactory.AbstractClientServiceProxyHolder;
import cn.jmicro.api.test.Person;
import java.lang.Object;
import java.lang.String;

public class SimpleRpc$JMAsyncClientImpl extends AbstractClientServiceProxyHolder implements ISimpleRpc$JMAsyncClient {
  public IPromise<String> helloJMAsync(String name) {
    return  this.proxyHolder.invoke("helloJMAsync", null, (java.lang.Object)(name));
  }

  public String hello(String name) {
    return (java.lang.String) this.proxyHolder.invoke("hello",null, (java.lang.Object)(name));
  }

  @WithContext
  public IPromise<String> helloJMAsync(String name, Object context) {
    return this.proxyHolder.invoke("helloJMAsync",context,(java.lang.Object)(name));
  }

  public IPromise<String> hiJMAsync(Person p) {
    return  this.proxyHolder.invoke("hiJMAsync", null, (java.lang.Object)(p));
  }

  public String hi(Person p) {
    return (java.lang.String) this.proxyHolder.invoke("hi",null, (java.lang.Object)(p));
  }

  @WithContext
  public IPromise<String> hiJMAsync(Person p, Object context) {
    return this.proxyHolder.invoke("hiJMAsync",context,(java.lang.Object)(p));
  }

  public IPromise linkRpc(String msg) {
    return (cn.jmicro.api.async.IPromise<java.lang.String>) this.proxyHolder.invoke("linkRpc",null, (java.lang.Object)(msg));
  }

  @WithContext
  public IPromise linkRpcJMAsync(String msg, Object context) {
    return this.proxyHolder.invoke("linkRpcJMAsync",context,(java.lang.Object)(msg));
  }

  public IPromise linkRpcAs(String msg) {
    return (cn.jmicro.api.async.IPromise<java.lang.String>) this.proxyHolder.invoke("linkRpcAs",null, (java.lang.Object)(msg));
  }

  @WithContext
  public IPromise linkRpcAsJMAsync(String msg, Object context) {
    return this.proxyHolder.invoke("linkRpcAsJMAsync",context,(java.lang.Object)(msg));
  }
}
