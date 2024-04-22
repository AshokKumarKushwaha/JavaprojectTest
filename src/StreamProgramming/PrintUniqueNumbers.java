package StreamProgramming;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintUniqueNumbers {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,2,4,2,5,4,78,3,4,10,5,2,8);

        List<Integer> UniqueNumber = al.stream().distinct().collect(Collectors.toUnmodifiableList());
        System.out.println(UniqueNumber);

    }
}
