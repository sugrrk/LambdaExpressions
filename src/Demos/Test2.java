package Demos;




interface diff{
    public void difference(int x , int y);
}



public class Test2 {
    public static void main(String[] args) {
        diff d = (int x ,int y)->System.out.println("The Difference of two numbers 8-5 are " + (x-y) );
        d.difference(8,5);




    }
}
