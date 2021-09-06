package com.Client;

import java.io.*;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;


public class main {
    private static HttpURLConnection connection;
    public static void main(String[] args) throws IOException, InterruptedException {

        SendPostRequest post = new SendPostRequest();
        Thread firstThred = new Thread(new MyThread(post));
        firstThred.setName("First Thread!");

        Thread secondThred = new Thread(new MyThread(post));
        secondThred.setName("Second Thread!");

        Thread thirdThred = new Thread(new MyThread(post));
        thirdThred.setName("Third Thread!");

        firstThred.start();
        secondThred.start();
        thirdThred.start();

        for(int i = 0; i <= 3; i++){
            Thread th = new Thread(new MyThread(post));
            th.setName("Thread" + i);
            th.start();
        }


        List<Thread> list = new Hash<>();
        list.add();
    }
}
