package cn.expjmicro.example.api.rpc.genclient;

import cn.expjmicro.example.api.rpc.IAsyncRpcCallback;
import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;

public interface IAsyncRpcCallback$Gateway$JMAsyncClient extends IAsyncRpcCallback {
  @WithContext
  IPromise<Void> callbackJMAsync(String name, Object context);

  IPromise<Void> callbackJMAsync(String name);
}
