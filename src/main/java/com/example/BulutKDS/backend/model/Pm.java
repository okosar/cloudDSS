package com.example.BulutKDS.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pm {

    @Id
    private Integer pmID;
    private String producer;
    private String model;
    private String cpu;
    private Integer core;
    private Integer ram;
    private Integer hdd;
    private Integer ssd;
    private Double nic;
    private Integer year;
    private Integer status;

    // Getter ve Setter metodları
}
