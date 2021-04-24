package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abi","Smith","David","Scott");
        ArrayList<String> d = new ArrayList<>();
        names.stream().map(i->i.toUpperCase()).forEach(System.out::println);
        for(String name : names){
            d.add(name.toUpperCase());

        }
        System.out.println(d);
    }
}
