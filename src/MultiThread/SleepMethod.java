package MultiThread;

public class SleepMethod extends Thread {
    @Override
    public void run() {
        for (int i=1; i < 5; i++) {
            try {
                System.out.println("Thread"+i+"Sleep");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SleepMethod sleepMethod_1 = new SleepMethod();
        SleepMethod sleepMethod_2 = new SleepMethod();

        System.out.println("Start 1");
        sleepMethod_1.start();
        System.out.println("Start 2");
        sleepMethod_2.start();
    }
}
