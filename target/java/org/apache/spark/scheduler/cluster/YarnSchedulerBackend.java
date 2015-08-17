package org.apache.spark.scheduler.cluster;
/**
 * Abstract Yarn scheduler backend that contains common logic
 * between the client and cluster Yarn scheduler backends.
 */
 abstract class YarnSchedulerBackend extends org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend {
  /**
   * An {@link RpcEndpoint} that communicates with the ApplicationMaster.
   */
  private  class YarnSchedulerEndpoint implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.Logging {
    public  org.apache.spark.rpc.RpcEnv rpcEnv () { throw new RuntimeException(); }
    // not preceding
    public   YarnSchedulerEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv) { throw new RuntimeException(); }
    private  scala.Option<org.apache.spark.rpc.RpcEndpointRef> amEndpoint () { throw new RuntimeException(); }
    private  java.util.concurrent.ThreadPoolExecutor askAmThreadPool () { throw new RuntimeException(); }
    public  scala.concurrent.ExecutionContextExecutor askAmExecutor () { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive () { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context) { throw new RuntimeException(); }
    public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress) { throw new RuntimeException(); }
    public  void onStop () { throw new RuntimeException(); }
  }
  static public  java.lang.String ENDPOINT_NAME () { throw new RuntimeException(); }
  public   YarnSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  protected  int totalExpectedExecutors () { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef yarnSchedulerEndpoint () { throw new RuntimeException(); }
  private  scala.concurrent.duration.FiniteDuration askTimeout () { throw new RuntimeException(); }
  /**
   * Request executors from the ApplicationMaster by specifying the total number desired.
   * This includes executors already pending or running.
   * @param requestedTotal (undocumented)
   * @return (undocumented)
   */
  public  boolean doRequestTotalExecutors (int requestedTotal) { throw new RuntimeException(); }
  /**
   * Request that the ApplicationMaster kill the specified executors.
   * @param executorIds (undocumented)
   * @return (undocumented)
   */
  public  boolean doKillExecutors (scala.collection.Seq<java.lang.String> executorIds) { throw new RuntimeException(); }
  public  boolean sufficientResourcesRegistered () { throw new RuntimeException(); }
  /**
   * Add filters to the SparkUI.
   * @param filterName (undocumented)
   * @param filterParams (undocumented)
   * @param proxyBase (undocumented)
   */
  private  void addWebUIFilter (java.lang.String filterName, scala.collection.immutable.Map<java.lang.String, java.lang.String> filterParams, java.lang.String proxyBase) { throw new RuntimeException(); }
}
