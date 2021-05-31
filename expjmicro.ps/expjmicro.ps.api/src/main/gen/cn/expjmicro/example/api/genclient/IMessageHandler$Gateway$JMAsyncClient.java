package cn.expjmicro.example.api.genclient;

import cn.expjmicro.example.api.IMessageHandler;
import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import cn.jmicro.api.net.Message;
import java.lang.Object;
import java.lang.Void;

public interface IMessageHandler$Gateway$JMAsyncClient extends IMessageHandler {
  @WithContext
  IPromise<Void> onMessageJMAsync(Message msg, Object context);

  IPromise<Void> onMessageJMAsync(Message msg);
}
