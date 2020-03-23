package com.agile.tddPractice;

public class A {

	public String getSuccessMessage(String userName) {
        if(userNameValid(userName)){
            return "User Created Successfully";
        }
		return "User Creation Failed";
	}

	

	
    public boolean userNameValid(String userName) {
        boolean atLeastOneNumber = false;
        char[] userNameCharArray = userName.toCharArray();

        for (char ch : userNameCharArray) {
            if (Character.isDigit(ch)) {
                atLeastOneNumber = true;
            }
        }
       
        return !atLeastOneNumber;
    }

}
