package cn.expjmicro.example.api.pubsub.genclient;

import cn.jmicro.api.registry.ServiceItem;

public interface ISimplePubsub$JMAsyncClient extends ISimplePubsub$Gateway$JMAsyncClient {
  boolean isReady();

  int clientId();

  ServiceItem getItem();
}
