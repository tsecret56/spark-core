package org.apache.spark;
  class TaskContextImpl extends org.apache.spark.TaskContext implements org.apache.spark.Logging {
  public  int stageId () { throw new RuntimeException(); }
  public  int partitionId () { throw new RuntimeException(); }
  public  long taskAttemptId () { throw new RuntimeException(); }
  public  int attemptNumber () { throw new RuntimeException(); }
  public  org.apache.spark.unsafe.memory.TaskMemoryManager taskMemoryManager () { throw new RuntimeException(); }
  public  boolean runningLocally () { throw new RuntimeException(); }
  public  org.apache.spark.executor.TaskMetrics taskMetrics () { throw new RuntimeException(); }
  // not preceding
  public   TaskContextImpl (int stageId, int partitionId, long taskAttemptId, int attemptNumber, org.apache.spark.unsafe.memory.TaskMemoryManager taskMemoryManager, boolean runningLocally, org.apache.spark.executor.TaskMetrics taskMetrics) { throw new RuntimeException(); }
  public  long attemptId () { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.util.TaskCompletionListener> onCompleteCallbacks () { throw new RuntimeException(); }
  private  boolean interrupted () { throw new RuntimeException(); }
  private  boolean completed () { throw new RuntimeException(); }
  public  org.apache.spark.TaskContextImpl addTaskCompletionListener (org.apache.spark.util.TaskCompletionListener listener) { throw new RuntimeException(); }
  public  org.apache.spark.TaskContextImpl addTaskCompletionListener (scala.Function1<org.apache.spark.TaskContext, scala.runtime.BoxedUnit> f) { throw new RuntimeException(); }
  public  void addOnCompleteCallback (scala.Function0<scala.runtime.BoxedUnit> f) { throw new RuntimeException(); }
  /** Marks the task as completed and triggers the listeners. */
    void markTaskCompleted () { throw new RuntimeException(); }
  /** Marks the task for interruption, i.e. cancellation. */
    void markInterrupted () { throw new RuntimeException(); }
  public  boolean isCompleted () { throw new RuntimeException(); }
  public  boolean isRunningLocally () { throw new RuntimeException(); }
  public  boolean isInterrupted () { throw new RuntimeException(); }
}
