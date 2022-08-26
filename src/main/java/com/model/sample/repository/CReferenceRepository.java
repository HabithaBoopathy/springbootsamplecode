package com.model.sample.repository;

import com.model.sample.model.CReference;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CReferenceRepository extends MongoRepository<CReference,String> {

}
