package com.agile.tddPractice; 
 
 
 import static org.junit.Assert.assertEquals; 
 //import static org.junit.Assert.assertFalse; 
 //import static org.junit.Assert.assertNotNull; 
 //import static org.junit.Assert.assertTrue; 
 
 
 //import org.junit.Assert; 
 import org.junit.Test; 
 
 
 public class CreateAccountTest { 

    @Test
    public void shouldGetASuccessMessageOnSuccessOfCreateUserAccount(){
        //Arrange
        CreateAccount crateAccount = new CreateAccount();
        //Act
        String result = crateAccount.getSuccessMessage();
        //Assert
        assertEquals("User Created Successfully",result);
    }

    @Test
    public void shouldGetAFailureMessageOnUserAccountCreationFailure(){
        //Arrange
        CreateAccount crateAccount = new CreateAccount();
        //Act
        String result = crateAccount.getFailureMessage();
        //Assert
        assertEquals("User Creation Failed",result);
    }
 }