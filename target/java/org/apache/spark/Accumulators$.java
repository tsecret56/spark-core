package org.apache.spark;
// no position
  class Accumulators$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Accumulators$ MODULE$ = null;
  public   Accumulators$ () { throw new RuntimeException(); }
  /**
   * This global map holds the original accumulator objects that are created on the driver.
   * It keeps weak references to these objects so that accumulators can be garbage-collected
   * once the RDDs and user-code that reference them are cleaned up.
   * @return (undocumented)
   */
  public  scala.collection.mutable.Map<java.lang.Object, scala.ref.WeakReference<org.apache.spark.Accumulable<?, ?>>> originals () { throw new RuntimeException(); }
  /**
   * This thread-local map holds per-task copies of accumulators; it is used to collect the set
   * of accumulator updates to send back to the driver when tasks complete. After tasks complete,
   * this map is cleared by <code>Accumulators.clear()</code> (see Executor.scala).
   * @return (undocumented)
   */
  private  java.lang.ThreadLocal<scala.collection.mutable.Map<java.lang.Object, org.apache.spark.Accumulable<?, ?>>> localAccums () { throw new RuntimeException(); }
  private  long lastId () { throw new RuntimeException(); }
  public  long newId () { throw new RuntimeException(); }
  public  void register (org.apache.spark.Accumulable<?, ?> a, boolean original) { throw new RuntimeException(); }
  public  void clear () { throw new RuntimeException(); }
  public  void remove (long accId) { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<java.lang.Object, java.lang.Object> values () { throw new RuntimeException(); }
  public  void add (scala.collection.mutable.Map<java.lang.Object, java.lang.Object> values) { throw new RuntimeException(); }
  public  java.lang.String stringifyPartialValue (Object partialValue) { throw new RuntimeException(); }
  public  java.lang.String stringifyValue (Object value) { throw new RuntimeException(); }
}
