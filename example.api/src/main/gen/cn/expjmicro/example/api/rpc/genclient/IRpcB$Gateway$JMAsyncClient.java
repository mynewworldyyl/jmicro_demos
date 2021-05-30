package cn.expjmicro.example.api.rpc.genclient;

import cn.expjmicro.example.api.rpc.IRpcB;
import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import java.lang.Object;
import java.lang.String;

public interface IRpcB$Gateway$JMAsyncClient extends IRpcB {
  @WithContext
  IPromise<String> invokeRpcBJMAsync(String bargs, Object context);

  IPromise<String> invokeRpcBJMAsync(String bargs);
}
