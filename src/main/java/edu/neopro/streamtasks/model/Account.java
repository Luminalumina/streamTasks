package edu.neopro.streamtasks.model;

import org.springframework.stereotype.Component;

@Component
public class Account {
    public String iban;
    public String scroogeId;
    public String customerScroogeId;

    public Account(String iban, String scroogeId, String customerScroogeId) {
        this.iban = iban;
        this.scroogeId = scroogeId;
        this.customerScroogeId = customerScroogeId;
    }

    public Account() {
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getScroogeId() {
        return scroogeId;
    }

    public void setScroogeId(String scroogeId) {
        this.scroogeId = scroogeId;
    }

    public String getCustomerScroogeId() {
        return customerScroogeId;
    }

    public void setCustomerScroogeId(String customerScroogeId) {
        this.customerScroogeId = customerScroogeId;
    }
}
