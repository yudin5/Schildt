package Chapter_11;

/*
   Try This 11-1

   Extend Thread.
*/
class MyNewThread extends Thread {

    // Construct a new thread.
    MyNewThread(String name) {
        super(name); // name thread
        start(); // start the thread
    }

    // Begin execution of new thread.
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }

        System.out.println(getName() + " terminating.");
    }
}

class ExtendThread {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");

        MyNewThread mt = new MyNewThread("Child #1");

        for(int i=0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }
}
