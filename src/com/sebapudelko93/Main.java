package com.sebapudelko93;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Git");
        System.out.println(getName());
        System.out.println(getAge());
        printMatEquationResults(5, 7);
        System.out.println(isEven(7));
        System.out.println(couldDivideBy3and5(31));
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




}
