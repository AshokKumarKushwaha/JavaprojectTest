package ex_23042024;

import java.util.Scanner;

public class Lab063 {
    public static void main(String[] args) {
      // Max number two
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1 =sc.nextInt();
        System.out.println("Enter the number2");
       int  num2 = sc.nextInt();


        if (num1>num2){
            System.out.println("The largest number"+num1);
        }
        else{
            System.out.println("The largest number" +num2);
        }
        sc.close();


    }
}
