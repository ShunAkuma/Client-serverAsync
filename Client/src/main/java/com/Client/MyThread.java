package com.Client;

import lombok.SneakyThrows;

public class MyThread implements Runnable{

    private SendPostRequest sendPostRequest;
    public MyThread(SendPostRequest sendPostRequest){
        this.sendPostRequest = sendPostRequest;
    }


    @SneakyThrows
    @Override
    public void run() {
        System.out.println("Calling from : " +  Thread.currentThread().getName());
        this.sendPostRequest.PostRequest();
    }
}
