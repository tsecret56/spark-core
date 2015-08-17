package org.apache.spark.util.collection;
/**
 * Append-only buffer of key-value pairs, each with a corresponding partition ID, that serializes
 * its records upon insert and stores them as raw bytes.
 * <p>
 * We use two data-structures to store the contents. The serialized records are stored in a
 * ChainedBuffer that can expand gracefully as records are added. This buffer is accompanied by a
 * metadata buffer that stores pointers into the data buffer as well as the partition ID of each
 * record. Each entry in the metadata buffer takes up a fixed amount of space.
 * <p>
 * Sorting the collection means swapping entries in the metadata buffer - the record buffer need not
 * be modified at all. Storing the partition IDs in the metadata buffer means that comparisons can
 * happen without following any pointers, which should minimize cache misses.
 * <p>
 * Currently, only sorting by partition is supported.
 * <p>
 * Each record is laid out inside the the metaBuffer as follows. keyStart, a long, is split across
 * two integers:
 * <p>
 *   +-------------+------------+------------+-------------+
 *   |         keyStart         | keyValLen  | partitionId |
 *   +-------------+------------+------------+-------------+
 * <p>
 * param:  metaInitialRecords The initial number of entries in the metadata buffer.
 * param:  kvBlockSize The size of each byte buffer in the ChainedBuffer used to store the records.
 * param:  serializerInstance the serializer used for serializing inserted records.
 */
  class PartitionedSerializedPairBuffer<K extends java.lang.Object, V extends java.lang.Object> implements org.apache.spark.util.collection.WritablePartitionedPairCollection<K, V>, org.apache.spark.util.collection.SizeTracker {
  static public  int KEY_START () { throw new RuntimeException(); }
  static public  int KEY_VAL_LEN () { throw new RuntimeException(); }
  static public  int PARTITION () { throw new RuntimeException(); }
  static public  int RECORD_SIZE () { throw new RuntimeException(); }
  static public  long getKeyStartPos (java.nio.IntBuffer metaBuffer, int metaBufferPos) { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   PartitionedSerializedPairBuffer (int metaInitialRecords, int kvBlockSize, org.apache.spark.serializer.SerializerInstance serializerInstance) { throw new RuntimeException(); }
  private  java.nio.IntBuffer metaBuffer () { throw new RuntimeException(); }
  private  org.apache.spark.util.collection.ChainedBuffer kvBuffer () { throw new RuntimeException(); }
  private  org.apache.spark.util.collection.ChainedBufferOutputStream kvOutputStream () { throw new RuntimeException(); }
  private  org.apache.spark.serializer.SerializationStream kvSerializationStream () { throw new RuntimeException(); }
  public  void insert (int partition, K key, V value) { throw new RuntimeException(); }
  /** Double the size of the array because we've reached capacity */
  private  void growMetaBuffer () { throw new RuntimeException(); }
  /** Iterate through the data in a given order. For this class this is not really destructive. */
  public  scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, V>> partitionedDestructiveSortedIterator (scala.Option<java.util.Comparator<K>> keyComparator) { throw new RuntimeException(); }
  public  long estimateSize () { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.WritablePartitionedIterator destructiveSortedWritablePartitionedIterator (scala.Option<java.util.Comparator<K>> keyComparator) { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.WritablePartitionedIterator writablePartitionedIterator () { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.OrderedInputStream orderedInputStream () { throw new RuntimeException(); }
  private  void sort (scala.Option<java.util.Comparator<K>> keyComparator) { throw new RuntimeException(); }
}
