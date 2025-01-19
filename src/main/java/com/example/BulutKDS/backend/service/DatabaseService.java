package com.example.BulutKDS.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.BulutKDS.backend.repository.PmRepository;
import com.example.BulutKDS.backend.repository.VmRepository;
import com.example.BulutKDS.backend.repository.MappingRepository;

@Service
public class DatabaseService {

    @Autowired
    private PmRepository pmRepository;

    @Autowired
    private VmRepository vmRepository;

    @Autowired
    private MappingRepository mappingRepository;

    public void performSomeOperation() {
        // İş mantığı, örneğin veritabanı verilerini işleyebilirsiniz.
    }
}
