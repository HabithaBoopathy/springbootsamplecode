package com.model.sample.controller;

import com.model.sample.model.CReference;
import com.model.sample.repository.CReferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/reference")
@CrossOrigin(origins = "*")
public class CReferenceController {
    @Autowired
    private CReferenceRepository cReferenceRepository;

    @GetMapping
    public CReference getReference() {
        return cReferenceRepository.findAll().get(0);
    }

    @GetMapping("/increment/customerNum")
    public Boolean incrementCustomerRef() {
        CReference cReference = cReferenceRepository.findAll().get(0);
        cReference.setCustomerNum(cReference.getCustomerNum() + 1);
        cReferenceRepository.save(cReference);
        return true;
    }
}
