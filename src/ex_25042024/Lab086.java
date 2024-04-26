package ex_25042024;

public class Lab086 {
    public static void main(String[] args) {
        int item_code =006;
        switch(item_code){
            case 001,002,003:
                System.out.println("It is electroinc item");
                break;
                case 004,005,006:
                    System.out.println("It is CSE item");
                    break;
            default:
                System.out.println("its a default item");

        }
    }
}
