/*
    Threads allow computers to do multiple tasks at the same time, in parallel.
    Where threads are allowed to run and finish as they please, that is asynchronous.
    
*/
// *Research on the possible states of Threads
public class SimpleThreads {
    public static void main(String[] args) {
        Runnable job = new MyRunnableThing();
        Thread worker = new Thread(job); // Example of dependency injection
        worker.start();

        for ( int i = 0; i < 1000 ; i++ ) {
            System.out.println("main");
        }
    }
}

// The Runnable interface is a Functional Interface, that is the interface has only ONE method
class MyRunnableThing implements Runnable {
    @Override
    public void run(){
        for ( int i = 0; i < 1000 ; i++ ) {
            System.out.println("runnableThing");
        }
    }
}
