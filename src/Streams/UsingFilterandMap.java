package Streams;

import java.util.Arrays;
import java.util.List;

class Employee {
    String name;
    int id;
    int salary;

    Employee(String name,int id,int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;

    }




        }







public class UsingFilterandMap {
    public static void main(String[] args) {


        List<Employee> emp = Arrays.asList(new Employee("John",24,20000),
                new Employee("Don",14,60000),
                new Employee("paul",5,12000),
                new Employee("David",4,45000));
        emp.stream().filter(i->i.salary>20000).map(i->i.name +" " + i. salary).forEach(System.out::println);

    }
}
