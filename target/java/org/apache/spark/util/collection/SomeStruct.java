package org.apache.spark.util.collection;
public  class SomeStruct implements scala.Product, scala.Serializable {
  public  java.lang.String str () { throw new RuntimeException(); }
  public  int num () { throw new RuntimeException(); }
  // not preceding
  public   SomeStruct (java.lang.String str, int num) { throw new RuntimeException(); }
}
