package cn.expjmicro.example.api.rpc.genclient;

import cn.expjmicro.example.api.rpc.IRpcA;
import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import java.lang.Object;
import java.lang.String;

public interface IRpcA$Gateway$JMAsyncClient extends IRpcA {
  @WithContext
  IPromise<String> invokeRpcAJMAsync(String aargs, Object context);

  IPromise<String> invokeRpcAJMAsync(String aargs);
}
