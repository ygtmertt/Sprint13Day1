package org.example;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println(shouldWakeUp(true, 1));
    System.out.println(hasTeen(22, 23, 34));
    System.out.println(isCatPlaying(false, 35));
  }

  public static boolean shouldWakeUp(boolean isBarking, int clock) {
    if(clock > 23 || clock < 0) {
      return false;
    }
    else {
      if(clock > 20 || clock < 8 && isBarking) {
        return true;
      }
      else {
        return false;
      }
    }
  }

  public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
    if(firstAge<=19 && firstAge>=9 ||
        secondAge<=19 && secondAge>=9 ||
        thirdAge<=19 && thirdAge>=9) {
      return true;
    }
    else {
      return false;
    }
  }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
      if(isSummer && temp<=45 && temp>=25) {
        return true;
      } else if (!isSummer && temp<=35 && temp>=25) {
        return true;
      }
      else {
        return false;
      }
    }
//
//    public static double area(double width, double height) {
//
//    }
//
//    public static double area(double radius) {
//
//    }
}
