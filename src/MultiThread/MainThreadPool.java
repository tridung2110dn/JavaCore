package MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {

    String message;

    public WorkerThread(String message) {
        this.message = message;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"(Start) message = "+message);
        processMessage(); // call processMessage method that sleeps the thread for 2 seconds
        System.out.println(Thread.currentThread().getName()); // prints thread name
    }

    private void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MainThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=0; i<2; i++) {
            Runnable worker = new WorkerThread(""+i);
            executorService.execute(worker); // calling execute method of ExecutorService
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) { }
            System.out.println("Finished all Threads");
    }
}
