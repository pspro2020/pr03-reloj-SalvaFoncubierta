package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Watch implements Runnable{

    @Override
    public void run() {

        while (!Thread.currentThread().isInterrupted()){
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();
            System.out.println("Hora actual: " + dateFormat.format(date));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
