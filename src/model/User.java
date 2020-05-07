package model;

import java.time.LocalDate;

public class User {
	String name;
	//String email;
	String dob;
	String gender;
	
	//Get name of the user
	public String getName() {
		return name;
	}
	
	//Set name of the user
	public void setName(String name) {
		this.name = name;
	}
	
	//Get email of the user
	//public String getEmail() {
	//	return email;
	//}
		
	//Set email of the user
	//public void setEmail(String email) {
	//	this.email = email;
	//}
	
	//Get dob of the user
	public String getDob() {
		return dob;
	}
			
	//Set dob of the user
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	//Get the gender of user
	public String getGender() {
		return gender;
	}
	
	//Set the gender of user
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//Constructor with 3 arguments
	public User(String name, String gender, String dob){
		this.name = name;
		//this.email = email;
		this.dob = dob;
		this.gender = gender;
	}
}