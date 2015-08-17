package org.apache.spark.util;
// no position
  class ThreadUtils {
  static private  scala.concurrent.ExecutionContextExecutorService sameThreadExecutionContext () { throw new RuntimeException(); }
  /**
   * An <code>ExecutionContextExecutor</code> that runs each task in the thread that invokes <code>execute/submit</code>.
   * The caller should make sure the tasks running in this <code>ExecutionContextExecutor</code> are short and
   * never block.
   * @return (undocumented)
   */
  static public  scala.concurrent.ExecutionContextExecutor sameThread () { throw new RuntimeException(); }
  /**
   * Create a thread factory that names threads with a prefix and also sets the threads to daemon.
   * @param prefix (undocumented)
   * @return (undocumented)
   */
  static public  java.util.concurrent.ThreadFactory namedThreadFactory (java.lang.String prefix) { throw new RuntimeException(); }
  /**
   * Wrapper over newCachedThreadPool. Thread names are formatted as prefix-ID, where ID is a
   * unique, sequentially assigned integer.
   * @param prefix (undocumented)
   * @return (undocumented)
   */
  static public  java.util.concurrent.ThreadPoolExecutor newDaemonCachedThreadPool (java.lang.String prefix) { throw new RuntimeException(); }
  /**
   * Create a cached thread pool whose max number of threads is <code>maxThreadNumber</code>. Thread names
   * are formatted as prefix-ID, where ID is a unique, sequentially assigned integer.
   * @param prefix (undocumented)
   * @param maxThreadNumber (undocumented)
   * @return (undocumented)
   */
  static public  java.util.concurrent.ThreadPoolExecutor newDaemonCachedThreadPool (java.lang.String prefix, int maxThreadNumber) { throw new RuntimeException(); }
  /**
   * Wrapper over newFixedThreadPool. Thread names are formatted as prefix-ID, where ID is a
   * unique, sequentially assigned integer.
   * @param nThreads (undocumented)
   * @param prefix (undocumented)
   * @return (undocumented)
   */
  static public  java.util.concurrent.ThreadPoolExecutor newDaemonFixedThreadPool (int nThreads, java.lang.String prefix) { throw new RuntimeException(); }
  /**
   * Wrapper over newSingleThreadExecutor.
   * @param threadName (undocumented)
   * @return (undocumented)
   */
  static public  java.util.concurrent.ExecutorService newDaemonSingleThreadExecutor (java.lang.String threadName) { throw new RuntimeException(); }
  /**
   * Wrapper over newSingleThreadScheduledExecutor.
   * @param threadName (undocumented)
   * @return (undocumented)
   */
  static public  java.util.concurrent.ScheduledExecutorService newDaemonSingleThreadScheduledExecutor (java.lang.String threadName) { throw new RuntimeException(); }
}
