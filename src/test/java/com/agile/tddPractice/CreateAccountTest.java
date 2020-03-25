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
        assertEquals("Usr Created Successfully",result);
    }
 }