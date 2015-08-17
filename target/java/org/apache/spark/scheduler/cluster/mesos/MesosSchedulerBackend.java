package org.apache.spark.scheduler.cluster.mesos;
/**
 * A SchedulerBackend for running fine-grained tasks on Mesos. Each Spark task is mapped to a
 * separate Mesos task, allowing multiple applications to share cluster nodes both in space (tasks
 * from multiple apps can run on different cores) and in time (a core can switch ownership).
 */
  class MesosSchedulerBackend implements org.apache.spark.scheduler.SchedulerBackend, org.apache.mesos.Scheduler, org.apache.spark.scheduler.cluster.mesos.MesosSchedulerUtils {
  // not preceding
  public   MesosSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.SparkContext sc, java.lang.String master) { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<java.lang.String> slaveIdsWithExecutors () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, java.lang.String> taskIdToSlaveId () { throw new RuntimeException(); }
  public  byte[] execArgs () { throw new RuntimeException(); }
  public  java.lang.ClassLoader classLoader () { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.LiveListenerBus listenerBus () { throw new RuntimeException(); }
  public  double mesosExecutorCores () { throw new RuntimeException(); }
  public  java.lang.String appId () { throw new RuntimeException(); }
  public  void start () { throw new RuntimeException(); }
  public  org.apache.mesos.Protos.ExecutorInfo createExecutorInfo (java.lang.String execId) { throw new RuntimeException(); }
  /**
   * Create and serialize the executor argument to pass to Mesos. Our executor arg is an array
   * containing all the spark.* system properties in the form of (String, String) pairs.
   * @return (undocumented)
   */
  private  byte[] createExecArg () { throw new RuntimeException(); }
  public  void offerRescinded (org.apache.mesos.SchedulerDriver d, org.apache.mesos.Protos.OfferID o) { throw new RuntimeException(); }
  public  void registered (org.apache.mesos.SchedulerDriver d, org.apache.mesos.Protos.FrameworkID frameworkId, org.apache.mesos.Protos.MasterInfo masterInfo) { throw new RuntimeException(); }
  private  void inClassLoader (scala.Function0<scala.runtime.BoxedUnit> fun) { throw new RuntimeException(); }
  public  void disconnected (org.apache.mesos.SchedulerDriver d) { throw new RuntimeException(); }
  public  void reregistered (org.apache.mesos.SchedulerDriver d, org.apache.mesos.Protos.MasterInfo masterInfo) { throw new RuntimeException(); }
  /**
   * Method called by Mesos to offer resources on slaves. We respond by asking our active task sets
   * for tasks in order of priority. We fill each node with tasks in a round-robin manner so that
   * tasks are balanced across the cluster.
   * @param d (undocumented)
   * @param offers (undocumented)
   */
  public  void resourceOffers (org.apache.mesos.SchedulerDriver d, java.util.List<org.apache.mesos.Protos.Offer> offers) { throw new RuntimeException(); }
  /** Turn a Spark TaskDescription into a Mesos task */
  public  org.apache.mesos.Protos.TaskInfo createMesosTask (org.apache.spark.scheduler.TaskDescription task, java.lang.String slaveId) { throw new RuntimeException(); }
  public  void statusUpdate (org.apache.mesos.SchedulerDriver d, org.apache.mesos.Protos.TaskStatus status) { throw new RuntimeException(); }
  public  void error (org.apache.mesos.SchedulerDriver d, java.lang.String message) { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
  public  void reviveOffers () { throw new RuntimeException(); }
  public  void frameworkMessage (org.apache.mesos.SchedulerDriver d, org.apache.mesos.Protos.ExecutorID e, org.apache.mesos.Protos.SlaveID s, byte[] b) { throw new RuntimeException(); }
  /**
   * Remove executor associated with slaveId in a thread safe manner.
   * @param slaveId (undocumented)
   * @param reason (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashSet<java.lang.String> removeExecutor (java.lang.String slaveId, java.lang.String reason) { throw new RuntimeException(); }
  private  void recordSlaveLost (org.apache.mesos.SchedulerDriver d, org.apache.mesos.Protos.SlaveID slaveId, org.apache.spark.scheduler.ExecutorLossReason reason) { throw new RuntimeException(); }
  public  void slaveLost (org.apache.mesos.SchedulerDriver d, org.apache.mesos.Protos.SlaveID slaveId) { throw new RuntimeException(); }
  public  void executorLost (org.apache.mesos.SchedulerDriver d, org.apache.mesos.Protos.ExecutorID executorId, org.apache.mesos.Protos.SlaveID slaveId, int status) { throw new RuntimeException(); }
  public  void killTask (long taskId, java.lang.String executorId, boolean interruptThread) { throw new RuntimeException(); }
  public  int defaultParallelism () { throw new RuntimeException(); }
  public  java.lang.String applicationId () { throw new RuntimeException(); }
}
