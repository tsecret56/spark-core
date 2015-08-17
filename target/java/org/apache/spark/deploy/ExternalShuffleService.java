package org.apache.spark.deploy;
/**
 * Provides a server from which Executors can read shuffle files (rather than reading directly from
 * each other), to provide uninterrupted access to the files in the face of executors being turned
 * off or killed.
 * <p>
 * Optionally requires SASL authentication in order to read. See {@link SecurityManager}.
 */
  class ExternalShuffleService implements org.apache.spark.Logging {
  static private  java.util.concurrent.CountDownLatch barrier () { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args) { throw new RuntimeException(); }
  static private  void installShutdownHook () { throw new RuntimeException(); }
  public   ExternalShuffleService (org.apache.spark.SparkConf sparkConf, org.apache.spark.SecurityManager securityManager) { throw new RuntimeException(); }
  private  boolean enabled () { throw new RuntimeException(); }
  private  int port () { throw new RuntimeException(); }
  private  boolean useSasl () { throw new RuntimeException(); }
  private  org.apache.spark.network.util.TransportConf transportConf () { throw new RuntimeException(); }
  private  org.apache.spark.network.shuffle.ExternalShuffleBlockHandler blockHandler () { throw new RuntimeException(); }
  private  org.apache.spark.network.TransportContext transportContext () { throw new RuntimeException(); }
  private  org.apache.spark.network.server.TransportServer server () { throw new RuntimeException(); }
  /** Starts the external shuffle service if the user has configured us to. */
  public  void startIfEnabled () { throw new RuntimeException(); }
  /** Start the external shuffle service */
  public  void start () { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
}
