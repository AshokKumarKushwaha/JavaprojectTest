package ex_23042024;

import java.util.Scanner;

public class Lab070 {
    public static void main(String[] args) {
        //Grade
        // 90-100-> Grade A
        //80-89 --> Grade B
        //70-79 --> Grade C
        //60-69 --> Grade D
        //less than 60--> Grade F

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int score = sc.nextInt();
        if(score>=90 && score<=100){
            System.out.println("Grade A");
        }
        else if(score>=80 && score<=89){
            System.out.println("Grade B");
        }
        else if(score>=70 && score<=79){
            System.out.println("Grade C");
        }

        else if(score>=60 && score<=69){
            System.out.println("Grade D");
        }
        else if(score>=50 && score<=59){
            System.out.println("Grade F");
        }
        else if(score>100){
            System.out.println("LOL");
        }
        else {
            System.out.println("Grade F");
        }
sc.close();
    }
}
