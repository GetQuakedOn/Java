package com.java.practice.p10;

public class Employee extends Person {

    private String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void Display() {
        System.out.println(super.getName());
        System.out.println(company);
    }
}
