package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Hashtable;
import java.util.Map;

/**
 * This sources is used for 20m exercises everyday. Do not pretend to find there clear, testable
 * code for reuse. May contain deadlock/exceptions/(placeholder for worstcase scenario)
 */
public class Main {

  public static Map<String, Socket> socketMap = new Hashtable<String, Socket>();
  public static ServerSocket serverSocket;

  public static void main(String[] args) throws IOException {
    serverSocket = new ServerSocket(55353);
    new Thread(acceptThread).start();
    new Thread(readThread).start();
    while (true) {
      ;
    }
  }


  public static Runnable acceptThread = () -> {
    while (true) {
      try {
        System.out.println("reading...");
        Socket socket = serverSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String name = null;
        name = br.readLine();
        System.out.println(name + " connected!");
        synchronized (socketMap) {
          socketMap.put(name, socket);
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  };

  public static Runnable readThread = () -> {
    while (true) {
      if (!socketMap.isEmpty()) {
        socketMap.forEach((s, socket) -> {
          try {
            if(!socket.isConnected())return;
            socket.setSoTimeout(3000);
            BufferedReader br = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            String text = br.readLine();
            if(text!=null && !text.isEmpty())System.out.println(s+": "+text);
          } catch (SocketException e) {
            e.printStackTrace();
          } catch (IOException e) {
            e.printStackTrace();
          }
        });
      }
    }
  };

}
