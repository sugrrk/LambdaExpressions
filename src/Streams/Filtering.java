package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering {
    public static void main(String[] args) {
       List<String> l = Arrays.asList("Suganya" , "Mohit" ,  "Ramesh","Shreya");
       //l.forEach(s-> System.out.println(s));
       l.stream().filter(var->var.contains("e")).forEach(System.out::println);



    }
}

