package ex_23042024;

import java.util.Scanner;

public class Lab062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num;
        num = sc.nextInt();
        if (num>=1){
            System.out.println("Number is positive-->" +num);
        }
        else if
        ((num>-1)&& (num<1)){
                System.out.println("Number is Zero-->"+num);

        }
        else {
            System.out.println("Number is Negative-->" +num);
        }

    }
}
