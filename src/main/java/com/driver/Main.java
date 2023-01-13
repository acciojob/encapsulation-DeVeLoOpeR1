package com.driver;

public class Main {
  public static void main(String [] args){
    RWOnly rw = new RWOnly();
     rw.setters("saurabh");
     System.out.println(rw.getter());
  }
}