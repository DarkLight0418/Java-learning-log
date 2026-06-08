package example;

class MyShape {
    public void draw() {
        System.out.println("도형 그리기");
    }
}

class MyRect extends MyShape {
    @Override
    public void draw() {
        System.out.println("직사각형 그리기");
    }
}

class MyCircle extends MyShape {
    @Override
    public void draw() {
        System.out.println("원 그리기");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        MyShape s = new MyShape();
        s.draw();
        s = new MyRect();
        s.draw();
        s = new MyCircle();
        s.draw();
    }
}
