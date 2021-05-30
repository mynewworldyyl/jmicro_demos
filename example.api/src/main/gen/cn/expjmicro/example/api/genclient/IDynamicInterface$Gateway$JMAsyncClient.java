package cn.expjmicro.example.api.genclient;

import cn.expjmicro.example.api.IDynamicInterface;
import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;

public interface IDynamicInterface$Gateway$JMAsyncClient extends IDynamicInterface {
  @WithContext
  IPromise<Void> runJMAsync(String data, Object context);

  IPromise<Void> runJMAsync(String data);
}
