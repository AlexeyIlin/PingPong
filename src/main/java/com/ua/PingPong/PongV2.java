package com.ua.PingPong;

public class PongV2 implements Runnable {

    private final Thread pingV2;
    int i;

    public PongV2(Thread pingV2, int i) {
        this.pingV2 = pingV2;
        this.i = i;
    }

    public void run(){

        try {
            pingV2.join();
        }catch (InterruptedException e){
            System.out.println("Wait for ping error");
        }
        System.out.println("PongV2"+i);
    }

}
