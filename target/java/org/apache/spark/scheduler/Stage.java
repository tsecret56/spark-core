package org.apache.spark.scheduler;
/**
 * A stage is a set of independent tasks all computing the same function that need to run as part
 * of a Spark job, where all the tasks have the same shuffle dependencies. Each DAG of tasks run
 * by the scheduler is split up into stages at the boundaries where shuffle occurs, and then the
 * DAGScheduler runs these stages in topological order.
 * <p>
 * Each Stage can either be a shuffle map stage, in which case its tasks' results are input for
 * another stage, or a result stage, in which case its tasks directly compute the action that
 * initiated a job (e.g. count(), save(), etc). For shuffle map stages, we also track the nodes
 * that each output partition is on.
 * <p>
 * Each Stage also has a jobId, identifying the job that first submitted the stage.  When FIFO
 * scheduling is used, this allows Stages from earlier jobs to be computed first or recovered
 * faster on failure.
 * <p>
 * The callSite provides a location in user code which relates to the stage. For a shuffle map
 * stage, the callSite gives the user code that created the RDD being shuffled. For a result
 * stage, the callSite gives the user code that executes the associated action (e.g. count()).
 * <p>
 * A single stage can consist of multiple attempts. In that case, the latestInfo field will
 * be updated for each attempt.
 * <p>
 */
 abstract class Stage implements org.apache.spark.Logging {
  public  int id () { throw new RuntimeException(); }
  public  Object rdd () { throw new RuntimeException(); }
  public  int numTasks () { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.scheduler.Stage> parents () { throw new RuntimeException(); }
  public  int jobId () { throw new RuntimeException(); }
  public  org.apache.spark.util.CallSite callSite () { throw new RuntimeException(); }
  // not preceding
  public   Stage (int id, org.apache.spark.rdd.RDD<?> rdd, int numTasks, scala.collection.immutable.List<org.apache.spark.scheduler.Stage> parents, int jobId, org.apache.spark.util.CallSite callSite) { throw new RuntimeException(); }
  public  int numPartitions () { throw new RuntimeException(); }
  /** Set of jobs that this stage belongs to. */
  public  scala.collection.mutable.HashSet<java.lang.Object> jobIds () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<org.apache.spark.scheduler.Task<?>> pendingTasks () { throw new RuntimeException(); }
  private  int nextAttemptId () { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
  public  java.lang.String details () { throw new RuntimeException(); }
  /** Pointer to the latest [StageInfo] object, set by DAGScheduler. */
  public  org.apache.spark.scheduler.StageInfo latestInfo () { throw new RuntimeException(); }
  /** Return a new attempt id, starting with 0. */
  public  int newAttemptId () { throw new RuntimeException(); }
  public  int attemptId () { throw new RuntimeException(); }
  public final  int hashCode () { throw new RuntimeException(); }
  public final  boolean equals (Object other) { throw new RuntimeException(); }
}
