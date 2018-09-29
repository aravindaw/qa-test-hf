package com.hellofresh.challenge.scripts;

import com.hellofresh.challenge.contexts.CustomerDetailContext;
import com.hellofresh.challenge.documents.LogInTestDocument;
import org.testng.annotations.Test;

public class UITC2_LogInTest extends StartDriver{
    /**
     * TEST CASE : UITC2_LogInTest
     * DESCRIPTION : Login with existing user
     * SOFT DEPENDENCY : N/A
     * HARD DEPENDENCY : N/A
     */
    @Test
    public void logInTest() {
        CustomerDetailContext context = new CustomerDetailContext();

        context.setEmail("hf_challenge_123456@hf12345.com");
        context.setPassword("12345678");
        context.setAccountName("Joe Black");

        LogInTestDocument logInTestDocument = new LogInTestDocument(context);
        logInTestDocument.logInTest();
    }
}
