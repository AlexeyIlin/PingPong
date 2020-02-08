package com.ua.PingPong;

public class PingPong {

    public static void main(String[] args){

        System.out.println("PingPong started");

        for (int i = 0 ; i < 3 ; i++) {

            Ping ping = new Ping(i);
            Pong pong = new Pong(ping,i);
            ping.start();
            pong.start();

            try {
                ping.join();
                pong.join();
            } catch (InterruptedException e) {
                System.out.println("Thread broken");
            }
        }

        System.out.println("PingPong ended");



    }
}
