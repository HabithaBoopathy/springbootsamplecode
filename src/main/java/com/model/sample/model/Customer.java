package com.model.sample.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customer")
public class Customer {
    private int customerNum;
    private String sampleDate;
    private String customerName;


    public int getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }

    public String getSampleDate() {
        return sampleDate;
    }

    public void setSampleDate(String sampleDate) {
        this.sampleDate = sampleDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
