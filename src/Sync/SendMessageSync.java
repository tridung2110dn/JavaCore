package Sync;

// A class used to send a message
class Sender {
    synchronized void send(String msg) {
        System.out.println("Sending\t" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n" + msg + "Sent");
    }
}

// Class for send a message using Threads
class ThreadedSender extends Thread {

    private String msg;
    private Sender sender;

    // Receives a message object and a string
    ThreadedSender(String msg, Sender obj) {
        this.msg = msg;
        this.sender = obj;
    }
    @Override
    public void run() {
            sender.send(msg);
    }
}

class SendMessageSync {
    public static void main(String[] args) {
        Sender snd = new Sender();
        ThreadedSender S1 = new ThreadedSender("Hi", snd);
        ThreadedSender S2 = new ThreadedSender("Bye", snd);

        // Start 2 threads
        S1.start();
        S2.start();

        // wait for threads to end
        try {
            S1.join();
            S2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
