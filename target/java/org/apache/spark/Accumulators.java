package org.apache.spark;
// no position
  class Accumulators implements org.apache.spark.Logging {
  /**
   * This global map holds the original accumulator objects that are created on the driver.
   * It keeps weak references to these objects so that accumulators can be garbage-collected
   * once the RDDs and user-code that reference them are cleaned up.
   * @return (undocumented)
   */
  static public  scala.collection.mutable.Map<java.lang.Object, scala.ref.WeakReference<org.apache.spark.Accumulable<?, ?>>> originals () { throw new RuntimeException(); }
  /**
   * This thread-local map holds per-task copies of accumulators; it is used to collect the set
   * of accumulator updates to send back to the driver when tasks complete. After tasks complete,
   * this map is cleared by <code>Accumulators.clear()</code> (see Executor.scala).
   * @return (undocumented)
   */
  static private  java.lang.ThreadLocal<scala.collection.mutable.Map<java.lang.Object, org.apache.spark.Accumulable<?, ?>>> localAccums () { throw new RuntimeException(); }
  static private  long lastId () { throw new RuntimeException(); }
  static public  long newId () { throw new RuntimeException(); }
  static public  void register (org.apache.spark.Accumulable<?, ?> a, boolean original) { throw new RuntimeException(); }
  static public  void clear () { throw new RuntimeException(); }
  static public  void remove (long accId) { throw new RuntimeException(); }
  static public  scala.collection.mutable.Map<java.lang.Object, java.lang.Object> values () { throw new RuntimeException(); }
  static public  void add (scala.collection.mutable.Map<java.lang.Object, java.lang.Object> values) { throw new RuntimeException(); }
  static public  java.lang.String stringifyPartialValue (Object partialValue) { throw new RuntimeException(); }
  static public  java.lang.String stringifyValue (Object value) { throw new RuntimeException(); }
}
