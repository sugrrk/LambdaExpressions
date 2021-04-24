package DefaultMethod1;

interface i{
    default void d(){
        System.out.println("This is default method");
    }
    static void a(){
        System.out.println("This is static method");// creating static method
    }
}

public class demo1  implements i {
    public static void main(String[] args) {
        //demo1 s = new demo1();
        //s.d();
        i.a();
        demo1 s = new demo1();
        s.d();// we dont need to create new objects.
    }


}

