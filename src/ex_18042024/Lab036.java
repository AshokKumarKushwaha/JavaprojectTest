package ex_18042024;

public class Lab036 {
    public static void main(String[] args) {

        // AND gate
        // T && T =T (T*T =T)
        // F && T =F (F*T =F)
        // T && F =F
        // F && F = F

        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

    }
}