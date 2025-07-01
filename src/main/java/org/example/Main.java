package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true, 1));
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

//    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
//
//    }
//
//    public static boolean isCatPlaying(boolean isSummer, int temp) {
//
//    }
//
//    public static double area(double width, double height) {
//
//    }
//
//    public static double area(double radius) {
//
//    }
}
