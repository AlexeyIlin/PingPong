package com.ua.PingPong;

public class Ping extends Thread{

    int i;
    public Ping(int i) {
        this.i = i;
    }

    @Override
    public void run(){

        try {
            Ping.sleep(2000); //Just simulation
        } catch (InterruptedException e){
            System.out.println("Exception");
        }
        System.out.println("Ping"+i);
    }

}
