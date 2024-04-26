package ex_25042024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name is");
        String name = sc.nextLine();
        System.out.println("Enter Your age is");
        int age = sc.nextInt();

        System.out.println("Your salary is");
        double sal = sc.nextDouble();

        System.out.println("Your name is-->"+name);
        System.out.println("Your age is-->"+age);
        System.out.println("Your Salary is-->"+sal);

        sc.close();
    }
}
