package com.agile.tddPractice;

public class CreateAccount {

	public String getSuccessMessage() {
		return "User Created Successfully";
    }
    
    public String getFailureMessage() {
		return "User Creation Failed";
	}

	public boolean isUserNameValid(String userName) {
		if((userName != null) && (!userName.equals("")) && (userName.matches("^[a-zA-Z]*$")) 
		&& (userName.length()<=11) && (userName.length()>=1)){
			return true;
		}
			return false;
	}

	public boolean isPasswordValid(String password) {
		if(password == null || password.isEmpty() || (!password.matches("[0-9]+")))
			return false;
		else
			return true;
	}

	

}
