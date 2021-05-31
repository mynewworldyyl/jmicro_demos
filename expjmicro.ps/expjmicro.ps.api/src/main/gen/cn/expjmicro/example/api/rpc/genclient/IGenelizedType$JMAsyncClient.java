package cn.expjmicro.example.api.rpc.genclient;

import cn.jmicro.api.registry.ServiceItem;

public interface IGenelizedType$JMAsyncClient extends IGenelizedType$Gateway$JMAsyncClient {
  boolean isReady();

  int clientId();

  ServiceItem getItem();
}
