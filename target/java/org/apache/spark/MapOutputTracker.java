package org.apache.spark;
/**
 * Class that keeps track of the location of the map output of
 * a stage. This is abstract because different versions of MapOutputTracker
 * (driver and executor) use different HashMap to store its metadata.
 */
 abstract class MapOutputTracker implements org.apache.spark.Logging {
  static public  java.lang.String ENDPOINT_NAME () { throw new RuntimeException(); }
  static public  byte[] serializeMapStatuses (org.apache.spark.scheduler.MapStatus[] statuses) { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.MapStatus[] deserializeMapStatuses (byte[] bytes) { throw new RuntimeException(); }
  static private  scala.Tuple2<org.apache.spark.storage.BlockManagerId, java.lang.Object>[] convertMapStatuses (int shuffleId, int reduceId, org.apache.spark.scheduler.MapStatus[] statuses) { throw new RuntimeException(); }
  public   MapOutputTracker (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  /** Set to the MapOutputTrackerMasterEndpoint living on the driver. */
  public  org.apache.spark.rpc.RpcEndpointRef trackerEndpoint () { throw new RuntimeException(); }
  /**
   * This HashMap has different behavior for the driver and the executors.
   * <p>
   * On the driver, it serves as the source of map outputs recorded from ShuffleMapTasks.
   * On the executors, it simply serves as a cache, in which a miss triggers a fetch from the
   * driver's corresponding HashMap.
   * <p>
   * Note: because mapStatuses is accessed concurrently, subclasses should make sure it's a
   * thread-safe map.
   * @return (undocumented)
   */
  protected abstract  scala.collection.mutable.Map<java.lang.Object, org.apache.spark.scheduler.MapStatus[]> mapStatuses () ;
  /**
   * Incremented every time a fetch fails so that client nodes know to clear
   * their cache of map output locations if this happens.
   * @return (undocumented)
   */
  protected  long epoch () { throw new RuntimeException(); }
  protected  java.lang.Object epochLock () { throw new RuntimeException(); }
  /** Remembers which map output locations are currently being fetched on an executor. */
  private  scala.collection.mutable.HashSet<java.lang.Object> fetching () { throw new RuntimeException(); }
  /**
   * Send a message to the trackerEndpoint and get its result within a default timeout, or
   * throw a SparkException if this fails.
   * @param message (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  protected <T extends java.lang.Object> T askTracker (Object message, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  /** Send a one-way message to the trackerEndpoint, to which we expect it to reply with true. */
  protected  void sendTracker (Object message) { throw new RuntimeException(); }
  /**
   * Called from executors to get the server URIs and output sizes of the map outputs of
   * a given shuffle.
   * @param shuffleId (undocumented)
   * @param reduceId (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple2<org.apache.spark.storage.BlockManagerId, java.lang.Object>[] getServerStatuses (int shuffleId, int reduceId) { throw new RuntimeException(); }
  /** Called to get current epoch number. */
  public  long getEpoch () { throw new RuntimeException(); }
  /**
   * Called from executors to update the epoch number, potentially clearing old outputs
   * because of a fetch failure. Each executor task calls this with the latest epoch
   * number on the driver at the time it was created.
   * @param newEpoch (undocumented)
   */
  public  void updateEpoch (long newEpoch) { throw new RuntimeException(); }
  /** Unregister shuffle data. */
  public  void unregisterShuffle (int shuffleId) { throw new RuntimeException(); }
  /** Stop the tracker. */
  public  void stop () { throw new RuntimeException(); }
}
