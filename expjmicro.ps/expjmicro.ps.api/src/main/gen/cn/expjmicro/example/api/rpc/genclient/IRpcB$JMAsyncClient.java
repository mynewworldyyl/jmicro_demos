package cn.expjmicro.example.api.rpc.genclient;

import cn.jmicro.api.registry.ServiceItem;

public interface IRpcB$JMAsyncClient extends IRpcB$Gateway$JMAsyncClient {
  boolean isReady();

  int clientId();

  ServiceItem getItem();
}
