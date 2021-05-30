package cn.expjmicro.example.api.pubsub.genclient;

import cn.expjmicro.example.api.pubsub.ISimplePubsub;
import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import cn.jmicro.api.pubsub.PSData;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;
import java.util.Map;

public interface ISimplePubsub$Gateway$JMAsyncClient extends ISimplePubsub {
  @WithContext
  IPromise<Void> helloTopicJMAsync(PSData data, Object context);

  IPromise<Void> helloTopicJMAsync(PSData data);

  @WithContext
  IPromise<Void> statisJMAsync(PSData data, Object context);

  IPromise<Void> statisJMAsync(PSData data);

  @WithContext
  IPromise<Void> testTopicJMAsync(PSData data, Object context);

  IPromise<Void> testTopicJMAsync(PSData data);

  @WithContext
  IPromise<Void> helloTopicWithArrayArgsJMAsync(PSData[] data, Object context);

  IPromise<Void> helloTopicWithArrayArgsJMAsync(PSData[] data);

  @WithContext
  IPromise<Void> notifyMessageStatuJMAsync(int statusCode, long msgId, Map<String, Object> cxt,
      Object context);

  IPromise<Void> notifyMessageStatuJMAsync(int statusCode, long msgId, Map<String, Object> cxt);
}
