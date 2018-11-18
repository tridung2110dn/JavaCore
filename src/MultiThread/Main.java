package MultiThread;

class CreateThreadByExtendingThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 1");
    }
}

class CreateThreadByImplementingRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread 2");
    }
}

class Main {
    public static void main(String[] args) {
        CreateThreadByImplementingRunnable cn = new CreateThreadByImplementingRunnable();
        Thread t1 = new Thread(cn);
        t1.start();
    }
}