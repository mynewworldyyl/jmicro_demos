package cn.expjmicro.example.api.pubsub.genclient;

import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import cn.jmicro.api.objectfactory.AbstractClientServiceProxyHolder;
import cn.jmicro.api.pubsub.PSData;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;
import java.util.Map;

public class SimplePubsub$JMAsyncClientImpl extends AbstractClientServiceProxyHolder implements ISimplePubsub$JMAsyncClient {
  public IPromise<Void> helloTopicJMAsync(PSData data) {
    return  this.proxyHolder.invoke("helloTopicJMAsync", null, (java.lang.Object)(data));
  }

  public void helloTopic(PSData data) {
    this.proxyHolder.invoke("helloTopic", null,(java.lang.Object)(data));
  }

  @WithContext
  public IPromise<Void> helloTopicJMAsync(PSData data, Object context) {
    return this.proxyHolder.invoke("helloTopicJMAsync",context,(java.lang.Object)(data));
  }

  public IPromise<Void> statisJMAsync(PSData data) {
    return  this.proxyHolder.invoke("statisJMAsync", null, (java.lang.Object)(data));
  }

  public void statis(PSData data) {
    this.proxyHolder.invoke("statis", null,(java.lang.Object)(data));
  }

  @WithContext
  public IPromise<Void> statisJMAsync(PSData data, Object context) {
    return this.proxyHolder.invoke("statisJMAsync",context,(java.lang.Object)(data));
  }

  public IPromise<Void> testTopicJMAsync(PSData data) {
    return  this.proxyHolder.invoke("testTopicJMAsync", null, (java.lang.Object)(data));
  }

  public void testTopic(PSData data) {
    this.proxyHolder.invoke("testTopic", null,(java.lang.Object)(data));
  }

  @WithContext
  public IPromise<Void> testTopicJMAsync(PSData data, Object context) {
    return this.proxyHolder.invoke("testTopicJMAsync",context,(java.lang.Object)(data));
  }

  public IPromise<Void> helloTopicWithArrayArgsJMAsync(PSData[] data) {
    return  this.proxyHolder.invoke("helloTopicWithArrayArgsJMAsync", null, (java.lang.Object)(data));
  }

  public void helloTopicWithArrayArgs(PSData[] data) {
    this.proxyHolder.invoke("helloTopicWithArrayArgs", null,(java.lang.Object)(data));
  }

  @WithContext
  public IPromise<Void> helloTopicWithArrayArgsJMAsync(PSData[] data, Object context) {
    return this.proxyHolder.invoke("helloTopicWithArrayArgsJMAsync",context,(java.lang.Object)(data));
  }

  public IPromise<Void> notifyMessageStatuJMAsync(int statusCode, long msgId,
      Map<String, Object> cxt) {
    return  this.proxyHolder.invoke("notifyMessageStatuJMAsync", null, statusCode,msgId,cxt);
  }

  public void notifyMessageStatu(int statusCode, long msgId, Map<String, Object> cxt) {
    this.proxyHolder.invoke("notifyMessageStatu",null, statusCode,msgId,cxt);
  }

  @WithContext
  public IPromise<Void> notifyMessageStatuJMAsync(int statusCode, long msgId,
      Map<String, Object> cxt, Object context) {
    return this.proxyHolder.invoke("notifyMessageStatuJMAsync",context, statusCode,msgId,cxt);
  }
}
