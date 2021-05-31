package cn.expjmicro.example.api.genclient;

import cn.jmicro.api.registry.ServiceItem;

public interface IMessageHandler$JMAsyncClient extends IMessageHandler$Gateway$JMAsyncClient {
  boolean isReady();

  int clientId();

  ServiceItem getItem();
}
