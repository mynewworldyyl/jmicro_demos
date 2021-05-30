package cn.expjmicro.example.api.rpc.genclient;

import cn.jmicro.api.registry.ServiceItem;

public interface IRpcA$JMAsyncClient extends IRpcA$Gateway$JMAsyncClient {
  boolean isReady();

  int clientId();

  ServiceItem getItem();
}
