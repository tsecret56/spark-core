package org.apache.spark.deploy.history;
 abstract class ApplicationHistoryProvider {
  public   ApplicationHistoryProvider () { throw new RuntimeException(); }
  public abstract  scala.collection.Iterable<org.apache.spark.deploy.history.ApplicationHistoryInfo> getListing () ;
  /**
   * Returns the Spark UI for a specific application.
   * <p>
   * @param appId The application ID.
   * @param attemptId The application attempt ID (or None if there is no attempt ID).
   * @return The application's UI, or None if application is not found.
   */
  public abstract  scala.Option<org.apache.spark.ui.SparkUI> getAppUI (java.lang.String appId, scala.Option<java.lang.String> attemptId) ;
  /**
   * Called when the server is shutting down.
   */
  public  void stop () { throw new RuntimeException(); }
  /**
   * Returns configuration data to be shown in the History Server home page.
   * <p>
   * @return A map with the configuration data. Data is show in the order returned by the map.
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getConfig () { throw new RuntimeException(); }
}
