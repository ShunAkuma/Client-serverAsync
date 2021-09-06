package com.Client;

import java.io.*;
import java.net.HttpURLConnection;


public class main {
    private static HttpURLConnection connection;
    public static void main(String[] args) throws IOException, InterruptedException {

        SendPostRequest post = new SendPostRequest();
        post.PostRequest();
        
    }
}
