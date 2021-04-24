package Function;

import java.util.ArrayList;
import java.util.function.Function;

class Bank{
    String name;
    int deposit;
    int withdraw;

 Bank(String name,int deposit,int withdraw){
    this.name  = name;
    this.deposit= deposit;
   this.withdraw = withdraw;


 }

}




public class Demo2 {
    public static void main(String[] args) {
       Function<Integer,Integer> fn = s->s*2;
       Function<Integer,Integer>fn1 = s->s*s*s;
        System.out.println(fn.andThen(fn1).apply(5));// using and then()first it will take fn then multiply with first number.
        System.out.println(fn.compose(fn1).apply(5));//using Compose()---First it will take fn1 and then fn
    }
}
