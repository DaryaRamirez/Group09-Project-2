package com.syntax.Group09Project2;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration reg=new Registration();
        reg.setEmail("yahoo");
        System.out.println(reg.getEmail());
        reg.setUserName("dasha2022");
        System.out.println(reg.getUserName());
        reg.setPassword("123456$$");
        System.out.println(reg.getPassword());

    }
}
