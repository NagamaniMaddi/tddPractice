package com.agile.tddPractice;
import static org.junit.Assert.*;
//import org.junit.Assert;
import org.junit.Test;
 
public class AppTest {
 

 @Test
 public void getSuccessMessage(){
      A a = new A();
      String result = a.getSuccessMessage("John");
      assertEquals("User Created Successfully", result);
 }

 @Test
 public void getFailureMessage(){
    A a = new A();
    String result =  a.getSuccessMessage("John123");
    assertEquals("User Creation Failed", result);
}

@Test

public void userNameShouldContainLettersOnly(){
    A a = new A();
    boolean result = a.userNameValid("John");
    assertTrue(result);
}

@Test

public void userNameContainOtherthanLettersOnly(){
    A a = new A();
    boolean result = a.userNameValid("123John");
    assertFalse(result);
}
 
    
}