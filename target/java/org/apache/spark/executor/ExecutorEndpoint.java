package org.apache.spark.executor;
/**
 * {@link RpcEndpoint} that runs inside of executors to enable driver -> executor RPC.
 */
  class ExecutorEndpoint implements org.apache.spark.rpc.RpcEndpoint {
  static public  java.lang.String EXECUTOR_ENDPOINT_NAME () { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv () { throw new RuntimeException(); }
  // not preceding
  public   ExecutorEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, java.lang.String executorId) { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context) { throw new RuntimeException(); }
}
