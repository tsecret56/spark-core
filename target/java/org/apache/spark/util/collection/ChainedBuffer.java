package org.apache.spark.util.collection;
/**
 * A logical byte buffer that wraps a list of byte arrays. All the byte arrays have equal size. The
 * advantage of this over a standard ArrayBuffer is that it can grow without claiming large amounts
 * of memory and needing to copy the full contents. The disadvantage is that the contents don't
 * occupy a contiguous segment of memory.
 */
  class ChainedBuffer {
  public   ChainedBuffer (int chunkSize) { throw new RuntimeException(); }
  private  int chunkSizeLog2 () { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<byte[]> chunks () { throw new RuntimeException(); }
  private  long _size () { throw new RuntimeException(); }
  /**
   * Feed bytes from this buffer into a BlockObjectWriter.
   * <p>
   * @param pos Offset in the buffer to read from.
   * @param os OutputStream to read into.
   * @param len Number of bytes to read.
   */
  public  void read (long pos, java.io.OutputStream os, int len) { throw new RuntimeException(); }
  /**
   * Read bytes from this buffer into a byte array.
   * <p>
   * @param pos Offset in the buffer to read from.
   * @param bytes Byte array to read into.
   * @param offs Offset in the byte array to read to.
   * @param len Number of bytes to read.
   */
  public  void read (long pos, byte[] bytes, int offs, int len) { throw new RuntimeException(); }
  /**
   * Write bytes from a byte array into this buffer.
   * <p>
   * @param pos Offset in the buffer to write to.
   * @param bytes Byte array to write from.
   * @param offs Offset in the byte array to write from.
   * @param len Number of bytes to write.
   */
  public  void write (long pos, byte[] bytes, int offs, int len) { throw new RuntimeException(); }
  /**
   * Total size of buffer that can be written to without allocating additional memory.
   * @return (undocumented)
   */
  public  long capacity () { throw new RuntimeException(); }
  /**
   * Size of the logical buffer.
   * @return (undocumented)
   */
  public  long size () { throw new RuntimeException(); }
}
