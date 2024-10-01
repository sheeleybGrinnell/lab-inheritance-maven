package edu.grinnell.csc207.util;

import java.lang.String;

public class BasicCounter implements Counter {
  //fields

  protected int count;

  protected int start;

  //constructro

  public BasicCounter(int val) {
    this.count = val;
    this.start = val;
    // System.err.printf("BasicCounter(%d)\n", start); 
  }

  //methods
  public void increment() throws Exception {
    try {
      this.count++;
    }
    catch(Exception e) {
      throw new Exception("error");
    }
  }

  public void reset() {
    this.count = this.start;
  }

  public String toString() {
    return "[" + this.count + "]";
  }

  public int get() {
    return this.count;
  }
}
