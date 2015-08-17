package org.apache.spark.deploy.rest;
/**
 * A servlet for handling kill requests passed to the {@link StandaloneRestServer}.
 */
  class StandaloneKillRequestServlet extends org.apache.spark.deploy.rest.KillRequestServlet {
  public   StandaloneKillRequestServlet (akka.actor.ActorRef masterActor, org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.rest.KillSubmissionResponse handleKill (java.lang.String submissionId) { throw new RuntimeException(); }
}
