package cn.expjmicro.helloworld.api.genclient;

import cn.jmicro.api.registry.ServiceItem;

public interface ITxPaymentService$JMAsyncClient extends ITxPaymentService$Gateway$JMAsyncClient {
  boolean isReady();

  int clientId();

  ServiceItem getItem();
}
