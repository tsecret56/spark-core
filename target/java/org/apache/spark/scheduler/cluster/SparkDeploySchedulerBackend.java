package org.apache.spark.scheduler.cluster;
  class SparkDeploySchedulerBackend extends org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend implements org.apache.spark.deploy.client.AppClientListener, org.apache.spark.Logging {
  // not preceding
  public   SparkDeploySchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.SparkContext sc, java.lang.String[] masters) { throw new RuntimeException(); }
  private  org.apache.spark.deploy.client.AppClient client () { throw new RuntimeException(); }
  private  boolean stopping () { throw new RuntimeException(); }
  public  scala.Function1<org.apache.spark.scheduler.cluster.SparkDeploySchedulerBackend, scala.runtime.BoxedUnit> shutdownCallback () { throw new RuntimeException(); }
  private  java.lang.String appId () { throw new RuntimeException(); }
  private  java.util.concurrent.Semaphore registrationBarrier () { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> maxCores () { throw new RuntimeException(); }
  private  int totalExpectedCores () { throw new RuntimeException(); }
  public  void start () { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
  public  void connected (java.lang.String appId) { throw new RuntimeException(); }
  public  void disconnected () { throw new RuntimeException(); }
  public  void dead (java.lang.String reason) { throw new RuntimeException(); }
  public  void executorAdded (java.lang.String fullId, java.lang.String workerId, java.lang.String hostPort, int cores, int memory) { throw new RuntimeException(); }
  public  void executorRemoved (java.lang.String fullId, java.lang.String message, scala.Option<java.lang.Object> exitStatus) { throw new RuntimeException(); }
  public  boolean sufficientResourcesRegistered () { throw new RuntimeException(); }
  public  java.lang.String applicationId () { throw new RuntimeException(); }
  private  void waitForRegistration () { throw new RuntimeException(); }
  private  void notifyContext () { throw new RuntimeException(); }
}
