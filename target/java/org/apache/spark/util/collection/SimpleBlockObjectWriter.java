package org.apache.spark.util.collection;
public  class SimpleBlockObjectWriter extends org.apache.spark.storage.BlockObjectWriter {
  public   SimpleBlockObjectWriter () { throw new RuntimeException(); }
  public  java.io.ByteArrayOutputStream baos () { throw new RuntimeException(); }
  public  void write (byte[] bytes, int offs, int len) { throw new RuntimeException(); }
  public  java.io.InputStream getInputStream () { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockObjectWriter open () { throw new RuntimeException(); }
  public  void close () { throw new RuntimeException(); }
  public  boolean isOpen () { throw new RuntimeException(); }
  public  void commitAndClose () { throw new RuntimeException(); }
  public  void revertPartialWritesAndClose () { throw new RuntimeException(); }
  public  org.apache.spark.storage.FileSegment fileSegment () { throw new RuntimeException(); }
  public  void write (Object key, Object value) { throw new RuntimeException(); }
  public  void recordWritten () { throw new RuntimeException(); }
  public  void write (int b) { throw new RuntimeException(); }
}
