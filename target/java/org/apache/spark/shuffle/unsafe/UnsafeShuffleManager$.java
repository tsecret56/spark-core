package org.apache.spark.shuffle.unsafe;
// no position
  class UnsafeShuffleManager$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final UnsafeShuffleManager$ MODULE$ = null;
  public   UnsafeShuffleManager$ () { throw new RuntimeException(); }
  /**
   * The maximum number of shuffle output partitions that UnsafeShuffleManager supports.
   * @return (undocumented)
   */
  public  int MAX_SHUFFLE_OUTPUT_PARTITIONS () { throw new RuntimeException(); }
  /**
   * Helper method for determining whether a shuffle should use the optimized unsafe shuffle
   * path or whether it should fall back to the original sort-based shuffle.
   * @param dependency (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> boolean canUseUnsafeShuffle (org.apache.spark.ShuffleDependency<K, V, C> dependency) { throw new RuntimeException(); }
}
