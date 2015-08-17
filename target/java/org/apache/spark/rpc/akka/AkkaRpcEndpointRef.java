package org.apache.spark.rpc.akka;
  class AkkaRpcEndpointRef extends org.apache.spark.rpc.RpcEndpointRef implements org.apache.spark.Logging {
  public   AkkaRpcEndpointRef (org.apache.spark.rpc.RpcAddress defaultAddress, scala.Function0<akka.actor.ActorRef> _actorRef, org.apache.spark.SparkConf conf, boolean initInConstructor) { throw new RuntimeException(); }
  public  akka.actor.ActorRef actorRef () { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress address () { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
    void init () { throw new RuntimeException(); }
  public  void send (Object message) { throw new RuntimeException(); }
  public <T extends java.lang.Object> scala.concurrent.Future<T> ask (Object message, scala.concurrent.duration.FiniteDuration timeout, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
