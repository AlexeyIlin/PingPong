package com.ua.PingPong;

public class PingV2 implements Runnable {

    int i;
    Pong pong;

    public PingV2(Pong pong, int i) {
        this.i = i;
        this.pong = pong;
    }

    public void run(){
        try {
            pong.join();
            Ping.sleep(1000); //Just simulation
        } catch (InterruptedException e){
            System.out.println("Exception");
        }
        System.out.println("PingV2"+i);
    }

}
