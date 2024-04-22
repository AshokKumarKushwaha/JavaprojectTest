package Home_Work;

public class MaxBetweenThreeNumber {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        int c =30;
        int max;
      max = a > b ? (a > c ?a : c) :(c >a ? c :a);
        System.out.println("Maximum number among " +a+ " ," +b+" and " + c+  " is " +max);
    }
}
