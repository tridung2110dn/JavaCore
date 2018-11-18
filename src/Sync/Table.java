package Sync;

class Table {

    void printTable(int n) {   // method not synchronized
        for (int i = 1; i < +5; i++) {
            System.out.println(n*i);
        }
        try{
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread1 extends Thread {

    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        System.out.println("Thread 1");
        t.printTable(5);
    }
}

class MyThread2 extends Thread {

    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        System.out.println("Thread 2");
        t.printTable(100);
    }
}

class TestSynchronization {
    public static void main(String[] args) {
        Table obj = new Table(); // only one obj
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
