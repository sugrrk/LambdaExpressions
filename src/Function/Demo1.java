package Function;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {
        Function<Integer,Integer> fn = n->n*n;
        System.out.println(fn.apply(8));
        System.out.println(fn.apply(2));
        System.out.println(fn.apply(5));



        //To know the length of a string

Function <String,Integer> fn1= s->s.length();
        System.out.println(fn1.apply("Suganya"));
        System.out.println(fn1.apply("Coding"));

    }
}
