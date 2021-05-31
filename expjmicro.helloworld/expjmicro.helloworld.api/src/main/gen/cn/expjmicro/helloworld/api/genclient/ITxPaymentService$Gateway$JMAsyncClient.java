package cn.expjmicro.helloworld.api.genclient;

import cn.expjmicro.helloworld.api.ITxPaymentService;
import cn.expjmicro.helloworld.api.entities.Payment;
import cn.jmicro.api.Resp;
import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import java.lang.Object;

public interface ITxPaymentService$Gateway$JMAsyncClient extends ITxPaymentService {
  @WithContext
  IPromise<Resp> payJMAsync(Payment p, Object context);

  IPromise<Resp> payJMAsync(Payment p);
}
