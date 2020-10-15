package com.company;

public class Shelter {

    private String company;
    private String address;

    public Shelter(String company, String address) {
        this.company = company;
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }
}
