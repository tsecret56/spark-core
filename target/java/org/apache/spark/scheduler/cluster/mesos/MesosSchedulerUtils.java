package org.apache.spark.scheduler.cluster.mesos;
/**
 * Shared trait for implementing a Mesos Scheduler. This holds common state and helper
 * methods and Mesos scheduler will use.
 */
  interface MesosSchedulerUtils extends org.apache.spark.Logging {
  public  java.util.concurrent.CountDownLatch registerLatch () ;
  public  org.apache.mesos.MesosSchedulerDriver mesosDriver () ;
  /**
   * Starts the MesosSchedulerDriver with the provided information. This method returns
   * only after the scheduler has registered with Mesos.
   * @param masterUrl Mesos master connection URL
   * @param scheduler Scheduler object
   * @param fwInfo FrameworkInfo to pass to the Mesos master
   */
  public  void startScheduler (java.lang.String masterUrl, org.apache.mesos.Scheduler scheduler, org.apache.mesos.Protos.FrameworkInfo fwInfo) ;
  /**
   * Signal that the scheduler has registered with Mesos.
   */
  public  void markRegistered () ;
  /**
   * Get the amount of resources for the specified type from the resource list
   * @param res (undocumented)
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  double getResource (java.util.List<org.apache.mesos.Protos.Resource> res, java.lang.String name) ;
}
