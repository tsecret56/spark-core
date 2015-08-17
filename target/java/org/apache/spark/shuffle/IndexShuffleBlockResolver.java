package org.apache.spark.shuffle;
/**
 * Create and maintain the shuffle blocks' mapping between logic block and physical file location.
 * Data of shuffle blocks from the same map task are stored in a single consolidated data file.
 * The offsets of the data blocks in the data file are stored in a separate index file.
 * <p>
 * We use the name of the shuffle data's shuffleBlockId with reduce ID set to 0 and add ".data"
 * as the filename postfix for data file, and ".index" as the filename postfix for index file.
 * <p>
 */
  class IndexShuffleBlockResolver implements org.apache.spark.shuffle.ShuffleBlockResolver {
  static public  int NOOP_REDUCE_ID () { throw new RuntimeException(); }
  public   IndexShuffleBlockResolver (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  private  org.apache.spark.storage.BlockManager blockManager () { throw new RuntimeException(); }
  private  org.apache.spark.network.util.TransportConf transportConf () { throw new RuntimeException(); }
  public  java.io.File getDataFile (int shuffleId, int mapId) { throw new RuntimeException(); }
  private  java.io.File getIndexFile (int shuffleId, int mapId) { throw new RuntimeException(); }
  /**
   * Remove data file and index file that contain the output data from one map.
   * @param shuffleId (undocumented)
   * @param mapId (undocumented)
   * */
  public  void removeDataByMap (int shuffleId, int mapId) { throw new RuntimeException(); }
  /**
   * Write an index file with the offsets of each block, plus a final offset at the end for the
   * end of the output file. This will be used by getBlockLocation to figure out where each block
   * begins and ends.
   * @param shuffleId (undocumented)
   * @param mapId (undocumented)
   * @param lengths (undocumented)
   * */
  public  void writeIndexFile (int shuffleId, int mapId, long[] lengths) { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer getBlockData (org.apache.spark.storage.ShuffleBlockId blockId) { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
}
