package Home_Work;

import java.util.Scanner;

public class CheckPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = sc.nextInt();
        if(num>=1){
            System.out.println("Positive number is-->"+num);
        }
        else if((num>-1) &&(num<1)){
            System.out.println("number is zero-->"+num);
        }
        else {
            System.out.println("Negative number is-->"+num);
        }
    }
}
