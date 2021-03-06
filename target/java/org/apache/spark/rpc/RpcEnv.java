package org.apache.spark.rpc;
/**
 * An RPC environment. {@link RpcEndpoint}s need to register itself with a name to {@link RpcEnv} to
 * receives messages. Then {@link RpcEnv} will process messages sent from {@link RpcEndpointRef} or remote
 * nodes, and deliver them to corresponding {@link RpcEndpoint}s. For uncaught exceptions caught by
 * {@link RpcEnv}, {@link RpcEnv} will use {@link RpcCallContext.sendFailure} to send exceptions back to the
 * sender, or logging them if no such sender or <code>NotSerializableException</code>.
 * <p>
 * {@link RpcEnv} also provides some methods to retrieve {@link RpcEndpointRef}s given name or uri.
 */
 abstract class RpcEnv {
  static private  org.apache.spark.rpc.RpcEnvFactory getRpcEnvFactory (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  static public  org.apache.spark.rpc.RpcEnv create (java.lang.String name, java.lang.String host, int port, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager) { throw new RuntimeException(); }
  public   RpcEnv (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  scala.concurrent.duration.FiniteDuration defaultLookupTimeout () { throw new RuntimeException(); }
  /**
   * Return RpcEndpointRef of the registered {@link RpcEndpoint}. Will be used to implement
   * {@link RpcEndpoint.self}. Return <code>null</code> if the corresponding {@link RpcEndpointRef} does not exist.
   * @param endpoint (undocumented)
   * @return (undocumented)
   */
   abstract  org.apache.spark.rpc.RpcEndpointRef endpointRef (org.apache.spark.rpc.RpcEndpoint endpoint) ;
  /**
   * Return the address that {@link RpcEnv} is listening to.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.rpc.RpcAddress address () ;
  /**
   * Register a {@link RpcEndpoint} with a name and return its {@link RpcEndpointRef}. {@link RpcEnv} does not
   * guarantee thread-safety.
   * @param name (undocumented)
   * @param endpoint (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.rpc.RpcEndpointRef setupEndpoint (java.lang.String name, org.apache.spark.rpc.RpcEndpoint endpoint) ;
  /**
   * Retrieve the {@link RpcEndpointRef} represented by <code>uri</code> asynchronously.
   * @param uri (undocumented)
   * @return (undocumented)
   */
  public abstract  scala.concurrent.Future<org.apache.spark.rpc.RpcEndpointRef> asyncSetupEndpointRefByURI (java.lang.String uri) ;
  /**
   * Retrieve the {@link RpcEndpointRef} represented by <code>uri</code>. This is a blocking action.
   * @param uri (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rpc.RpcEndpointRef setupEndpointRefByURI (java.lang.String uri) { throw new RuntimeException(); }
  /**
   * Retrieve the {@link RpcEndpointRef} represented by <code>systemName</code>, <code>address</code> and <code>endpointName</code>
   * asynchronously.
   * @param systemName (undocumented)
   * @param address (undocumented)
   * @param endpointName (undocumented)
   * @return (undocumented)
   */
  public  scala.concurrent.Future<org.apache.spark.rpc.RpcEndpointRef> asyncSetupEndpointRef (java.lang.String systemName, org.apache.spark.rpc.RpcAddress address, java.lang.String endpointName) { throw new RuntimeException(); }
  /**
   * Retrieve the {@link RpcEndpointRef} represented by <code>systemName</code>, <code>address</code> and <code>endpointName</code>.
   * This is a blocking action.
   * @param systemName (undocumented)
   * @param address (undocumented)
   * @param endpointName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rpc.RpcEndpointRef setupEndpointRef (java.lang.String systemName, org.apache.spark.rpc.RpcAddress address, java.lang.String endpointName) { throw new RuntimeException(); }
  /**
   * Stop {@link RpcEndpoint} specified by <code>endpoint</code>.
   * @param endpoint (undocumented)
   */
  public abstract  void stop (org.apache.spark.rpc.RpcEndpointRef endpoint) ;
  /**
   * Shutdown this {@link RpcEnv} asynchronously. If need to make sure {@link RpcEnv} exits successfully,
   * call {@link awaitTermination()} straight after {@link shutdown()}.
   */
  public abstract  void shutdown () ;
  /**
   * Wait until {@link RpcEnv} exits.
   * <p>
   * TODO do we need a timeout parameter?
   */
  public abstract  void awaitTermination () ;
  /**
   * Create a URI used to create a {@link RpcEndpointRef}. Use this one to create the URI instead of
   * creating it manually because different {@link RpcEnv} may have different formats.
   * @param systemName (undocumented)
   * @param address (undocumented)
   * @param endpointName (undocumented)
   * @return (undocumented)
   */
  public abstract  java.lang.String uriOf (java.lang.String systemName, org.apache.spark.rpc.RpcAddress address, java.lang.String endpointName) ;
}
