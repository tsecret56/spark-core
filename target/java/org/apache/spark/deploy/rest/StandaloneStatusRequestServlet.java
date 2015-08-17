package org.apache.spark.deploy.rest;
/**
 * A servlet for handling status requests passed to the {@link StandaloneRestServer}.
 */
  class StandaloneStatusRequestServlet extends org.apache.spark.deploy.rest.StatusRequestServlet {
  public   StandaloneStatusRequestServlet (akka.actor.ActorRef masterActor, org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.rest.SubmissionStatusResponse handleStatus (java.lang.String submissionId) { throw new RuntimeException(); }
}
