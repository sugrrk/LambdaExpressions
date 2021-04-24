package UsingAll;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String name;
    int Salary;
    String  gender;

    Employee(String name,int Salary,String gender){
        this.name = name;
        this.Salary = Salary;
        this.gender = gender;
    }
}




public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Employee>al = new ArrayList<Employee>();
        al.add(new Employee("XYZ",20000,"Male"));
        al.add(new Employee("AYZ",50000,"feMale"));
        al.add(new Employee("BYZ",70000,"Male"));
        al.add(new Employee("CYZ",30000,"FeMale"));


        Function<Employee,Integer> emp = d->(d.Salary*10)/100;
        Predicate<Integer> p = s->s>20000;
        Consumer<Employee> co = d->{
            System.out.println(d.name);
            System.out.println(d.Salary);
            System.out.println(d.gender);


        };
        for (Employee s : al){
            int bonus = (emp.apply(s));
            if(p.test(bonus)){
                co.accept(s);
                System.out.println("Employee bonus " + bonus);


            }

            }
        }
    }

