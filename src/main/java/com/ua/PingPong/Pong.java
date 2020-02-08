package com.ua.PingPong;

public class Pong extends Thread {

    private final Ping ping;
    int i;

    public Pong(Ping ping, int i) {
        this.ping = ping;
        this.i = i;
    }

    public void run(){

        try {
            ping.join();
        }catch (InterruptedException e){
            System.out.println("Wait for ping error");
        }
        System.out.println("Pong"+i);
    }


}
