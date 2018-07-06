// Producer/Consumer problem
// Find a Producer/Consumer solution
public class ProCon {
    public static void main(String[] args) {
        Basket b = new Basket();
        Runnable producer = new Producer(b);
        Runnable consumer = new Consumer(b);

        Thread producerWorker = new Thread(producer);
        Thread consumerWorker = new Thread(consumer);

        producerWorker.start();
        consumerWorker.start();


    }
}

class Basket {
    private int nContents;
    private boolean isAvailable = false;

    public synchronized int get(){
        while (!isAvailable) {
            try {
                System.out.println(Thread.currentThread().getName() + " called wait");
                wait(); // The thread waits
            } catch (InterruptedException ex) {
                ex.getMessage();
            }
        }

        isAvailable = false;
        notifyAll(); // Wakes up all waiting threads
        return nContents;
    }

    public synchronized void put(int value) {
        while (isAvailable) {
            try {
                System.out.println(Thread.currentThread().getName() + " called wait");
                wait();
            } catch (InterruptedException ex) {
                ex.getMessage();
            }
        }

        isAvailable = true;
        nContents = value;
        notifyAll();
    }
}


class Consumer implements Runnable {
    private Basket basket;

    public Consumer(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = basket.get();
            System.out.println(Thread.currentThread().getName() + " gets " + value);
        }
    }
}

class Producer implements Runnable {
    private Basket basket;

    public Producer (Basket basket) {
        this.basket = basket;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++ ) {
            basket.put(i);
            System.out.println(Thread.currentThread().getName() + " put " + i);
        }

        try {
            Thread.sleep((int)(Math.random() * 100));
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
    }
}
