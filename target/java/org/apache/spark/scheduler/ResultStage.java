package org.apache.spark.scheduler;
/**
 * The ResultStage represents the final stage in a job.
 */
  class ResultStage extends org.apache.spark.scheduler.Stage {
  public   ResultStage (int id, org.apache.spark.rdd.RDD<?> rdd, int numTasks, scala.collection.immutable.List<org.apache.spark.scheduler.Stage> parents, int jobId, org.apache.spark.util.CallSite callSite) { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.scheduler.ActiveJob> resultOfJob () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
