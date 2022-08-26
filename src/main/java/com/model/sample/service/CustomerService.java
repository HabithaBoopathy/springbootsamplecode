package com.model.sample.service;

import com.model.sample.model.Customer;
import com.model.sample.repository.CReferenceRepository;
import com.model.sample.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;


    public List<Customer> customerList = new CopyOnWriteArrayList<>();

    public Customer addCustomer(Customer customer) {
        return customerRepository.insert(customer);
    }

    public List<Customer> getCustomer() {
        return customerRepository.findAll();
    }
        public Customer updateCustomer(Customer customer){

            return customerRepository.save(customer);

        }
    }
