package Home_Work;

import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");

        int number1 = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int number2 = sc.nextInt();
        System.out.println("Enter the 3rd number");
        int number3 = sc.nextInt();

        if((number1>number2) && (number1>number3)){
            System.out.println("largest number is-->"+number1);
        } else if ((number2>number1) && (number2>number3)) {
            System.out.println("largest number is -->"+number2);

        } else if ((number3>number2) && (number3>number1)) {
            System.out.println("largest number is -->"+number3);

        }
        sc.close();


    }
}
