package com.model.sample.repository;

import com.model.sample.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,String> {
    @Query(value="{customerNum : ?0}")
    Customer findByCustomerNum(String no);
}
