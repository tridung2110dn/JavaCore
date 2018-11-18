package Sync;

class BankAccount {

    int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    void deposit(int amount) { // gui tien
        balance += amount;
    }

    void withDraw(int amount) {
        if (balance > amount) {
            try {
                balance = balance - amount;
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    int getBalance() {
        return balance;
    }
}

class Clerk extends Thread {
    private BankAccount bankAccount;

    Clerk(BankAccount account) {
        this.bankAccount = account;
    }

    @Override
    public void run() {
        System.out.println("Thu ky rut 9000");
        bankAccount.withDraw(9000);
    }
}

class Manager extends Thread {
    private BankAccount bankAccount;

    Manager(BankAccount account) {
        this.bankAccount = account;
    }

    @Override
    public void run() {
        System.out.println("Quan ly rut 2000");
        bankAccount.withDraw(2000);
    }
}

class BankAccountManager {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(10000);
        System.out.println("So tien hien co = " + account.getBalance());
        Manager manager = new Manager(account);
        Clerk clerk = new Clerk(account);
        manager.start();
        clerk.start();

        System.out.println("So tien con lai = " + account.getBalance());
        manager.join();
        clerk.join();
    }
}