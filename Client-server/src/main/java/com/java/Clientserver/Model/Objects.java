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
public class Objects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Integer lead_id;

    private Double lat;

    private Double lng;

    public Objects() {
    }

    public Objects(Double lat, Double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public Objects(Integer lead_id, Double lat, Double lng) {
        this.lead_id = lead_id;
        this.lat = lat;
        this.lng = lng;
    }
}
