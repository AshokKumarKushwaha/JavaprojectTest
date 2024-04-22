package StreamProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateNumber {
    public static void main(String[] args) {


        List<Integer> al = Arrays.asList(1, 2, 4, 6, 8, 4, 2, 3, 9, 10, 2, 10);
        Set<Integer> duplicateNumber = al.stream().filter(e -> Collections.frequency(al, e) > 1).collect(Collectors.toSet());
        System.out.println(duplicateNumber);
    }
}
