package com.java.Clientserver.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.scheduling.annotation.Async;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Table(name = "perobject")
@Async
public class perobject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long lead_id;
    private Double lat;
    private Double lng;

    public perobject() {
    }

}
