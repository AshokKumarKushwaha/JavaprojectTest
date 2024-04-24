package ex_20042024;

import java.util.Scanner;

public class Lab069 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number is -->");
        int num = sc.nextInt();
        if(num % 2 ==0){
            System.out.println("Even number is-->"+num);
        }
        else {
            System.out.println("Odd number is -->"+num);
        }

    }
}
