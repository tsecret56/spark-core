package org.apache.spark.shuffle.unsafe;
/**
 * A shuffle implementation that uses directly-managed memory to implement several performance
 * optimizations for certain types of shuffles. In cases where the new performance optimizations
 * cannot be applied, this shuffle manager delegates to {@link SortShuffleManager} to handle those
 * shuffles.
 * <p>
 * UnsafeShuffleManager's optimizations will apply when _all_ of the following conditions hold:
 * <p>
 *  - The shuffle dependency specifies no aggregation or output ordering.
 *  - The shuffle serializer supports relocation of serialized values (this is currently supported
 *    by KryoSerializer and Spark SQL's custom serializers).
 *  - The shuffle produces fewer than 16777216 output partitions.
 *  - No individual record is larger than 128 MB when serialized.
 * <p>
 * In addition, extra spill-merging optimizations are automatically applied when the shuffle
 * compression codec supports concatenation of serialized streams. This is currently supported by
 * Spark's LZF serializer.
 * <p>
 * At a high-level, UnsafeShuffleManager's design is similar to Spark's existing SortShuffleManager.
 * In sort-based shuffle, incoming records are sorted according to their target partition ids, then
 * written to a single map output file. Reducers fetch contiguous regions of this file in order to
 * read their portion of the map output. In cases where the map output data is too large to fit in
 * memory, sorted subsets of the output can are spilled to disk and those on-disk files are merged
 * to produce the final output file.
 * <p>
 * UnsafeShuffleManager optimizes this process in several ways:
 * <p>
 *  - Its sort operates on serialized binary data rather than Java objects, which reduces memory
 *    consumption and GC overheads. This optimization requires the record serializer to have certain
 *    properties to allow serialized records to be re-ordered without requiring deserialization.
 *    See SPARK-4550, where this optimization was first proposed and implemented, for more details.
 * <p>
 *  - It uses a specialized cache-efficient sorter ({@link UnsafeShuffleExternalSorter}) that sorts
 *    arrays of compressed record pointers and partition ids. By using only 8 bytes of space per
 *    record in the sorting array, this fits more of the array into cache.
 * <p>
 *  - The spill merging procedure operates on blocks of serialized records that belong to the same
 *    partition and does not need to deserialize records during the merge.
 * <p>
 *  - When the spill compression codec supports concatenation of compressed data, the spill merge
 *    simply concatenates the serialized and compressed spill partitions to produce the final output
 *    partition.  This allows efficient data copying methods, like NIO's <code>transferTo</code>, to be used
 *    and avoids the need to allocate decompression or copying buffers during the merge.
 * <p>
 * For more details on UnsafeShuffleManager's design, see SPARK-7081.
 */
  class UnsafeShuffleManager implements org.apache.spark.shuffle.ShuffleManager, org.apache.spark.Logging {
  /**
   * The maximum number of shuffle output partitions that UnsafeShuffleManager supports.
   * @return (undocumented)
   */
  static public  int MAX_SHUFFLE_OUTPUT_PARTITIONS () { throw new RuntimeException(); }
  /**
   * Helper method for determining whether a shuffle should use the optimized unsafe shuffle
   * path or whether it should fall back to the original sort-based shuffle.
   * @param dependency (undocumented)
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> boolean canUseUnsafeShuffle (org.apache.spark.ShuffleDependency<K, V, C> dependency) { throw new RuntimeException(); }
  public   UnsafeShuffleManager (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  /**
   * Register a shuffle with the manager and obtain a handle for it to pass to tasks.
   * @param shuffleId (undocumented)
   * @param numMaps (undocumented)
   * @param dependency (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> org.apache.spark.shuffle.ShuffleHandle registerShuffle (int shuffleId, int numMaps, org.apache.spark.ShuffleDependency<K, V, C> dependency) { throw new RuntimeException(); }
  /**
   * Get a reader for a range of reduce partitions (startPartition to endPartition-1, inclusive).
   * Called on executors by reduce tasks.
   * @param handle (undocumented)
   * @param startPartition (undocumented)
   * @param endPartition (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, C extends java.lang.Object> org.apache.spark.shuffle.ShuffleReader<K, C> getReader (org.apache.spark.shuffle.ShuffleHandle handle, int startPartition, int endPartition, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
  /** Get a writer for a given partition. Called on executors by map tasks. */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.shuffle.ShuffleWriter<K, V> getWriter (org.apache.spark.shuffle.ShuffleHandle handle, int mapId, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
  /** Remove a shuffle's metadata from the ShuffleManager. */
  public  boolean unregisterShuffle (int shuffleId) { throw new RuntimeException(); }
  public  org.apache.spark.shuffle.IndexShuffleBlockResolver shuffleBlockResolver () { throw new RuntimeException(); }
  /** Shut down this ShuffleManager. */
  public  void stop () { throw new RuntimeException(); }
}
