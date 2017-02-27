package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by dim3coder on 2/27/17.
 */
public class Client {

  public static void main(String[] args) {
    Socket socket = new Socket();
    try {
      socket.connect(new InetSocketAddress(55353));
      PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
      writer.println("Pavel");
      byte[] text = new byte[100];
      System.in.read(text);
      writer.println(new String(text));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
