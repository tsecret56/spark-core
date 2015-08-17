package org.apache.spark.deploy;
/**
 * Proxy that relays messages to the driver.
 * <p>
 * We currently don't support retry if submission fails. In HA mode, client will submit request to
 * all masters and see which one could handle it.
 */
public  class ClientActor implements akka.actor.Actor, org.apache.spark.util.ActorLogReceive, org.apache.spark.Logging {
  public   ClientActor (org.apache.spark.deploy.ClientArguments driverArgs, org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  private  akka.actor.ActorSelection[] masterActors () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<akka.actor.Address> lostMasters () { throw new RuntimeException(); }
  private  akka.actor.ActorSelection activeMasterActor () { throw new RuntimeException(); }
  public  scala.concurrent.duration.FiniteDuration timeout () { throw new RuntimeException(); }
  public  void preStart () { throw new RuntimeException(); }
  public  void pollAndReportStatus (java.lang.String driverId) { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveWithLogging () { throw new RuntimeException(); }
}
