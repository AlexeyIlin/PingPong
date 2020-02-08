package com.ua.PingPong;

public class PingPong {

    public static void main(String[] args){

        System.out.println("PingPong started");

        for (int i = 0 ; i < 3 ; i++) {

            Ping ping = new Ping(i);
            Pong pong = new Pong(ping,i);
            ping.start();
            pong.start();

            Thread pingV2 = new Thread(new PingV2(pong, i));
            Thread pongV2 = new Thread(new PongV2(pingV2, i));

            pingV2.start();
            pongV2.start();

            try {
                ping.join();
                pong.join();
                pingV2.join();
                pongV2.join();

            } catch (InterruptedException e) {
                System.out.println("Thread broken");
            }
        }

        System.out.println("PingPong ended");



    }
}
