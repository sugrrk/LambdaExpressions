package Predicates1;

import java.util.function.Predicate;

public class MultipleStrings1 {
    public static void main(String[] args) {
        Predicate<String> str = s->s.length()>4;
        String name[] = {"Sugan","Shreya","Mohit","Ram"};
//        for(String c : name){
//            if(c.length()>4) {
//                System.out.println(c);
//            }
//        }

        for(String s :name){
            if(s.length()>4){
                System.out.println(s);
            }
        }
//

            for (String f : name){
                if(str.test(f)){
                    System.out.println(f);
                }
            }




        }
    }

