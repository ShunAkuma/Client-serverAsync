package com.java.Clientserver.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.scheduling.annotation.Async;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Table(name = "object")
@Async
public class Object {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lead_id = 0L;


    private Double lat;

    private Double lng;

    public Object() {
    }

    public Object(Double lat, Double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public Object(Long lead_id, Double lat, Double lng) {
        this.lead_id = lead_id;
        this.lat = lat;
        this.lng = lng;
    }
}
