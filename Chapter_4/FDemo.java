package Chapter_4;

/*
   Try This 4-2
   Demonstrate garbage collection and the finalize() method.
*/

class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    // called when object is recycled
    protected void finalize() {
        System.out.println("Finalizing " + x + " " + this);
    }

    // generates an object that is immediately destroyed
    void generator(int i) {
        FDemo o = new FDemo(i);
    }

}
