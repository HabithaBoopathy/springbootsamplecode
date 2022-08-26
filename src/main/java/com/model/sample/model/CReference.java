package com.model.sample.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reference")
public class CReference {
    private String id;
    private int customerNum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }
}
