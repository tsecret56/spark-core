package org.apache.spark.api.python;
// no position
  class PythonRDD$ implements org.apache.spark.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PythonRDD$ MODULE$ = null;
  public   PythonRDD$ () { throw new RuntimeException(); }
  private  scala.collection.mutable.WeakHashMap<java.net.Socket, scala.collection.mutable.Set<java.lang.Object>> workerBroadcasts () { throw new RuntimeException(); }
  private  scala.collection.mutable.Set<java.lang.Object> getWorkerBroadcasts (java.net.Socket worker) { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<byte[]> valueOfPair (org.apache.spark.api.java.JavaPairRDD<java.lang.Object, byte[]> pair) { throw new RuntimeException(); }
  public  int runJob (org.apache.spark.SparkContext sc, org.apache.spark.api.java.JavaRDD<byte[]> rdd, java.util.ArrayList<java.lang.Object> partitions, boolean allowLocal) { throw new RuntimeException(); }
  public <T extends java.lang.Object> int collectAndServe (org.apache.spark.rdd.RDD<T> rdd) { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<byte[]> readRDDFromFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String filename, int parallelism) { throw new RuntimeException(); }
  public  org.apache.spark.broadcast.Broadcast<org.apache.spark.api.python.PythonBroadcast> readBroadcastFromFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String path) { throw new RuntimeException(); }
  public <T extends java.lang.Object> void writeIteratorToStream (scala.collection.Iterator<T> iter, java.io.DataOutputStream dataOut) { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.api.java.JavaRDD<T> emptyRDD (org.apache.spark.api.java.JavaSparkContext sc) { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.api.java.JavaRDD<byte[]> sequenceFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String path, java.lang.String keyClassMaybeNull, java.lang.String valueClassMaybeNull, java.lang.String keyConverterClass, java.lang.String valueConverterClass, int minSplits, int batchSize) { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> org.apache.spark.api.java.JavaRDD<byte[]> newAPIHadoopFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String path, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, int batchSize) { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> org.apache.spark.api.java.JavaRDD<byte[]> newAPIHadoopRDD (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, int batchSize) { throw new RuntimeException(); }
  private <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> newAPIHadoopRDDFromClassNames (org.apache.spark.api.java.JavaSparkContext sc, scala.Option<java.lang.String> path, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapred.InputFormat<K, V>> org.apache.spark.api.java.JavaRDD<byte[]> hadoopFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String path, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, int batchSize) { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapred.InputFormat<K, V>> org.apache.spark.api.java.JavaRDD<byte[]> hadoopRDD (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, int batchSize) { throw new RuntimeException(); }
  private <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapred.InputFormat<K, V>> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> hadoopRDDFromClassNames (org.apache.spark.api.java.JavaSparkContext sc, scala.Option<java.lang.String> path, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  public  void writeUTF (java.lang.String str, java.io.DataOutputStream dataOut) { throw new RuntimeException(); }
  private <T extends java.lang.Object> int serveIterator (scala.collection.Iterator<T> items, java.lang.String threadName) { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration getMergedConf (java.util.HashMap<java.lang.String, java.lang.String> confAsMap, org.apache.hadoop.conf.Configuration baseConf) { throw new RuntimeException(); }
  private <K extends java.lang.Object, V extends java.lang.Object> scala.Tuple2<java.lang.Class<?>, java.lang.Class<?>> inferKeyValueTypes (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, java.lang.String keyConverterClass, java.lang.String valueConverterClass) { throw new RuntimeException(); }
  private  scala.Option<scala.Tuple2<java.lang.Class<?>, java.lang.Class<?>>> getKeyValueTypes (java.lang.String keyClass, java.lang.String valueClass) { throw new RuntimeException(); }
  private  scala.Tuple2<org.apache.spark.api.python.Converter<java.lang.Object, java.lang.Object>, org.apache.spark.api.python.Converter<java.lang.Object, java.lang.Object>> getKeyValueConverters (java.lang.String keyConverterClass, java.lang.String valueConverterClass, org.apache.spark.api.python.Converter<java.lang.Object, java.lang.Object> defaultConverter) { throw new RuntimeException(); }
  private <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> convertRDD (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, java.lang.String keyConverterClass, java.lang.String valueConverterClass, org.apache.spark.api.python.Converter<java.lang.Object, java.lang.Object> defaultConverter) { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object, C extends org.apache.hadoop.io.compress.CompressionCodec> void saveAsSequenceFile (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batchSerialized, java.lang.String path, java.lang.String compressionCodecClass) { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapred.OutputFormat<?, ?>, C extends org.apache.hadoop.io.compress.CompressionCodec> void saveAsHadoopFile (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batchSerialized, java.lang.String path, java.lang.String outputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, java.lang.String compressionCodecClass) { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.OutputFormat<?, ?>> void saveAsNewAPIHadoopFile (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batchSerialized, java.lang.String path, java.lang.String outputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap) { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object> void saveAsHadoopDataset (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batchSerialized, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, java.lang.String keyConverterClass, java.lang.String valueConverterClass, boolean useNewAPI) { throw new RuntimeException(); }
}
