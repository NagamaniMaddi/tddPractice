package com.agile.tddPractice;

public class CreateAccount {

	public String getSuccessMessage() {
		return "User Created Successfully";
    }
    
    public String getFailureMessage() {
		return "User Creation Failed";
	}

	public boolean isUserNameValid(String userName) {
		if((!userName.equals("")) 
		&& (userName != null) && (userName.matches("^[a-zA-Z]*$"))){
		return true;
		}
		return false;
	}

	

}
