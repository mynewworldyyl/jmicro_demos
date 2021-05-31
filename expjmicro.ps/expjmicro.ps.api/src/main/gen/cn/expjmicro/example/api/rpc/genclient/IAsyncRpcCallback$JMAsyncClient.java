package cn.expjmicro.example.api.rpc.genclient;

import cn.jmicro.api.registry.ServiceItem;

public interface IAsyncRpcCallback$JMAsyncClient extends IAsyncRpcCallback$Gateway$JMAsyncClient {
  boolean isReady();

  int clientId();

  ServiceItem getItem();
}
