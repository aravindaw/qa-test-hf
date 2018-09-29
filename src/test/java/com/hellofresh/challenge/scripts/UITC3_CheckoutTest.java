package com.hellofresh.challenge.scripts;

import com.hellofresh.challenge.documents.CheckoutTestDocument;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UITC3_CheckoutTest extends StartDriver {
    /**
     * TEST CASE : UITC3_CheckoutTest
     * DESCRIPTION : Create/Register new user
     * SOFT DEPENDENCY : N/A
     * HARD DEPENDENCY : UITC2_LogInTest
     */
    @BeforeTest
    public void login() {
        new UITC2_LogInTest().logInTest();
    }

    @Test
    public void checkout() {
        CheckoutTestDocument checkoutTestDocument = new CheckoutTestDocument();
        checkoutTestDocument.checkout();
    }
}
