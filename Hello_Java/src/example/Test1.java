package example;

class A {
    private int a;
    public A() {
        this.a = 0;
        System.out.println("A 생성자 실행");
    }
}

class B extends A {
    private int b;
    public B() {
        this.b = 1;
        System.out.println("B 생성자 실행");
    }
}

class C extends B {
    private int c;
    public C() {
        this.c = 2;
        System.out.println("C 생성자 실행");
    }
}

public class Test1 {
    public static void main(String[] args) {
        C obj = new C();
    }
}
