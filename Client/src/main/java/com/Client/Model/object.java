package com.Client.Model;



import java.io.Serializable;
import java.math.BigDecimal;


public class object implements Serializable {
    private Double lat;
    private Double lng;
    private Integer lead_id;
    private Integer count = 0;
    public object() {
        count++;
        this.lead_id = count;
        this.lat = randomGenerateLat();
        this.lng = randomGenerateLng();
    }

    public Double randomGenerateLat(){
        this.lat = (Math.random() * 90);
        BigDecimal a = new BigDecimal(lat);
        BigDecimal roundOff = a.setScale(3, BigDecimal.ROUND_HALF_EVEN);
        return roundOff.doubleValue();
    }
    public Double randomGenerateLng(){
        this.lng =(Math.random() * 90);
        BigDecimal a = new BigDecimal(lng);
        BigDecimal roundOff = a.setScale(3, BigDecimal.ROUND_HALF_EVEN);
        return roundOff.doubleValue();

    }

    public Double getLat() {
        return lat;
    }
    public Double getLng() {
        return lng;
    }

}
