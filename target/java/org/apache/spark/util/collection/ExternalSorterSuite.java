package org.apache.spark.util.collection;
public  class ExternalSorterSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.PrivateMethodTester {
  public   ExternalSorterSuite () { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf createSparkConf (boolean loadDefaults, boolean kryo) { throw new RuntimeException(); }
  private  void assertBypassedMergeSort (org.apache.spark.util.collection.ExternalSorter<?, ?, ?> sorter) { throw new RuntimeException(); }
  private  void assertDidNotBypassMergeSort (org.apache.spark.util.collection.ExternalSorter<?, ?, ?> sorter) { throw new RuntimeException(); }
  public  void emptyDataStream (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  void fewElementsPerPartition (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  void emptyPartitionsWithSpilling (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  void emptyPartitionerWithSpillingBypassMergeSort (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  void testSpillingInLocalCluster (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  void spillingInLocalClusterWithManyReduceTasks (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  void noPartialAggregationOrSorting (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  void partialAggregationWithoutSpill (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  void partialAggregationWIthSpillNoOrdering (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  void partialAggregationWithSpillWithOrdering (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  void sortingWithoutAggregationNoSpill (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  void sortingWithoutAggregationWithSpill (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  void sortWithoutBreakingSortingContracts (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
}
