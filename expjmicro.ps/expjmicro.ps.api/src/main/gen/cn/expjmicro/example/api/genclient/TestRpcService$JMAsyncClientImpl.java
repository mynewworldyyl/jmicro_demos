package cn.expjmicro.example.api.genclient;

import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import cn.jmicro.api.objectfactory.AbstractClientServiceProxyHolder;
import cn.jmicro.api.test.Person;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;

public class TestRpcService$JMAsyncClientImpl extends AbstractClientServiceProxyHolder implements ITestRpcService$JMAsyncClient {
  public IPromise<Person> getPersonJMAsync(Person p) {
    return  this.proxyHolder.invoke("getPersonJMAsync", null, (java.lang.Object)(p));
  }

  public Person getPerson(Person p) {
    return (cn.jmicro.api.test.Person) this.proxyHolder.invoke("getPerson",null, (java.lang.Object)(p));
  }

  @WithContext
  public IPromise<Person> getPersonJMAsync(Person p, Object context) {
    return this.proxyHolder.invoke("getPersonJMAsync",context,(java.lang.Object)(p));
  }

  public IPromise<Void> pushMessageJMAsync(String msg) {
    return  this.proxyHolder.invoke("pushMessageJMAsync", null, (java.lang.Object)(msg));
  }

  public void pushMessage(String msg) {
    this.proxyHolder.invoke("pushMessage", null,(java.lang.Object)(msg));
  }

  @WithContext
  public IPromise<Void> pushMessageJMAsync(String msg, Object context) {
    return this.proxyHolder.invoke("pushMessageJMAsync",context,(java.lang.Object)(msg));
  }

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

  public IPromise<Integer> testReturnPrimitiveResultJMAsync() {
    return this.proxyHolder.invoke("testReturnPrimitiveResultJMAsync",null);
  }

  public int testReturnPrimitiveResult() {
    return (int) this.proxyHolder.invoke("testReturnPrimitiveResult",null);
  }

  @WithContext
  public IPromise<Integer> testReturnPrimitiveResultJMAsync(Object context) {
    return this.proxyHolder.invoke("testReturnPrimitiveResultJMAsync",context);
  }

  public IPromise<int[]> testReturnPrimitiveArrayResultJMAsync() {
    return this.proxyHolder.invoke("testReturnPrimitiveArrayResultJMAsync",null);
  }

  public int[] testReturnPrimitiveArrayResult() {
    return (int[]) this.proxyHolder.invoke("testReturnPrimitiveArrayResult",null);
  }

  @WithContext
  public IPromise<int[]> testReturnPrimitiveArrayResultJMAsync(Object context) {
    return this.proxyHolder.invoke("testReturnPrimitiveArrayResultJMAsync",context);
  }

  public IPromise<Boolean> testReturnBooleanResultJMAsync() {
    return this.proxyHolder.invoke("testReturnBooleanResultJMAsync",null);
  }

  public Boolean testReturnBooleanResult() {
    return (java.lang.Boolean) this.proxyHolder.invoke("testReturnBooleanResult",null);
  }

  @WithContext
  public IPromise<Boolean> testReturnBooleanResultJMAsync(Object context) {
    return this.proxyHolder.invoke("testReturnBooleanResultJMAsync",context);
  }

  public IPromise<Boolean> testReturnPrimitiveBooleanResultJMAsync() {
    return this.proxyHolder.invoke("testReturnPrimitiveBooleanResultJMAsync",null);
  }

  public boolean testReturnPrimitiveBooleanResult() {
    return (boolean) this.proxyHolder.invoke("testReturnPrimitiveBooleanResult",null);
  }

  @WithContext
  public IPromise<Boolean> testReturnPrimitiveBooleanResultJMAsync(Object context) {
    return this.proxyHolder.invoke("testReturnPrimitiveBooleanResultJMAsync",context);
  }
}
