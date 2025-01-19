package com.example.BulutKDS.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VmpmMapping {

    @Id
    private Integer mappingID;
    private Integer vmID;
    private Integer pmID;
    private boolean mappingStatus;
    private boolean state;
    private boolean assignmentTime;
    private boolean closingTime;

    // Getter ve Setter metodları
}
