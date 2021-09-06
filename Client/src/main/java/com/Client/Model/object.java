package com.Client.Model;



import java.io.Serializable;
import java.math.BigDecimal;


public class object implements Serializable {
    private Double lat;
    private Double lng;
    private Long lead_id;
    public object() {
        this.lead_id = randomGenerateLead_id();
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

    public Long randomGenerateLead_id(){
        return (long) (Math.random() * ((10000 - 1) + 1)) + 1;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLng() {
        return lng;
    }

    public Long getLead_id() {
        return lead_id;
    }
}
