package org.apache.spark.shuffle.unsafe;
/**
 * Subclass of {@link BaseShuffleHandle}, used to identify when we've chosen to use the new shuffle.
 */
  class UnsafeShuffleHandle<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.shuffle.BaseShuffleHandle<K, V, V> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   UnsafeShuffleHandle (int shuffleId, int numMaps, org.apache.spark.ShuffleDependency<K, V, V> dependency) { throw new RuntimeException(); }
}
