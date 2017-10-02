package Chapter_7;

/**
 * Created by Tigrenok on 16.09.2017.
 */

public class TwoDshapeTest {
    int a;
    int b;

    TwoDshapeTest() {
        System.out.println("Parent constr");
        a = b = 5;
    }

    TwoDshapeTest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    final void Hello() {
        System.out.println("Hello");
    }


}

class Triangle extends TwoDshapeTest {
    int c;

    Triangle() {
        System.out.println("Inherited constr");
    }

    Triangle(int a, int b, int c) {
        //super(a, b);
        this.c = c;
    }

    void Hello(String message) {
        System.out.println(message);
    }


    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println();
        Triangle abc = new Triangle(1,2,3);
        System.out.println(abc.a);
        System.out.println(abc.b);
        System.out.println(abc.c);
        abc.Hello();
        abc.Hello("GG");
    }
}
