package ex_25042024;

public class Lab085 {
    public static void main(String[] args) {
        byte b = 20;
        switch(b){
            case 10:
                System.out.println("value is 10");
                break;
            case 127:
                System.out.println("value is 127");
                break;
            default:
                System.out.println("default");
        }
    }
}
