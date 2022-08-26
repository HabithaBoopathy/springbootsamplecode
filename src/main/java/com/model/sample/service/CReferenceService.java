//package com.model.sample.service;
//
//import com.model.sample.model.CReference;
//import com.model.sample.model.Customer;
//import com.model.sample.repository.CReferenceRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.concurrent.CopyOnWriteArrayList;
//
//@Service
//public class CReferenceService {
//    @Autowired
//    CReferenceRepository cReferenceRepository;
//
//    public CReference addReference(CReference cReference) {
//        return cReferenceRepository.insert(cReference);
//    }
//
//    public List<CReference> getReference() {
//        return cReferenceRepository.findAll();
//    }
//
//    public CReference getReference(String no) {
//
//        Optional<CReference> optional = cReferenceRepository.findById(no);
//        if (optional.isPresent()) {
//            return optional.get();
//        } else {
//            return null;
//        }
//    }
//}
