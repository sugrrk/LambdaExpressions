package Predicates1;

import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {
        Predicate<Integer> p = i->i>10;
      System.out.println(p.test(8));

        Predicate<String> s = s1->(s1.length()>4);
        System.out.println(s.test("Suganya"));
        System.out.println(s.test("Moni"));
    }
}
