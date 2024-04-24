package ex_23042024;

import java.util.Scanner;

public class Lab069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1 = sc.nextInt();

        System.out.println("Enter the number2");
        int num2 = sc.nextInt();

        int max = Math.max(num1, num2);
        System.out.println("maximim number is -->" +max);

        }
    }

