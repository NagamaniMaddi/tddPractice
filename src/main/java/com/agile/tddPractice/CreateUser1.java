package com.agile.tddPractice;

public class CreateUser1 {

	private String userName() {
		return "User Creation Successful";
	}

	private String userNameFailed() {
		return "User Creation Failed";
	}

	public String isValidUserName(String userName) {
		String result ="";
		if(userName!=null && !"".equals(userName) && userName.matches("^[a-zA-Z]*$")){
		result =  userName();
			
		}else{
			result = userNameFailed();
		}	
		return result;
		
	}

	public String userCreation(String userName, String passwd) {
		String result="";
		if("User Creation Successful".equals(isValidUserName(userName)) && passwd!=null){
			result = userName();
		}else{
			result = userNameFailed();
		}
		return result;
	}

}
