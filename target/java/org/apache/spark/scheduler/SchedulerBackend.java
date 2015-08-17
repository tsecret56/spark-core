package org.apache.spark.scheduler;
/**
 * A backend interface for scheduling systems that allows plugging in different ones under
 * TaskSchedulerImpl. We assume a Mesos-like model where the application gets resource offers as
 * machines become available and can launch tasks on them.
 */
  interface SchedulerBackend {
  public  java.lang.String appId () ;
  public  void start () ;
  public  void stop () ;
  public  void reviveOffers () ;
  public  int defaultParallelism () ;
  public  void killTask (long taskId, java.lang.String executorId, boolean interruptThread) ;
  public  boolean isReady () ;
  /**
   * Get an application ID associated with the job.
   * <p>
   * @return An application ID
   */
  public  java.lang.String applicationId () ;
  /**
   * Get the attempt ID for this run, if the cluster manager supports multiple
   * attempts. Applications run in client mode will not have attempt IDs.
   * <p>
   * @return The application attempt id, if available.
   */
  public  scala.Option<java.lang.String> applicationAttemptId () ;
}
