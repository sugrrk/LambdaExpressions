package Predicates1;

import java.util.ArrayList;
import java.util.function.Predicate;

class School{
    String name;
    int fees;
    String grade;

    School(String name,String gr,int f){
        name = name;
        grade = gr;
        fees = f;
    }
}





public class Demo2 {
    public static void main(String[] args) {
        School sch = new School("Shreya", "fifth" ,10000);
        Predicate<School> pr = d->(d.name.length()>4 && d.fees<20000);
        //System.out.println(pr.test(sch));
        ArrayList<School> al = new ArrayList<School>();

        al.add(new School("Shreya", "first" ,10000));
        al.add(new School("Suganya", "second" ,20000));
        al.add(new School("Mohit", "Third" ,30000));
        al.add(new School("Ramesh", "fourth" ,40000));
        al.add(new School("Snowy", "fifth" ,10000));
        for(School d : al){
            if(pr.test(d)){
                System.out.println( d.name +" " + d.fees);
            }
        }


    }
}
