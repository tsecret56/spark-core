package org.apache.spark.scheduler;
/**
 * The high-level scheduling layer that implements stage-oriented scheduling. It computes a DAG of
 * stages for each job, keeps track of which RDDs and stage outputs are materialized, and finds a
 * minimal schedule to run the job. It then submits stages as TaskSets to an underlying
 * TaskScheduler implementation that runs them on the cluster.
 * <p>
 * In addition to coming up with a DAG of stages, this class also determines the preferred
 * locations to run each task on, based on the current cache status, and passes these to the
 * low-level TaskScheduler. Furthermore, it handles failures due to shuffle output files being
 * lost, in which case old stages may need to be resubmitted. Failures *within* a stage that are
 * not caused by shuffle file loss are handled by the TaskScheduler, which will retry each task
 * a small number of times before cancelling the whole stage.
 * <p>
 * Here's a checklist to use when making or reviewing changes to this class:
 * <p>
 *  - When adding a new data structure, update <code>DAGSchedulerSuite.assertDataStructuresEmpty</code> to
 *    include the new structure. This will help to catch memory leaks.
 */
  class DAGScheduler implements org.apache.spark.Logging {
  static public  int RESUBMIT_TIMEOUT () { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc () { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskScheduler taskScheduler () { throw new RuntimeException(); }
  // not preceding
  public   DAGScheduler (org.apache.spark.SparkContext sc, org.apache.spark.scheduler.TaskScheduler taskScheduler, org.apache.spark.scheduler.LiveListenerBus listenerBus, org.apache.spark.MapOutputTrackerMaster mapOutputTracker, org.apache.spark.storage.BlockManagerMaster blockManagerMaster, org.apache.spark.SparkEnv env, org.apache.spark.util.Clock clock) { throw new RuntimeException(); }
  public   DAGScheduler (org.apache.spark.SparkContext sc, org.apache.spark.scheduler.TaskScheduler taskScheduler) { throw new RuntimeException(); }
  public   DAGScheduler (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  public  java.util.concurrent.atomic.AtomicInteger nextJobId () { throw new RuntimeException(); }
    int numTotalJobs () { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicInteger nextStageId () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, scala.collection.mutable.HashSet<java.lang.Object>> jobIdToStageIds () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.Stage> stageIdToStage () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.ShuffleMapStage> shuffleToMapStage () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.ActiveJob> jobIdToActiveJob () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<org.apache.spark.scheduler.Stage> waitingStages () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<org.apache.spark.scheduler.Stage> runningStages () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<org.apache.spark.scheduler.Stage> failedStages () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<org.apache.spark.scheduler.ActiveJob> activeJobs () { throw new RuntimeException(); }
  /**
   * Contains the locations that each RDD's partitions are cached on.  This map's keys are RDD ids
   * and its values are arrays indexed by partition numbers. Each array value is the set of
   * locations where that RDD partition is cached.
   * <p>
   * All accesses to this map should be guarded by synchronizing on it (see SPARK-4454).
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashMap<java.lang.Object, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>>> cacheLocs () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> failedEpoch () { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.OutputCommitCoordinator outputCommitCoordinator () { throw new RuntimeException(); }
  private  org.apache.spark.serializer.SerializerInstance closureSerializer () { throw new RuntimeException(); }
  /** If enabled, we may run certain actions like take() and first() locally. */
  private  boolean localExecutionEnabled () { throw new RuntimeException(); }
  /** If enabled, FetchFailed will not cause stage retry, in order to surface the problem. */
  private  boolean disallowStageRetryForTest () { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledExecutorService messageScheduler () { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.DAGSchedulerEventProcessLoop eventProcessLoop () { throw new RuntimeException(); }
  public  void taskStarted (org.apache.spark.scheduler.Task<?> task, org.apache.spark.scheduler.TaskInfo taskInfo) { throw new RuntimeException(); }
  public  void taskGettingResult (org.apache.spark.scheduler.TaskInfo taskInfo) { throw new RuntimeException(); }
  public  void taskEnded (org.apache.spark.scheduler.Task<?> task, org.apache.spark.TaskEndReason reason, Object result, scala.collection.mutable.Map<java.lang.Object, java.lang.Object> accumUpdates, org.apache.spark.scheduler.TaskInfo taskInfo, org.apache.spark.executor.TaskMetrics taskMetrics) { throw new RuntimeException(); }
  /**
   * Update metrics for in-progress tasks and let the master know that the BlockManager is still
   * alive. Return true if the driver knows about the given block manager. Otherwise, return false,
   * indicating that the block manager should re-register.
   * @param execId (undocumented)
   * @param taskMetrics (undocumented)
   * @param blockManagerId (undocumented)
   * @return (undocumented)
   */
  public  boolean executorHeartbeatReceived (java.lang.String execId, scala.Tuple4<java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.executor.TaskMetrics>[] taskMetrics, org.apache.spark.storage.BlockManagerId blockManagerId) { throw new RuntimeException(); }
  public  void executorLost (java.lang.String execId) { throw new RuntimeException(); }
  public  void executorAdded (java.lang.String execId, java.lang.String host) { throw new RuntimeException(); }
  public  void taskSetFailed (org.apache.spark.scheduler.TaskSet taskSet, java.lang.String reason) { throw new RuntimeException(); }
    scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> getCacheLocs (org.apache.spark.rdd.RDD<?> rdd) { throw new RuntimeException(); }
  private  void clearCacheLocs () { throw new RuntimeException(); }
  /**
   * Get or create a shuffle map stage for the given shuffle dependency's map side.
   * The jobId value passed in will be used if the stage doesn't already exist with
   * a lower jobId (jobId always increases across jobs.)
   * @param shuffleDep (undocumented)
   * @param jobId (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.scheduler.ShuffleMapStage getShuffleMapStage (org.apache.spark.ShuffleDependency<?, ?, ?> shuffleDep, int jobId) { throw new RuntimeException(); }
  /**
   * Helper function to eliminate some code re-use when creating new stages.
   * @param rdd (undocumented)
   * @param jobId (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<scala.collection.immutable.List<org.apache.spark.scheduler.Stage>, java.lang.Object> getParentStagesAndId (org.apache.spark.rdd.RDD<?> rdd, int jobId) { throw new RuntimeException(); }
  /**
   * Create a ShuffleMapStage as part of the (re)-creation of a shuffle map stage in
   * newOrUsedShuffleStage.  The stage will be associated with the provided jobId.
   * Production of shuffle map stages should always use newOrUsedShuffleStage, not
   * newShuffleMapStage directly.
   * @param rdd (undocumented)
   * @param numTasks (undocumented)
   * @param shuffleDep (undocumented)
   * @param jobId (undocumented)
   * @param callSite (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.scheduler.ShuffleMapStage newShuffleMapStage (org.apache.spark.rdd.RDD<?> rdd, int numTasks, org.apache.spark.ShuffleDependency<?, ?, ?> shuffleDep, int jobId, org.apache.spark.util.CallSite callSite) { throw new RuntimeException(); }
  /**
   * Create a ResultStage -- either directly for use as a result stage, or as part of the
   * (re)-creation of a shuffle map stage in newOrUsedShuffleStage.  The stage will be associated
   * with the provided jobId.
   * @param rdd (undocumented)
   * @param numTasks (undocumented)
   * @param jobId (undocumented)
   * @param callSite (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.scheduler.ResultStage newResultStage (org.apache.spark.rdd.RDD<?> rdd, int numTasks, int jobId, org.apache.spark.util.CallSite callSite) { throw new RuntimeException(); }
  /**
   * Create a shuffle map Stage for the given RDD.  The stage will also be associated with the
   * provided jobId.  If a stage for the shuffleId existed previously so that the shuffleId is
   * present in the MapOutputTracker, then the number and location of available outputs are
   * recovered from the MapOutputTracker
   * @param shuffleDep (undocumented)
   * @param jobId (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.scheduler.ShuffleMapStage newOrUsedShuffleStage (org.apache.spark.ShuffleDependency<?, ?, ?> shuffleDep, int jobId) { throw new RuntimeException(); }
  /**
   * Get or create the list of parent stages for a given RDD. The stages will be assigned the
   * provided jobId if they haven't already been created with a lower jobId.
   * @param rdd (undocumented)
   * @param jobId (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.immutable.List<org.apache.spark.scheduler.Stage> getParentStages (org.apache.spark.rdd.RDD<?> rdd, int jobId) { throw new RuntimeException(); }
  /** Find ancestor missing shuffle dependencies and register into shuffleToMapStage */
  private  void registerShuffleDependencies (org.apache.spark.ShuffleDependency<?, ?, ?> shuffleDep, int jobId) { throw new RuntimeException(); }
  /** Find ancestor shuffle dependencies that are not registered in shuffleToMapStage yet */
  private  scala.collection.mutable.Stack<org.apache.spark.ShuffleDependency<?, ?, ?>> getAncestorShuffleDependencies (org.apache.spark.rdd.RDD<?> rdd) { throw new RuntimeException(); }
  private  scala.collection.immutable.List<org.apache.spark.scheduler.Stage> getMissingParentStages (org.apache.spark.scheduler.Stage stage) { throw new RuntimeException(); }
  /**
   * Registers the given jobId among the jobs that need the given stage and
   * all of that stage's ancestors.
   * @param jobId (undocumented)
   * @param stage (undocumented)
   */
  private  void updateJobIdStageIdMaps (int jobId, org.apache.spark.scheduler.Stage stage) { throw new RuntimeException(); }
  /**
   * Removes state for job and any stages that are not needed by any other job.  Does not
   * handle cancelling tasks or notifying the SparkListener about finished jobs/stages/tasks.
   * <p>
   * @param job The job whose state to cleanup.
   */
  private  void cleanupStateForJobAndIndependentStages (org.apache.spark.scheduler.ActiveJob job) { throw new RuntimeException(); }
  /**
   * Submit a job to the job scheduler and get a JobWaiter object back. The JobWaiter object
   * can be used to block until the the job finishes executing or can be used to cancel the job.
   * @param rdd (undocumented)
   * @param func (undocumented)
   * @param partitions (undocumented)
   * @param callSite (undocumented)
   * @param allowLocal (undocumented)
   * @param resultHandler (undocumented)
   * @param properties (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object, U extends java.lang.Object> org.apache.spark.scheduler.JobWaiter<U> submitJob (org.apache.spark.rdd.RDD<T> rdd, scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<T>, U> func, scala.collection.Seq<java.lang.Object> partitions, org.apache.spark.util.CallSite callSite, boolean allowLocal, scala.Function2<java.lang.Object, U, scala.runtime.BoxedUnit> resultHandler, java.util.Properties properties) { throw new RuntimeException(); }
  public <T extends java.lang.Object, U extends java.lang.Object> void runJob (org.apache.spark.rdd.RDD<T> rdd, scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<T>, U> func, scala.collection.Seq<java.lang.Object> partitions, org.apache.spark.util.CallSite callSite, boolean allowLocal, scala.Function2<java.lang.Object, U, scala.runtime.BoxedUnit> resultHandler, java.util.Properties properties) { throw new RuntimeException(); }
  public <T extends java.lang.Object, U extends java.lang.Object, R extends java.lang.Object> org.apache.spark.partial.PartialResult<R> runApproximateJob (org.apache.spark.rdd.RDD<T> rdd, scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<T>, U> func, org.apache.spark.partial.ApproximateEvaluator<U, R> evaluator, org.apache.spark.util.CallSite callSite, long timeout, java.util.Properties properties) { throw new RuntimeException(); }
  /**
   * Cancel a job that is running or waiting in the queue.
   * @param jobId (undocumented)
   */
  public  void cancelJob (int jobId) { throw new RuntimeException(); }
  public  void cancelJobGroup (java.lang.String groupId) { throw new RuntimeException(); }
  /**
   * Cancel all jobs that are running or waiting in the queue.
   */
  public  void cancelAllJobs () { throw new RuntimeException(); }
    void doCancelAllJobs () { throw new RuntimeException(); }
  /**
   * Cancel all jobs associated with a running or scheduled stage.
   * @param stageId (undocumented)
   */
  public  void cancelStage (int stageId) { throw new RuntimeException(); }
  /**
   * Resubmit any failed stages. Ordinarily called after a small amount of time has passed since
   * the last fetch failure.
   */
    void resubmitFailedStages () { throw new RuntimeException(); }
  /**
   * Check for waiting or failed stages which are now eligible for resubmission.
   * Ordinarily run on every iteration of the event loop.
   */
  private  void submitWaitingStages () { throw new RuntimeException(); }
  /**
   * Run a job on an RDD locally, assuming it has only a single partition and no dependencies.
   * We run the operation in a separate thread just in case it takes a bunch of time, so that we
   * don't block the DAGScheduler event loop or other concurrent jobs.
   * @param job (undocumented)
   */
  protected  void runLocally (org.apache.spark.scheduler.ActiveJob job) { throw new RuntimeException(); }
  protected  void runLocallyWithinThread (org.apache.spark.scheduler.ActiveJob job) { throw new RuntimeException(); }
  /** Finds the earliest-created active job that needs the stage */
  private  scala.Option<java.lang.Object> activeJobForStage (org.apache.spark.scheduler.Stage stage) { throw new RuntimeException(); }
    void handleJobGroupCancelled (java.lang.String groupId) { throw new RuntimeException(); }
    void handleBeginEvent (org.apache.spark.scheduler.Task<?> task, org.apache.spark.scheduler.TaskInfo taskInfo) { throw new RuntimeException(); }
    void handleTaskSetFailed (org.apache.spark.scheduler.TaskSet taskSet, java.lang.String reason) { throw new RuntimeException(); }
    void cleanUpAfterSchedulerStop () { throw new RuntimeException(); }
    void handleGetTaskResult (org.apache.spark.scheduler.TaskInfo taskInfo) { throw new RuntimeException(); }
    void handleJobSubmitted (int jobId, org.apache.spark.rdd.RDD<?> finalRDD, scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<java.lang.Object>, ?> func, int[] partitions, boolean allowLocal, org.apache.spark.util.CallSite callSite, org.apache.spark.scheduler.JobListener listener, java.util.Properties properties) { throw new RuntimeException(); }
  /** Submits stage, but first recursively submits any missing parents. */
  private  void submitStage (org.apache.spark.scheduler.Stage stage) { throw new RuntimeException(); }
  /** Called when stage's parents are available and we can now do its task. */
  private  void submitMissingTasks (org.apache.spark.scheduler.Stage stage, int jobId) { throw new RuntimeException(); }
  /** Merge updates from a task to our local accumulator values */
  private  void updateAccumulators (org.apache.spark.scheduler.CompletionEvent event) { throw new RuntimeException(); }
  /**
   * Responds to a task finishing. This is called inside the event loop so it assumes that it can
   * modify the scheduler's internal state. Use taskEnded() to post a task end event from outside.
   * @param event (undocumented)
   */
    void handleTaskCompletion (org.apache.spark.scheduler.CompletionEvent event) { throw new RuntimeException(); }
  /**
   * Responds to an executor being lost. This is called inside the event loop, so it assumes it can
   * modify the scheduler's internal state. Use executorLost() to post a loss event from outside.
   * <p>
   * We will also assume that we've lost all shuffle blocks associated with the executor if the
   * executor serves its own blocks (i.e., we're not using external shuffle) OR a FetchFailed
   * occurred, in which case we presume all shuffle data related to this executor to be lost.
   * <p>
   * Optionally the epoch during which the failure was caught can be passed to avoid allowing
   * stray fetch failures from possibly retriggering the detection of a node as lost.
   * @param execId (undocumented)
   * @param fetchFailed (undocumented)
   * @param maybeEpoch (undocumented)
   */
    void handleExecutorLost (java.lang.String execId, boolean fetchFailed, scala.Option<java.lang.Object> maybeEpoch) { throw new RuntimeException(); }
    void handleExecutorAdded (java.lang.String execId, java.lang.String host) { throw new RuntimeException(); }
    void handleStageCancellation (int stageId) { throw new RuntimeException(); }
    void handleJobCancellation (int jobId, java.lang.String reason) { throw new RuntimeException(); }
  /**
   * Marks a stage as finished and removes it from the list of running stages.
   * @param stage (undocumented)
   * @param errorMessage (undocumented)
   */
  private  void markStageAsFinished (org.apache.spark.scheduler.Stage stage, scala.Option<java.lang.String> errorMessage) { throw new RuntimeException(); }
  /**
   * Aborts all jobs depending on a particular Stage. This is called in response to a task set
   * being canceled by the TaskScheduler. Use taskSetFailed() to inject this event from outside.
   * @param failedStage (undocumented)
   * @param reason (undocumented)
   */
    void abortStage (org.apache.spark.scheduler.Stage failedStage, java.lang.String reason) { throw new RuntimeException(); }
  /** Fails a job and all stages that are only used by that job, and cleans up relevant state. */
  private  void failJobAndIndependentStages (org.apache.spark.scheduler.ActiveJob job, java.lang.String failureReason) { throw new RuntimeException(); }
  /** Return true if one of stage's ancestors is target. */
  private  boolean stageDependsOn (org.apache.spark.scheduler.Stage stage, org.apache.spark.scheduler.Stage target) { throw new RuntimeException(); }
  /**
   * Gets the locality information associated with a partition of a particular RDD.
   * <p>
   * This method is thread-safe and is called from both DAGScheduler and SparkContext.
   * <p>
   * @param rdd whose partitions are to be looked at
   * @param partition to lookup locality information for
   * @return list of machines that are preferred by the partition
   */
    scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> getPreferredLocs (org.apache.spark.rdd.RDD<?> rdd, int partition) { throw new RuntimeException(); }
  /**
   * Recursive implementation for getPreferredLocs.
   * <p>
   * This method is thread-safe because it only accesses DAGScheduler state through thread-safe
   * methods (getCacheLocs()); please be careful when modifying this method, because any new
   * DAGScheduler state accessed by it may require additional synchronization.
   * @param rdd (undocumented)
   * @param partition (undocumented)
   * @param visited (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> getPreferredLocsInternal (org.apache.spark.rdd.RDD<?> rdd, int partition, scala.collection.mutable.HashSet<scala.Tuple2<org.apache.spark.rdd.RDD<?>, java.lang.Object>> visited) { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
}
