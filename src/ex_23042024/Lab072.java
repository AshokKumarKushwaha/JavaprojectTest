package ex_23042024;

import java.util.Scanner;

public class Lab072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side1");
        int side1 = sc.nextInt();
        System.out.println("Enter the value of side2");
        int side2 = sc.nextInt();
        System.out.println("Enter the value of side3");
        int side3 = sc.nextInt();

        if((side1==side2) && (side1==side3) && (side2==side3)){
            System.out.println("Equalitral traingle");
        }
        else if((side1==side2) || (side1==side3) || side2==side3){
            System.out.println("Isosacles Traingle");
        }
        else {
            System.out.println("Scalane Traingle");
        }
    }
}
