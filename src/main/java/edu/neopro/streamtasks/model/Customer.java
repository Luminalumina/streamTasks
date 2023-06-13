package edu.neopro.streamtasks.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {
public String scroogeId;

    public Customer(String scroogeId) {
        this.scroogeId = scroogeId;
    }

    public Customer() {
    }

    public String getScroogeId() {
        return scroogeId;
    }

    public void setScroogeId(String scroogeId) {
        this.scroogeId = scroogeId;
    }
}
