package Demos;

interface NoLambdas{
    public void methodOne();
}
//class demo implements NoLambdas{
//    public void methodOne(){
//        System.out.println("method one execution");
//    }
//
//}


public class WithoutLambda {
    public static void main(String[] args) {
//        NoLambdas i = new demo();
//        i.methodOne();
        NoLambdas s = ()-> System.out.println("method one execution");
        s.methodOne();

    }


}
