package com.hellofresh.challenge.scripts;

import com.hellofresh.challenge.contexts.CustomerDetailContext;
import com.hellofresh.challenge.documents.RegisterNewCustomerDocument;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * TEST CASE : UITC1_RegisterNewUser
 * DESCRIPTION : Create/Register new user
 * SOFT DEPENDENCY : N/A
 * HARD DEPENDENCY : N/A
 */

public class UITC1_RegisterNewUser extends StartDriver {
    @Test
    public void registerNewCustomer() {
        CustomerDetailContext context = new CustomerDetailContext();

        String timestamp = String.valueOf(new Date().getTime());
        context.setEmail("hf_challenge_" + timestamp + "@hf" + timestamp.substring(7) + ".com");
        context.setPassword("Qwerty");
        context.setFirstName("Firstname");
        context.setLastName("Lastname");
        context.setDay("1");
        context.setMonth("1");
        context.setYear("2000");
        context.setCompany("Company");
        context.setAddressLine1("Qwerty, 123");
        context.setAddressLine2("zxcvb");
        context.setCity("Qwerty");
        context.setState("Colorado");
        context.setPostcode("12345");
        context.setOther("Qwerty");
        context.setPhone("12345123123");
        context.setMobile("12345123123");
        context.setAlias("hf");

        RegisterNewCustomerDocument registerNewCustomerDocument = new RegisterNewCustomerDocument(context);
        registerNewCustomerDocument.registerNewCustomer();
    }
}
