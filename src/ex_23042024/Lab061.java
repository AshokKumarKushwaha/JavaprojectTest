package ex_23042024;

import java.util.Scanner;

public class Lab061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number is");
        int num;
       num =  sc.nextInt();
       if (num %2 ==0){
           System.out.println("even number is -->"+num);
       }
       else {
           System.out.println("odd number is -->"+num);
       }

    }
}
