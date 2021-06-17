package com.agile.tddPractice;

import static org.junit.Assert.assertEquals;
import org.junit.Test; 

public class CreateUserTest{

   /* @Test

     public void shouldGetSuccessMessageOnAccountCreation(){

         CreateUser1 createUser = new CreateUser1();
        String result =  createUser.userName();
        assertEquals("User Creation Successful", result);

        
     }

     @Test

     public void shouldGetFailureMessageOnAccountCreation(){

         CreateUser1 createUserFailed = new CreateUser1();
        String result =  createUserFailed.userNameFailed();
        assertEquals("User Creation Failed", result);

        
     }*/

     @Test

     public void userNameIsValid(){

         CreateUser1 createUser = new CreateUser1();
        String result =  createUser.isValidUserName("abc");
        assertEquals("User Creation Successful", result);

        
     }

     @Test

     public void shouldFailWhenUserNameCntainsNumbers(){

         CreateUser1 createUserFailed = new CreateUser1();
        String result =  createUserFailed.isValidUserName("123");
        assertEquals("User Creation Failed", result);

        
     }

     @Test

     public void shouldFailWhenUserNameIsNull(){

         CreateUser1 createUserFailed = new CreateUser1();
        String result =  createUserFailed.isValidUserName(null);
        assertEquals("User Creation Failed", result);

        
     }

     @Test

     public void shouldFailWhenUserNameIsEmpty(){

         CreateUser1 createUserFailed = new CreateUser1();
        String result =  createUserFailed.isValidUserName("");
        assertEquals("User Creation Failed", result);

        
     }

     @Test

     public void shouldGetSuccessMessagenUserCreation(){

        CreateUser1 createUser = new CreateUser1();
        String result =  createUser.userCreation("Ram","pwd");
        assertEquals("User Creation Successful", result);

        
     }

     @Test

     public void shouldGetFailWherUserIsNotCreated(){

         CreateUser1 createUserFailed = new CreateUser1();
        String result =  createUserFailed.userCreation("Ram123","pwd");
        assertEquals("User Creation Failed", result);

        
     }

     @Test

     public void shouldGetFailWherUserIsNotCreatedWithoutPasswrd(){

         CreateUser1 createUserFailed = new CreateUser1();
        String result =  createUserFailed.userCreation("Ram",null);
        assertEquals("User Creation Failed", result);

        
     }


     
 }