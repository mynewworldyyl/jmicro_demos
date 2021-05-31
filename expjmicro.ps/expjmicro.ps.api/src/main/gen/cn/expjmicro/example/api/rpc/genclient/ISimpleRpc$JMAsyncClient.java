package cn.expjmicro.example.api.rpc.genclient;

import cn.jmicro.api.registry.ServiceItem;

public interface ISimpleRpc$JMAsyncClient extends ISimpleRpc$Gateway$JMAsyncClient {
  boolean isReady();

  int clientId();

  ServiceItem getItem();
}
