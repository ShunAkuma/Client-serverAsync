package com.Client.Model;



import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class object implements Serializable {
    private Double lat;
    private Double lng;
    private Long lead_id;
    private Long count = 0L;
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
