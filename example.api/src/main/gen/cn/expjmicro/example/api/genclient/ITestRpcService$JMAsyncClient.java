package cn.expjmicro.example.api.genclient;

import cn.jmicro.api.registry.ServiceItem;

public interface ITestRpcService$JMAsyncClient extends ITestRpcService$Gateway$JMAsyncClient {
  boolean isReady();

  int clientId();

  ServiceItem getItem();
}
