package org.apache.spark.rpc;
/**
 * Represents a host and port.
 */
  class RpcAddress implements scala.Product, scala.Serializable {
  /**
   * Return the {@link RpcAddress} represented by <code>uri</code>.
   * @param uri (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.rpc.RpcAddress fromURI (java.net.URI uri) { throw new RuntimeException(); }
  /**
   * Return the {@link RpcAddress} represented by <code>uri</code>.
   * @param uri (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.rpc.RpcAddress fromURIString (java.lang.String uri) { throw new RuntimeException(); }
  static public  org.apache.spark.rpc.RpcAddress fromSparkURL (java.lang.String sparkUrl) { throw new RuntimeException(); }
  public  java.lang.String host () { throw new RuntimeException(); }
  public  int port () { throw new RuntimeException(); }
  // not preceding
  public   RpcAddress (java.lang.String host, int port) { throw new RuntimeException(); }
  public  java.lang.String hostPort () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
