package Home_Work;

public class CubeRoot {
    public static void main(String[] args) {
        // cube root of (x^2 +y^2 -|z|)

        double x =10, y =10, z =10;
        double sum = Math.pow(x,2) + Math.pow(y ,2) -Math.abs(z);
        System.out.println("Value of x^2 + X^2 - |Z|-->"+sum);

        double result = Math.cbrt(sum);
        System.out.println("cube root of of x^2 + X^2 - |Z|-->yes" +
                ""+result);

    }
}
