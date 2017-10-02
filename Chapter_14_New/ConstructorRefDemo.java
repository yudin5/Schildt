package Chapter_14_New;

// Demonstrate a Constructor reference.

// MyFunc is a functional interface whose method returns
// a MyClass reference.
interface MyConstrFunc {
    MyClass func(String s);
}

class MyClass {
    private String str;

    // This constructor takes an argument.
    MyClass(String s) { str = s; }

    // This is the default constructor.
    MyClass() { str = ""; }

    // ...

    String getStr() { return str; }
}

class ConstructorRefDemo {
    public static void main(String args[])
    {
        // Create a reference to the MyClass constructor.
        // Because func() in MyFunc takes an argument, new
        // refers to the parameterized constructor in MyClass,
        // not the default constructor.
        MyConstrFunc myClassCons = MyClass::new;

        // Create an instance of MyClass via that constructor reference.
        MyClass mc = myClassCons.func("Testing");

        // Use the instance of MyClass just created.
        System.out.println("str in mc is " + mc.getStr( ));
    }
}
