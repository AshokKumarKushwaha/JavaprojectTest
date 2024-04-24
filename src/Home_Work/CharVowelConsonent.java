package Home_Work;

import java.util.Scanner;

public class CharVowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        if (Character.isLetter(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("vowel is-->"+ch);

            } else {
                System.out.println("consonant is -->"+ch);
            }
        }
            else {
                System.out.println("Not a letter->"+ch);
            }


            sc.close();
        }

    }


