package Demos;


interface Single{
    public String s (String name);
}

public class SingleParameter {
    public static void main(String[] args) {
        Single d = name->{return ("Hello " + name);};
                System.out.println(d.s("Suganya"));

    }
}
