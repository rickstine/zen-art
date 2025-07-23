package java_8;

@FunctionalInterface
interface Greetings {
    void sayHello();
}

public class Functionalintrfacedemo {
    public static void main(String[] args) {
        Greetings g = () -> System.out.println("Hello Functional Interface");
        g.sayHello();
    }
}
