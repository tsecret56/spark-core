package org.apache.spark.ui.scope;
/** A node in an RDDOperationGraph. This represents an RDD. */
  class RDDOperationNode implements scala.Product, scala.Serializable {
  public  int id () { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
  public  boolean cached () { throw new RuntimeException(); }
  // not preceding
  public   RDDOperationNode (int id, java.lang.String name, boolean cached) { throw new RuntimeException(); }
}
