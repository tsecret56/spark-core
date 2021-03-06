package org.apache.spark.api.r;
// no position
/**
 * Utility functions to serialize, deserialize objects to / from R
 */
  class SerDe {
  static public  char readObjectType (java.io.DataInputStream dis) { throw new RuntimeException(); }
  static public  java.lang.Object readObject (java.io.DataInputStream dis) { throw new RuntimeException(); }
  static public  java.lang.Object readTypedObject (java.io.DataInputStream dis, char dataType) { throw new RuntimeException(); }
  static public  byte[] readBytes (java.io.DataInputStream in) { throw new RuntimeException(); }
  static public  int readInt (java.io.DataInputStream in) { throw new RuntimeException(); }
  static public  double readDouble (java.io.DataInputStream in) { throw new RuntimeException(); }
  static public  java.lang.String readStringBytes (java.io.DataInputStream in, int len) { throw new RuntimeException(); }
  static public  java.lang.String readString (java.io.DataInputStream in) { throw new RuntimeException(); }
  static public  boolean readBoolean (java.io.DataInputStream in) { throw new RuntimeException(); }
  static public  java.sql.Date readDate (java.io.DataInputStream in) { throw new RuntimeException(); }
  static public  java.sql.Time readTime (java.io.DataInputStream in) { throw new RuntimeException(); }
  static public  byte[][] readBytesArr (java.io.DataInputStream in) { throw new RuntimeException(); }
  static public  int[] readIntArr (java.io.DataInputStream in) { throw new RuntimeException(); }
  static public  double[] readDoubleArr (java.io.DataInputStream in) { throw new RuntimeException(); }
  static public  boolean[] readBooleanArr (java.io.DataInputStream in) { throw new RuntimeException(); }
  static public  java.lang.String[] readStringArr (java.io.DataInputStream in) { throw new RuntimeException(); }
  static public  java.lang.Object readList (java.io.DataInputStream dis) { throw new RuntimeException(); }
  static public  java.util.Map<java.lang.Object, java.lang.Object> readMap (java.io.DataInputStream in) { throw new RuntimeException(); }
  static public  void writeType (java.io.DataOutputStream dos, java.lang.String typeStr) { throw new RuntimeException(); }
  static public  void writeObject (java.io.DataOutputStream dos, java.lang.Object value) { throw new RuntimeException(); }
  static public  void writeInt (java.io.DataOutputStream out, int value) { throw new RuntimeException(); }
  static public  void writeDouble (java.io.DataOutputStream out, double value) { throw new RuntimeException(); }
  static public  void writeBoolean (java.io.DataOutputStream out, boolean value) { throw new RuntimeException(); }
  static public  void writeDate (java.io.DataOutputStream out, java.sql.Date value) { throw new RuntimeException(); }
  static public  void writeTime (java.io.DataOutputStream out, java.sql.Time value) { throw new RuntimeException(); }
  static public  void writeString (java.io.DataOutputStream out, java.lang.String value) { throw new RuntimeException(); }
  static public  void writeBytes (java.io.DataOutputStream out, byte[] value) { throw new RuntimeException(); }
  static public  void writeJObj (java.io.DataOutputStream out, java.lang.Object value) { throw new RuntimeException(); }
  static public  void writeIntArr (java.io.DataOutputStream out, int[] value) { throw new RuntimeException(); }
  static public  void writeDoubleArr (java.io.DataOutputStream out, double[] value) { throw new RuntimeException(); }
  static public  void writeBooleanArr (java.io.DataOutputStream out, boolean[] value) { throw new RuntimeException(); }
  static public  void writeStringArr (java.io.DataOutputStream out, java.lang.String[] value) { throw new RuntimeException(); }
  static public  void writeBytesArr (java.io.DataOutputStream out, byte[][] value) { throw new RuntimeException(); }
}
