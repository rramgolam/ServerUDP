package com.company.udpserver;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(5000);

            while(true) {
                byte[] buffer = new byte[50];
                DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
                datagramSocket.receive(datagramPacket);     // blocks on this, waits for response

                System.out.println("Text received is : " + new String(buffer));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
