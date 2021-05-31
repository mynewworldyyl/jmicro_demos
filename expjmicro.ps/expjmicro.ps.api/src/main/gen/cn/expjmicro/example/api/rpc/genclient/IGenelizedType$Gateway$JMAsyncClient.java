package cn.expjmicro.example.api.rpc.genclient;

import cn.expjmicro.example.api.rpc.IGenelizedType;
import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import java.lang.Object;

public interface IGenelizedType$Gateway$JMAsyncClient extends IGenelizedType {
  @WithContext
  IPromise<byte[]> downResourceDataJMAsync(int downloadId, int blockNum, Object context);

  IPromise<byte[]> downResourceDataJMAsync(int downloadId, int blockNum);
}
