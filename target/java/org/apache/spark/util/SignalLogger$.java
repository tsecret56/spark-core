package org.apache.spark.util;
// no position
/**
 * Used to log signals received. This can be very useful in debugging crashes or kills.
 * <p>
 * Inspired by Colin Patrick McCabe's similar class from Hadoop.
 */
  class SignalLogger$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SignalLogger$ MODULE$ = null;
  public   SignalLogger$ () { throw new RuntimeException(); }
  private  boolean registered () { throw new RuntimeException(); }
  /** Register a signal handler to log signals on UNIX-like systems. */
  public  void register (org.slf4j.Logger log) { throw new RuntimeException(); }
}
