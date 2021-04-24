package Demos;


import java.sql.SQLOutput;

interface addable{
    int add(int a, int b);
}


public class MultipleParam {
    public static void main(String[] args) {

        //addable d = (int a,int b)->(a+b);
        addable d = (a,b)->a+b;
        System.out.println(d.add(15,45));



    }
}
