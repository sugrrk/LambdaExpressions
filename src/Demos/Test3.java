package Demos;

@FunctionalInterface
interface Sayable{
    public void divide(int a,int b);

}

public class Test3 {
    public static void main(String[] args) {

        Sayable s = (int a,int b)->System.out.println(a/b);
        s.divide(24,8);

    }
}
