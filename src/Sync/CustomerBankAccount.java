package Sync;

class Customer {
    int amount = 10000;

    synchronized void withDraw(int amount) {
        System.out.println("Going to withdraw...");

        if (this.amount < amount) {
            System.out.println("Less blance, waiting for deposit");
            try { wait(); } catch (InterruptedException e) {}
        }
        this.amount -= amount;
        System.out.println("withDraw completed ...");
    }
    synchronized void deposit(int amount) {
        System.out.println("Going to deposit...");
        this.amount += amount;
        System.out.println("Deposit completed");
        notify();
    }
}

class CustomerBankAccount {
    public static void main(String[] args) {
        final Customer c = new Customer();
        new Thread() {
            @Override
            public void run() {
                c.withDraw(15000);
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                c.deposit(10000);
            }
        }.start();
    }
}

