package ex_25042024;

import java.util.Scanner;

public class Lab091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        marks = marks/10;
        // 90/10= 9 Grade A,
        //89/10 =8 grade B like that
        switch(marks){
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            case 4:
                System.out.println("F");
                break;
            default:
                System.out.println("None");


        }

    }
}
