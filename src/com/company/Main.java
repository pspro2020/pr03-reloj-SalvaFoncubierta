package com.company;

public class Main {

    public static void main(String[] args) {
	    Thread thread = new Thread(new Watch());
	    thread.start();
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
        thread.interrupt();
        System.out.println("El hilo secundario ya ha terminado de ejecutarse.");
    }
}
