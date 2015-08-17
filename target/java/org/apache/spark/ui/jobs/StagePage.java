package org.apache.spark.ui.jobs;
/** Page showing statistics and task list for a given stage */
  class StagePage extends org.apache.spark.ui.WebUIPage {
  public   StagePage (org.apache.spark.ui.jobs.StagesTab parent) { throw new RuntimeException(); }
  private  org.apache.spark.ui.jobs.JobProgressListener progressListener () { throw new RuntimeException(); }
  private  org.apache.spark.ui.scope.RDDOperationGraphListener operationGraphListener () { throw new RuntimeException(); }
  private  scala.xml.Elem TIMELINE_LEGEND () { throw new RuntimeException(); }
  private  int MAX_TIMELINE_TASKS () { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request) { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> makeTimeline (scala.collection.Seq<org.apache.spark.ui.jobs.UIData.TaskUIData> tasks, long currentTime) { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> taskRow (boolean hasAccumulators, boolean hasInput, boolean hasOutput, boolean hasShuffleRead, boolean hasShuffleWrite, boolean hasBytesSpilled, long currentTime, org.apache.spark.ui.jobs.UIData.TaskUIData taskData) { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> errorMessageCell (scala.Option<java.lang.String> errorMessage) { throw new RuntimeException(); }
  private  long getGettingResultTime (org.apache.spark.scheduler.TaskInfo info) { throw new RuntimeException(); }
  private  long getSchedulerDelay (org.apache.spark.scheduler.TaskInfo info, org.apache.spark.executor.TaskMetrics metrics) { throw new RuntimeException(); }
}
