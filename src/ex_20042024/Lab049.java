package ex_20042024;

public class Lab049 {
    public static void main(String[] args) {
        String name = "Ashok";
        String name1 = new String("Ashok");

        System.out.println("your name is -> "+ name);
        System.out.printf("your name is -> %s ", name1);
        System.out.println("-----------------------");
        System.out.println(name.length());
        System.out.println(name.getBytes());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(1));
        System.out.println(name.chars());
        System.out.println(name.concat(name1));
        System.out.println(name.toString());
        System.out.println(name.compareTo(name1));
    }
}
