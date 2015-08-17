package org.apache.spark.util.collection;
/**
 * Iterator that writes elements to a BlockObjectWriter instead of returning them. Each element
 * has an associated partition.
 */
  interface WritablePartitionedIterator {
  public  void writeNext (org.apache.spark.storage.BlockObjectWriter writer) ;
  public  boolean hasNext () ;
  public  int nextPartition () ;
}
