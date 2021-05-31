package cn.expjmicro.example.api.rpc.genclient;

import cn.expjmicro.example.api.rpc.ISimpleRpc;
import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import cn.jmicro.api.test.Person;
import java.lang.Object;
import java.lang.String;

public interface ISimpleRpc$Gateway$JMAsyncClient extends ISimpleRpc {
  @WithContext
  IPromise<String> helloJMAsync(String name, Object context);

  IPromise<String> helloJMAsync(String name);

  @WithContext
  IPromise<String> hiJMAsync(Person p, Object context);

  IPromise<String> hiJMAsync(Person p);
}
