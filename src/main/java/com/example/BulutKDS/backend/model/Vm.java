package com.example.BulutKDS.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vm {

    @Id
    private Integer vmID;
    private Integer vmType;
    private Integer vcpu;
    private String ram;
    private Integer ssd;
    private Integer hdd;
    private Integer nic;

    // Getter ve Setter metodları
}
