package Home_Work;

public class PrintDecrementValue {
    public static void main(String[] args) {
        int b = 10;
        System.out.println(--b + b++ + ++b);

       // output1: --b = 1-b = 9
        // output2: b++ = b+1, now b value is 9 , then b+1 = 9 , because it is a post increment after execution
        // output3: ++b = 1+b, now b value is 10 , then 1+b = 11
        //Final output is : output1+ output2 + output3= 9+9+11= 29
    }
}
