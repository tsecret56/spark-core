package org.apache.spark.util.collection;
  class SerializedSortDataFormat extends org.apache.spark.util.collection.SortDataFormat<java.lang.Object, java.nio.IntBuffer> {
  public   SerializedSortDataFormat () { throw new RuntimeException(); }
  private  int[] META_BUFFER_TMP () { throw new RuntimeException(); }
  /** Return the sort key for the element at the given index. */
  protected  int getKey (java.nio.IntBuffer metaBuffer, int pos) { throw new RuntimeException(); }
  /** Swap two elements. */
  public  void swap (java.nio.IntBuffer metaBuffer, int pos0, int pos1) { throw new RuntimeException(); }
  /** Copy a single element from src(srcPos) to dst(dstPos). */
  public  void copyElement (java.nio.IntBuffer src, int srcPos, java.nio.IntBuffer dst, int dstPos) { throw new RuntimeException(); }
  /**
   * Copy a range of elements starting at src(srcPos) to dst, starting at dstPos.
   * Overlapping ranges are allowed.
   * @param src (undocumented)
   * @param srcPos (undocumented)
   * @param dst (undocumented)
   * @param dstPos (undocumented)
   * @param length (undocumented)
   */
  public  void copyRange (java.nio.IntBuffer src, int srcPos, java.nio.IntBuffer dst, int dstPos, int length) { throw new RuntimeException(); }
  /**
   * Allocates a Buffer that can hold up to 'length' elements.
   * All elements of the buffer should be considered invalid until data is explicitly copied in.
   * @param length (undocumented)
   * @return (undocumented)
   */
  public  java.nio.IntBuffer allocate (int length) { throw new RuntimeException(); }
}
