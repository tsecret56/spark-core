package org.apache.spark;
/**
 * Lives in the driver to receive heartbeats from executors..
 */
  class HeartbeatReceiver implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.Logging {
  static public  java.lang.String ENDPOINT_NAME () { throw new RuntimeException(); }
  public   HeartbeatReceiver (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv () { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskScheduler scheduler () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> executorLastSeen () { throw new RuntimeException(); }
  private  long slaveTimeoutMs () { throw new RuntimeException(); }
  private  long executorTimeoutMs () { throw new RuntimeException(); }
  private  long timeoutIntervalMs () { throw new RuntimeException(); }
  private  long checkTimeoutIntervalMs () { throw new RuntimeException(); }
  private  Object timeoutCheckingTask () { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledExecutorService eventLoopThread () { throw new RuntimeException(); }
  private  java.util.concurrent.ExecutorService killExecutorThread () { throw new RuntimeException(); }
  public  void onStart () { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive () { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context) { throw new RuntimeException(); }
  private  void expireDeadHosts () { throw new RuntimeException(); }
  public  void onStop () { throw new RuntimeException(); }
}
