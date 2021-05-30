package cn.expjmicro.example.api.genclient;

import cn.jmicro.api.registry.ServiceItem;

public interface IDynamicInterface$JMAsyncClient extends IDynamicInterface$Gateway$JMAsyncClient {
  boolean isReady();

  int clientId();

  ServiceItem getItem();
}
