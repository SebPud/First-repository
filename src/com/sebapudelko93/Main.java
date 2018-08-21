package com.sebapudelko93;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Git");
        System.out.println(getName());
        System.out.println(getAge());
        printMatEquationResults(5, 7);
        System.out.println(isEven(7));
        System.out.println(couldDivideBy3and5(30));
        System.out.println(pow3(6));
        System.out.println(square(81));
        System.out.println(triangle(2,3,4));
    }
    private static String getName() {
        return "Sebastian";
    }
    private static int getAge() {
        return 24;
    }
    private static void printMatEquationResults(double a, double b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
    private static boolean isEven(int a){
        return a%2 ==0;
    }
    private static boolean couldDivideBy3and5(int number){
        return number % 15 == 0;
    }
    private static double pow3(double number){
        return Math.pow(number,3);
    }
    private static double square(double number){
        return Math.sqrt(number);
    }
    private static boolean triangle(double a, double b, double c){
        if (a+b<c) return false;
        else if (a+c<b) return false;
        else if (b+c<a) return false;
        else return true;
    }




}
