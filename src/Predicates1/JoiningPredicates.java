package Predicates1;

import java.util.function.Predicate;
//Using and,or,negate.
public class JoiningPredicates {
    public static void main(String[] args) {
        int a[]= {12,14,12,18,19,21,25};
        Predicate<Integer> p1 = i->i%2!=0;
        Predicate<Integer> p2 = i->i>10;
//        for (int n:a){
//            if (p1.and(p2).test(n)){//we can use and or negate here.
//                System.out.println(n);
        for(int d:a){
            if((p1.and(p2).test(d))){
                System.out.println(d);
            }
        }


       // System.out.println(p1.and(p2).test(5));

            }
        }

//    }
//}
