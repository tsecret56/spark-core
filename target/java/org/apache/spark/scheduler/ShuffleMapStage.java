package org.apache.spark.scheduler;
/**
 * The ShuffleMapStage represents the intermediate stages in a job.
 */
  class ShuffleMapStage extends org.apache.spark.scheduler.Stage {
  public  Object shuffleDep () { throw new RuntimeException(); }
  // not preceding
  public   ShuffleMapStage (int id, org.apache.spark.rdd.RDD<?> rdd, int numTasks, scala.collection.immutable.List<org.apache.spark.scheduler.Stage> parents, int jobId, org.apache.spark.util.CallSite callSite, org.apache.spark.ShuffleDependency<?, ?, ?> shuffleDep) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  long numAvailableOutputs () { throw new RuntimeException(); }
  public  boolean isAvailable () { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.scheduler.MapStatus>[] outputLocs () { throw new RuntimeException(); }
  public  void addOutputLoc (int partition, org.apache.spark.scheduler.MapStatus status) { throw new RuntimeException(); }
  public  void removeOutputLoc (int partition, org.apache.spark.storage.BlockManagerId bmAddress) { throw new RuntimeException(); }
  /**
   * Removes all shuffle outputs associated with this executor. Note that this will also remove
   * outputs which are served by an external shuffle server (if one exists), as they are still
   * registered with this execId.
   * @param execId (undocumented)
   */
  public  void removeOutputsOnExecutor (java.lang.String execId) { throw new RuntimeException(); }
}
