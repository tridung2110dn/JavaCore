package Sync;

public class DeadLockEx {
    public static void main(String[] args) {
        final String msg1 = "I LOVE YOU";
        final String msg2 = "Sorry, I have a boyfriend";

        final Thread boyA = new Thread() {
            @Override
            public void run() {
                synchronized (msg1) { //boy A locks resource msg1
                    System.out.println("Boy A says I love you");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                synchronized (msg2) { // boy A locks resource msg2
                    System.out.println("A Girl responses She had a boyfriend");
                }
                }
            }
        };
        final Thread boyB = new Thread() {
            @Override
            public void run() {
                synchronized (msg2) {
                    System.out.println("AAAAAAAA");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                synchronized (msg1) {
                    System.out.println("SORRY");
                }
                }
            }
        };

        boyA.start();
        boyB.start();
    }
}
