package com.mycompany.test;

public class Calculator {

  public static void main(Stringp[] args) {
    int a = 4;
    int b = 2;
    System.out.println(sum(a,b));
  }
  private static int sum(int a, int b) {
    return a + b;
  }

  private static int minus(int a, int b) {
    return a - b;
  }

  private static int gpu_minus(int a, int b) {
    return b - a;
  }
}
