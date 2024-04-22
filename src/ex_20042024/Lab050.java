package ex_20042024;

public class Lab050 {
    public static void main(String[] args) {
        int a =20;
        int b = 10;
        int c =5;
        int d = ((a>b) ? (a>c ? a:c) : (c>a ? c:a));
        System.out.println(d);

    }
}
