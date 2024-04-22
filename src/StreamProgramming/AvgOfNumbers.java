package StreamProgramming;

import java.util.Arrays;
import java.util.List;

public class AvgOfNumbers {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,2,3,4,5);
        double avg = al.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println(avg);


    }
}
