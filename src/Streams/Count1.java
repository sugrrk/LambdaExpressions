package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Count1 {
    public static void main(String[] args) {
        List<Integer> V1= Arrays.asList(4,8,9,5,2);
        //List<Integer> V2= Arrays.asList(8,9,5,7,6);

        //String min=l.stream().min((s1,s2) -> s1.compareTo(s2)).get();
       int min = V1.stream().min((x,y)-> x.compareTo(y)).get();
        System.out.println(min);




    }
}