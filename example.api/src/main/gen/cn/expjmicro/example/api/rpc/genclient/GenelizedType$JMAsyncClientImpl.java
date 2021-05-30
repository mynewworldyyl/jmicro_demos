package cn.expjmicro.example.api.rpc.genclient;

import cn.jmicro.api.annotation.WithContext;
import cn.jmicro.api.async.IPromise;
import cn.jmicro.api.objectfactory.AbstractClientServiceProxyHolder;
import java.lang.Object;

public class GenelizedType$JMAsyncClientImpl extends AbstractClientServiceProxyHolder implements IGenelizedType$JMAsyncClient {
  public IPromise<byte[]> downResourceDataJMAsync(int downloadId, int blockNum) {
    return  this.proxyHolder.invoke("downResourceDataJMAsync", null, downloadId,blockNum);
  }

  public byte[] downResourceData(int downloadId, int blockNum) {
    return (byte[]) this.proxyHolder.invoke("downResourceData",null, downloadId,blockNum);
  }

  @WithContext
  public IPromise<byte[]> downResourceDataJMAsync(int downloadId, int blockNum, Object context) {
    return this.proxyHolder.invoke("downResourceDataJMAsync",context, downloadId,blockNum);
  }
}
