package org.apache.spark.metrics;
  class MetricsConfig implements org.apache.spark.Logging {
  public  scala.Option<java.lang.String> configFile () { throw new RuntimeException(); }
  // not preceding
  public   MetricsConfig (scala.Option<java.lang.String> configFile) { throw new RuntimeException(); }
  private  java.lang.String DEFAULT_PREFIX () { throw new RuntimeException(); }
  private  scala.util.matching.Regex INSTANCE_REGEX () { throw new RuntimeException(); }
  private  java.lang.String DEFAULT_METRICS_CONF_FILENAME () { throw new RuntimeException(); }
  public  java.util.Properties properties () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, java.util.Properties> propertyCategories () { throw new RuntimeException(); }
  private  void setDefaultProperties (java.util.Properties prop) { throw new RuntimeException(); }
  public  void initialize () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, java.util.Properties> subProperties (java.util.Properties prop, scala.util.matching.Regex regex) { throw new RuntimeException(); }
  // not preceding
  public  java.util.Properties getInstance (java.lang.String inst) { throw new RuntimeException(); }
}
