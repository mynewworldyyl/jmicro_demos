package cn.expjmicro.example.api.genclient;

import cn.expjmicro.example.api.ITestRpcService;
import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import cn.jmicro.api.test.Person;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;

public interface ITestRpcService$Gateway$JMAsyncClient extends ITestRpcService {
  @WithContext
  IPromise<Person> getPersonJMAsync(Person p, Object context);

  IPromise<Person> getPersonJMAsync(Person p);

  @WithContext
  IPromise<Void> pushMessageJMAsync(String msg, Object context);

  IPromise<Void> pushMessageJMAsync(String msg);

  @WithContext
  IPromise<String> helloJMAsync(String name, Object context);

  IPromise<String> helloJMAsync(String name);

  @WithContext
  IPromise<Integer> testReturnPrimitiveResultJMAsync(Object context);

  IPromise<Integer> testReturnPrimitiveResultJMAsync();

  @WithContext
  IPromise<int[]> testReturnPrimitiveArrayResultJMAsync(Object context);

  IPromise<int[]> testReturnPrimitiveArrayResultJMAsync();

  @WithContext
  IPromise<Boolean> testReturnBooleanResultJMAsync(Object context);

  IPromise<Boolean> testReturnBooleanResultJMAsync();

  @WithContext
  IPromise<Boolean> testReturnPrimitiveBooleanResultJMAsync(Object context);

  IPromise<Boolean> testReturnPrimitiveBooleanResultJMAsync();
}
