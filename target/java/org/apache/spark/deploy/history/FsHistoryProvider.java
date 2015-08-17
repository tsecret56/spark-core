package org.apache.spark.deploy.history;
/**
 * A class that provides application history from event logs stored in the file system.
 * This provider checks for new finished applications in the background periodically and
 * renders the history application UI by parsing the associated event logs.
 */
  class FsHistoryProvider extends org.apache.spark.deploy.history.ApplicationHistoryProvider implements org.apache.spark.Logging {
  static public  java.lang.String DEFAULT_LOG_DIR () { throw new RuntimeException(); }
  static public  java.lang.String LOG_PREFIX () { throw new RuntimeException(); }
  static public  java.lang.String SPARK_VERSION_PREFIX () { throw new RuntimeException(); }
  static public  java.lang.String COMPRESSION_CODEC_PREFIX () { throw new RuntimeException(); }
  static public  java.lang.String APPLICATION_COMPLETE () { throw new RuntimeException(); }
  public   FsHistoryProvider (org.apache.spark.SparkConf conf, org.apache.spark.util.Clock clock) { throw new RuntimeException(); }
  public   FsHistoryProvider (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  private  java.lang.String NOT_STARTED () { throw new RuntimeException(); }
  private  long UPDATE_INTERVAL_S () { throw new RuntimeException(); }
  private  long CLEAN_INTERVAL_S () { throw new RuntimeException(); }
  private  java.lang.String logDir () { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fs () { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledExecutorService pool () { throw new RuntimeException(); }
  private  long lastModifiedTime () { throw new RuntimeException(); }
  private  scala.collection.mutable.LinkedHashMap<java.lang.String, org.apache.spark.deploy.history.FsApplicationHistoryInfo> applications () { throw new RuntimeException(); }
  private  scala.collection.mutable.ListBuffer<org.apache.spark.deploy.history.FsApplicationAttemptInfo> attemptsToClean () { throw new RuntimeException(); }
  /**
   * Return a runnable that performs the given operation on the event logs.
   * This operation is expected to be executed periodically.
   * @param operateFun (undocumented)
   * @return (undocumented)
   */
  private  java.lang.Runnable getRunner (scala.Function0<scala.runtime.BoxedUnit> operateFun) { throw new RuntimeException(); }
  /**
   * An Executor to fetch and parse log files.
   * @return (undocumented)
   */
  private  java.util.concurrent.ExecutorService replayExecutor () { throw new RuntimeException(); }
  private  void initialize () { throw new RuntimeException(); }
  public  scala.collection.Iterable<org.apache.spark.deploy.history.FsApplicationHistoryInfo> getListing () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.ui.SparkUI> getAppUI (java.lang.String appId, scala.Option<java.lang.String> attemptId) { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getConfig () { throw new RuntimeException(); }
  /**
   * Builds the application list based on the current contents of the log directory.
   * Tries to reuse as much of the data already in memory as possible, by not reading
   * applications that haven't been updated since last time the logs were checked.
   */
    void checkForLogs () { throw new RuntimeException(); }
  /**
   * Replay the log files in the list and merge the list of old applications with new ones
   * @param logs (undocumented)
   */
  private  void mergeApplicationListing (scala.collection.Seq<org.apache.hadoop.fs.FileStatus> logs) { throw new RuntimeException(); }
  /**
   * Delete event logs from the log directory according to the clean policy defined by the user.
   */
    void cleanLogs () { throw new RuntimeException(); }
  /**
   * Comparison function that defines the sort order for the application listing.
   * <p>
   * @return Whether <code>i1</code> should precede <code>i2</code>.
   * @param i1 (undocumented)
   * @param i2 (undocumented)
   */
  private  boolean compareAppInfo (org.apache.spark.deploy.history.FsApplicationHistoryInfo i1, org.apache.spark.deploy.history.FsApplicationHistoryInfo i2) { throw new RuntimeException(); }
  /**
   * Comparison function that defines the sort order for application attempts within the same
   * application. Order is: running attempts before complete attempts, running attempts sorted
   * by start time, completed attempts sorted by end time.
   * <p>
   * Normally applications should have a single running attempt; but failure to call sc.stop()
   * may cause multiple running attempts to show up.
   * <p>
   * @return Whether <code>a1</code> should precede <code>a2</code>.
   * @param a1 (undocumented)
   * @param a2 (undocumented)
   */
  private  boolean compareAttemptInfo (org.apache.spark.deploy.history.FsApplicationAttemptInfo a1, org.apache.spark.deploy.history.FsApplicationAttemptInfo a2) { throw new RuntimeException(); }
  /**
   * Replays the events in the specified log file and returns information about the associated
   * application. Return <code>None</code> if the application ID cannot be located.
   * @param eventLog (undocumented)
   * @param bus (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<org.apache.spark.deploy.history.FsApplicationAttemptInfo> replay (org.apache.hadoop.fs.FileStatus eventLog, org.apache.spark.scheduler.ReplayListenerBus bus) { throw new RuntimeException(); }
  /**
   * Loads a legacy log directory. This assumes that the log directory contains a single event
   * log file (along with other metadata files), which is the case for directories generated by
   * the code in previous releases.
   * <p>
   * @return input stream that holds one JSON record per line.
   * @param dir (undocumented)
   */
    java.io.InputStream openLegacyEventLog (org.apache.hadoop.fs.Path dir) { throw new RuntimeException(); }
  /**
   * Return whether the specified event log path contains a old directory-based event log.
   * Previously, the event log of an application comprises of multiple files in a directory.
   * As of Spark 1.3, these files are consolidated into a single one that replaces the directory.
   * See SPARK-2261 for more detail.
   * @param entry (undocumented)
   * @return (undocumented)
   */
  private  boolean isLegacyLogDirectory (org.apache.hadoop.fs.FileStatus entry) { throw new RuntimeException(); }
  /**
   * Returns the modification time of the given event log. If the status points at an empty
   * directory, <code>None</code> is returned, indicating that there isn't an event log at that location.
   * @param fsEntry (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<java.lang.Object> getModificationTime (org.apache.hadoop.fs.FileStatus fsEntry) { throw new RuntimeException(); }
  /**
   * Return true when the application has completed.
   * @param entry (undocumented)
   * @return (undocumented)
   */
  private  boolean isApplicationCompleted (org.apache.hadoop.fs.FileStatus entry) { throw new RuntimeException(); }
  /**
   * Returns whether the version of Spark that generated logs records app IDs. App IDs were added
   * in Spark 1.1.
   * @param entry (undocumented)
   * @return (undocumented)
   */
  private  boolean sparkVersionHasAppId (org.apache.hadoop.fs.FileStatus entry) { throw new RuntimeException(); }
}
