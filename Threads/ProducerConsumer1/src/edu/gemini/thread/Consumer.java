package edu.gemini.thread;

public class Consumer extends Thread {

    private Manager manager;

    public Consumer(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void run() {
        int value = 0;
        for (int i = 0; i < Manager.COUNT; i++) {
            value = manager.get();
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
}
