package Demos;
@FunctionalInterface
interface Name{
    public void boyNames();
}

public class Test1 {
    public static void main(String[] args) {
        Name boy = ()->System.out.println("Mohit");
        boy.boyNames();
    }

}

