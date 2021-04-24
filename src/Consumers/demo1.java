package Consumers;

import java.util.function.Consumer;

public class demo1 {
    public static void main(String[] args) {
        Consumer<String> c = s->System.out.println(s + " Suganya");
        Consumer<String> c1 = s->System.out.println(s + " Suganya");
        Consumer<String> c2 = s->System.out.println(s + " Suganya");

        c.accept("How are you" );
        c.accept("What are doing" );
        c.accept("How old are you" );
c.andThen(c1).andThen(c2).accept("Great");
    }

}
