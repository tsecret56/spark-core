package org.apache.spark.deploy.master;
  class Master implements akka.actor.Actor, org.apache.spark.util.ActorLogReceive, org.apache.spark.Logging, org.apache.spark.deploy.master.LeaderElectable {
  static public  java.lang.String systemName () { throw new RuntimeException(); }
  static private  java.lang.String actorName () { throw new RuntimeException(); }
  static public  void main (java.lang.String[] argStrings) { throw new RuntimeException(); }
  /**
   * Returns an <code>akka.tcp://...</code> URL for the Master actor given a sparkUrl <code>spark://host:port</code>.
   * <p>
   * @throws SparkException if the url is invalid
   * @param sparkUrl (undocumented)
   * @param protocol (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String toAkkaUrl (java.lang.String sparkUrl, java.lang.String protocol) { throw new RuntimeException(); }
  /**
   * Returns an akka <code>Address</code> for the Master actor given a sparkUrl <code>spark://host:port</code>.
   * <p>
   * @throws SparkException if the url is invalid
   * @param sparkUrl (undocumented)
   * @param protocol (undocumented)
   * @return (undocumented)
   */
  static public  akka.actor.Address toAkkaAddress (java.lang.String sparkUrl, java.lang.String protocol) { throw new RuntimeException(); }
  /**
   * Start the Master and return a four tuple of:
   *   (1) The Master actor system
   *   (2) The bound port
   *   (3) The web UI bound port
   *   (4) The REST server bound port, if any
   * @param host (undocumented)
   * @param port (undocumented)
   * @param webUiPort (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  scala.Tuple4<akka.actor.ActorSystem, java.lang.Object, java.lang.Object, scala.Option<java.lang.Object>> startSystemAndActor (java.lang.String host, int port, int webUiPort, org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityMgr () { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
  // not preceding
  public   Master (java.lang.String host, int port, int webUiPort, org.apache.spark.SecurityManager securityMgr, org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration hadoopConf () { throw new RuntimeException(); }
  private  java.text.SimpleDateFormat createDateFormat () { throw new RuntimeException(); }
  private  long WORKER_TIMEOUT () { throw new RuntimeException(); }
  private  int RETAINED_APPLICATIONS () { throw new RuntimeException(); }
  private  int RETAINED_DRIVERS () { throw new RuntimeException(); }
  private  int REAPER_ITERATIONS () { throw new RuntimeException(); }
  private  java.lang.String RECOVERY_MODE () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<org.apache.spark.deploy.master.WorkerInfo> workers () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.deploy.master.ApplicationInfo> idToApp () { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.deploy.master.ApplicationInfo> waitingApps () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<org.apache.spark.deploy.master.ApplicationInfo> apps () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.deploy.master.WorkerInfo> idToWorker () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<akka.actor.Address, org.apache.spark.deploy.master.WorkerInfo> addressToWorker () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<akka.actor.ActorRef, org.apache.spark.deploy.master.ApplicationInfo> actorToApp () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<akka.actor.Address, org.apache.spark.deploy.master.ApplicationInfo> addressToApp () { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.deploy.master.ApplicationInfo> completedApps () { throw new RuntimeException(); }
  private  int nextAppNumber () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.ui.SparkUI> appIdToUI () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<org.apache.spark.deploy.master.DriverInfo> drivers () { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.deploy.master.DriverInfo> completedDrivers () { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.deploy.master.DriverInfo> waitingDrivers () { throw new RuntimeException(); }
  private  int nextDriverNumber () { throw new RuntimeException(); }
  private  org.apache.spark.metrics.MetricsSystem masterMetricsSystem () { throw new RuntimeException(); }
  private  org.apache.spark.metrics.MetricsSystem applicationMetricsSystem () { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.MasterSource masterSource () { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.ui.MasterWebUI webUi () { throw new RuntimeException(); }
  private  java.lang.String masterPublicAddress () { throw new RuntimeException(); }
  private  java.lang.String masterUrl () { throw new RuntimeException(); }
  private  java.lang.String masterWebUiUrl () { throw new RuntimeException(); }
  private  scala.Enumeration.Value state () { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.PersistenceEngine persistenceEngine () { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.LeaderElectionAgent leaderElectionAgent () { throw new RuntimeException(); }
  private  akka.actor.Cancellable recoveryCompletionTask () { throw new RuntimeException(); }
  private  boolean spreadOutApps () { throw new RuntimeException(); }
  private  int defaultCores () { throw new RuntimeException(); }
  private  boolean restServerEnabled () { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.deploy.rest.StandaloneRestServer> restServer () { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> restServerBoundPort () { throw new RuntimeException(); }
  public  void preStart () { throw new RuntimeException(); }
  public  void preRestart (java.lang.Throwable reason, scala.Option<java.lang.Object> message) { throw new RuntimeException(); }
  public  void postStop () { throw new RuntimeException(); }
  public  void electedLeader () { throw new RuntimeException(); }
  public  void revokedLeadership () { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveWithLogging () { throw new RuntimeException(); }
  private  boolean canCompleteRecovery () { throw new RuntimeException(); }
  private  void beginRecovery (scala.collection.Seq<org.apache.spark.deploy.master.ApplicationInfo> storedApps, scala.collection.Seq<org.apache.spark.deploy.master.DriverInfo> storedDrivers, scala.collection.Seq<org.apache.spark.deploy.master.WorkerInfo> storedWorkers) { throw new RuntimeException(); }
  private  void completeRecovery () { throw new RuntimeException(); }
  /**
   * Schedule executors to be launched on the workers.
   * <p>
   * There are two modes of launching executors. The first attempts to spread out an application's
   * executors on as many workers as possible, while the second does the opposite (i.e. launch them
   * on as few workers as possible). The former is usually better for data locality purposes and is
   * the default.
   * <p>
   * The number of cores assigned to each executor is configurable. When this is explicitly set,
   * multiple executors from the same application may be launched on the same worker if the worker
   * has enough cores and memory. Otherwise, each executor grabs all the cores available on the
   * worker by default, in which case only one executor may be launched on each worker.
   */
  private  void startExecutorsOnWorkers () { throw new RuntimeException(); }
  /**
   * Allocate a worker's resources to one or more executors.
   * @param app the info of the application which the executors belong to
   * @param coresToAllocate cores on this worker to be allocated to this application
   * @param worker the worker info
   */
  private  void allocateWorkerResourceToExecutors (org.apache.spark.deploy.master.ApplicationInfo app, int coresToAllocate, org.apache.spark.deploy.master.WorkerInfo worker) { throw new RuntimeException(); }
  /**
   * Schedule the currently available resources among waiting apps. This method will be called
   * every time a new app joins or resource availability changes.
   */
  private  void schedule () { throw new RuntimeException(); }
  private  void launchExecutor (org.apache.spark.deploy.master.WorkerInfo worker, org.apache.spark.deploy.master.ExecutorDesc exec) { throw new RuntimeException(); }
  private  boolean registerWorker (org.apache.spark.deploy.master.WorkerInfo worker) { throw new RuntimeException(); }
  private  void removeWorker (org.apache.spark.deploy.master.WorkerInfo worker) { throw new RuntimeException(); }
  private  void relaunchDriver (org.apache.spark.deploy.master.DriverInfo driver) { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.ApplicationInfo createApplication (org.apache.spark.deploy.ApplicationDescription desc, akka.actor.ActorRef driver) { throw new RuntimeException(); }
  private  void registerApplication (org.apache.spark.deploy.master.ApplicationInfo app) { throw new RuntimeException(); }
  private  void finishApplication (org.apache.spark.deploy.master.ApplicationInfo app) { throw new RuntimeException(); }
  public  void removeApplication (org.apache.spark.deploy.master.ApplicationInfo app, scala.Enumeration.Value state) { throw new RuntimeException(); }
  /**
   * Rebuild a new SparkUI from the given application's event logs.
   * Return the UI if successful, else None
   * @param app (undocumented)
   * @return (undocumented)
   */
    scala.Option<org.apache.spark.ui.SparkUI> rebuildSparkUI (org.apache.spark.deploy.master.ApplicationInfo app) { throw new RuntimeException(); }
  /** Generate a new app ID given a app's submission date */
  private  java.lang.String newApplicationId (java.util.Date submitDate) { throw new RuntimeException(); }
  /** Check for, and remove, any timed-out workers */
  private  void timeOutDeadWorkers () { throw new RuntimeException(); }
  private  java.lang.String newDriverId (java.util.Date submitDate) { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.DriverInfo createDriver (org.apache.spark.deploy.DriverDescription desc) { throw new RuntimeException(); }
  private  void launchDriver (org.apache.spark.deploy.master.WorkerInfo worker, org.apache.spark.deploy.master.DriverInfo driver) { throw new RuntimeException(); }
  private  void removeDriver (java.lang.String driverId, scala.Enumeration.Value finalState, scala.Option<java.lang.Exception> exception) { throw new RuntimeException(); }
}
