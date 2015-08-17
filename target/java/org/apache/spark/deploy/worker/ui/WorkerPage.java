package org.apache.spark.deploy.worker.ui;
  class WorkerPage extends org.apache.spark.ui.WebUIPage {
  public   WorkerPage (org.apache.spark.deploy.worker.ui.WorkerWebUI parent) { throw new RuntimeException(); }
  private  akka.actor.ActorRef workerActor () { throw new RuntimeException(); }
  private  scala.concurrent.duration.FiniteDuration timeout () { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JValue renderJson (javax.servlet.http.HttpServletRequest request) { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request) { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> executorRow (org.apache.spark.deploy.worker.ExecutorRunner executor) { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> driverRow (org.apache.spark.deploy.worker.DriverRunner driver) { throw new RuntimeException(); }
}
