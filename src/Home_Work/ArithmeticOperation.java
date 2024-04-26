package Home_Work;

import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user input1");
        int num1 = sc.nextInt();
        System.out.println("Enter user2 input2");
        int num2 = sc.nextInt();
        System.out.println("Which operation do you want to perform?");
        char ch = sc.next().charAt(0);
        int result;
        switch(ch){
            case '+':
                result = num1+num2;
            System.out.println("The addition value is-->"+result);
            break;
            case '*':
                result = num1*num2;
                System.out.println("The multiplication value is-->"+result);
                break;
            case '/':
                result = num1/num2;
                System.out.println("The division value is-->"+result);
                break;
            case '%':
                result = num1%num2;
                System.out.println("The modules value is-->"+result);
                break;
            case '-':
                result = num1-num2;
                System.out.println("The substraction value is-->"+result);
                break;
            default:
                System.out.println("none");

        }
    }
}
