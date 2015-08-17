package org.apache.spark.network.nio;
  class PutBlock implements scala.Product, scala.Serializable {
  public  org.apache.spark.storage.BlockId id () { throw new RuntimeException(); }
  public  java.nio.ByteBuffer data () { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel level () { throw new RuntimeException(); }
  public   PutBlock (org.apache.spark.storage.BlockId id, java.nio.ByteBuffer data, org.apache.spark.storage.StorageLevel level) { throw new RuntimeException(); }
}
