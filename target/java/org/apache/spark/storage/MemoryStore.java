package org.apache.spark.storage;
  class MemoryStore extends org.apache.spark.storage.BlockStore {
  // not preceding
  public   MemoryStore (org.apache.spark.storage.BlockManager blockManager, long maxMemory) { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
  private  java.util.LinkedHashMap<org.apache.spark.storage.BlockId, org.apache.spark.storage.MemoryEntry> entries () { throw new RuntimeException(); }
  private  long currentMemory () { throw new RuntimeException(); }
  private  java.lang.Object accountingLock () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> unrollMemoryMap () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> pendingUnrollMemoryMap () { throw new RuntimeException(); }
  /**
   * The amount of space ensured for unrolling values in memory, shared across all cores.
   * This space is not reserved in advance, but allocated dynamically by dropping existing blocks.
   * @return (undocumented)
   */
  private  long maxUnrollMemory () { throw new RuntimeException(); }
  private  long unrollMemoryThreshold () { throw new RuntimeException(); }
  /** Free memory not occupied by existing blocks. Note that this does not include unroll memory. */
  public  long freeMemory () { throw new RuntimeException(); }
  public  long getSize (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public  org.apache.spark.storage.PutResult putBytes (org.apache.spark.storage.BlockId blockId, java.nio.ByteBuffer _bytes, org.apache.spark.storage.StorageLevel level) { throw new RuntimeException(); }
  /**
   * Use <code>size</code> to test if there is enough space in MemoryStore. If so, create the ByteBuffer and
   * put it into MemoryStore. Otherwise, the ByteBuffer won't be created.
   * <p>
   * The caller should guarantee that <code>size</code> is correct.
   * @param blockId (undocumented)
   * @param size (undocumented)
   * @param _bytes (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.storage.PutResult putBytes (org.apache.spark.storage.BlockId blockId, long size, scala.Function0<java.nio.ByteBuffer> _bytes) { throw new RuntimeException(); }
  public  org.apache.spark.storage.PutResult putArray (org.apache.spark.storage.BlockId blockId, java.lang.Object[] values, org.apache.spark.storage.StorageLevel level, boolean returnValues) { throw new RuntimeException(); }
  public  org.apache.spark.storage.PutResult putIterator (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<java.lang.Object> values, org.apache.spark.storage.StorageLevel level, boolean returnValues) { throw new RuntimeException(); }
  /**
   * Attempt to put the given block in memory store.
   * <p>
   * There may not be enough space to fully unroll the iterator in memory, in which case we
   * optionally drop the values to disk if
   *   (1) the block's storage level specifies useDisk, and
   *   (2) <code>allowPersistToDisk</code> is true.
   * <p>
   * One scenario in which <code>allowPersistToDisk</code> is false is when the BlockManager reads a block
   * back from disk and attempts to cache it in memory. In this case, we should not persist the
   * block back on disk again, as it is already in disk store.
   * @param blockId (undocumented)
   * @param values (undocumented)
   * @param level (undocumented)
   * @param returnValues (undocumented)
   * @param allowPersistToDisk (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.storage.PutResult putIterator (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<java.lang.Object> values, org.apache.spark.storage.StorageLevel level, boolean returnValues, boolean allowPersistToDisk) { throw new RuntimeException(); }
  public  scala.Option<java.nio.ByteBuffer> getBytes (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Iterator<java.lang.Object>> getValues (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public  boolean remove (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public  void clear () { throw new RuntimeException(); }
  /**
   * Unroll the given block in memory safely.
   * <p>
   * The safety of this operation refers to avoiding potential OOM exceptions caused by
   * unrolling the entirety of the block in memory at once. This is achieved by periodically
   * checking whether the memory restrictions for unrolling blocks are still satisfied,
   * stopping immediately if not. This check is a safeguard against the scenario in which
   * there is not enough free memory to accommodate the entirety of a single block.
   * <p>
   * This method returns either an array with the contents of the entire block or an iterator
   * containing the values of the block (if the array would have exceeded available memory).
   * @param blockId (undocumented)
   * @param values (undocumented)
   * @param droppedBlocks (undocumented)
   * @return (undocumented)
   */
  public  scala.util.Either<java.lang.Object[], scala.collection.Iterator<java.lang.Object>> unrollSafely (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<java.lang.Object> values, scala.collection.mutable.ArrayBuffer<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> droppedBlocks) { throw new RuntimeException(); }
  /**
   * Return the RDD ID that a given block ID is from, or None if it is not an RDD block.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<java.lang.Object> getRddId (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  private  org.apache.spark.storage.ResultWithDroppedBlocks tryToPut (org.apache.spark.storage.BlockId blockId, Object value, long size, boolean deserialized) { throw new RuntimeException(); }
  /**
   * Try to put in a set of values, if we can free up enough space. The value should either be
   * an Array if deserialized is true or a ByteBuffer otherwise. Its (possibly estimated) size
   * must also be passed by the caller.
   * <p>
   * <code>value</code> will be lazily created. If it cannot be put into MemoryStore or disk, <code>value</code> won't be
   * created to avoid OOM since it may be a big ByteBuffer.
   * <p>
   * Synchronize on <code>accountingLock</code> to ensure that all the put requests and its associated block
   * dropping is done by only on thread at a time. Otherwise while one thread is dropping
   * blocks to free memory for one block, another thread may use up the freed space for
   * another block.
   * <p>
   * Return whether put was successful, along with the blocks dropped in the process.
   * @param blockId (undocumented)
   * @param value (undocumented)
   * @param size (undocumented)
   * @param deserialized (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.storage.ResultWithDroppedBlocks tryToPut (org.apache.spark.storage.BlockId blockId, scala.Function0<java.lang.Object> value, long size, boolean deserialized) { throw new RuntimeException(); }
  /**
   * Try to free up a given amount of space to store a particular block, but can fail if
   * either the block is bigger than our memory or it would require replacing another block
   * from the same RDD (which leads to a wasteful cyclic replacement pattern for RDDs that
   * don't fit into memory that we want to avoid).
   * <p>
   * Assume that <code>accountingLock</code> is held by the caller to ensure only one thread is dropping
   * blocks. Otherwise, the freed space may fill up before the caller puts in their new value.
   * <p>
   * Return whether there is enough free space, along with the blocks dropped in the process.
   * @param blockIdToAdd (undocumented)
   * @param space (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.storage.ResultWithDroppedBlocks ensureFreeSpace (org.apache.spark.storage.BlockId blockIdToAdd, long space) { throw new RuntimeException(); }
  public  boolean contains (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  /**
   * Reserve additional memory for unrolling blocks used by this thread.
   * Return whether the request is granted.
   * @param memory (undocumented)
   * @return (undocumented)
   */
  public  boolean reserveUnrollMemoryForThisThread (long memory) { throw new RuntimeException(); }
  /**
   * Release memory used by this thread for unrolling blocks.
   * If the amount is not specified, remove the current thread's allocation altogether.
   * @param memory (undocumented)
   */
  public  void releaseUnrollMemoryForThisThread (long memory) { throw new RuntimeException(); }
  /**
   * Reserve the unroll memory of current unroll successful block used by this thread
   * until actually put the block into memory entry.
   * @param memory (undocumented)
   */
  public  void reservePendingUnrollMemoryForThisThread (long memory) { throw new RuntimeException(); }
  /**
   * Release pending unroll memory of current unroll successful block used by this thread
   */
  public  void releasePendingUnrollMemoryForThisThread () { throw new RuntimeException(); }
  /**
   * Return the amount of memory currently occupied for unrolling blocks across all threads.
   * @return (undocumented)
   */
  public  long currentUnrollMemory () { throw new RuntimeException(); }
  /**
   * Return the amount of memory currently occupied for unrolling blocks by this thread.
   * @return (undocumented)
   */
  public  long currentUnrollMemoryForThisThread () { throw new RuntimeException(); }
  /**
   * Return the number of threads currently unrolling blocks.
   * @return (undocumented)
   */
  public  int numThreadsUnrolling () { throw new RuntimeException(); }
  /**
   * Log information about current memory usage.
   */
  public  void logMemoryUsage () { throw new RuntimeException(); }
  /**
   * Log a warning for failing to unroll a block.
   * <p>
   * @param blockId ID of the block we are trying to unroll.
   * @param finalVectorSize Final size of the vector before unrolling failed.
   */
  public  void logUnrollFailureMessage (org.apache.spark.storage.BlockId blockId, long finalVectorSize) { throw new RuntimeException(); }
}
