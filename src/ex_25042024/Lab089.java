package ex_25042024;

import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println("Enter the value of x");
        double y = sc.nextDouble();
        System.out.println("Enter the value of y");
        double z = sc.nextDouble();
        System.out.println("Enter the value of x");

        double result;
        //3/x^2+y^2-|z| = A+B-C
        //A =x^2, B=y^2, C =|z| = abs|z|
        result = Math.cbrt((Math.pow(x,2))+(Math.pow(y,2))-(Math.abs(z)));
        System.out.println(result);
        sc.close();

}}
