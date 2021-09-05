package com.Client;

import com.Client.Model.object;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GenerateArrayLatLng implements Serializable {
    public List<object> generateArray(){
        List<object> list = new ArrayList<>();

        for (int i = 0;i<1;i++){
            object obj = new object();
            list.add(obj);
        }
        return list;
    }
}
