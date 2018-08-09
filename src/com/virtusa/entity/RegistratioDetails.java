package com.virtusa.entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class RegistratioDetails {
	@NotNull(message = "First Name cannot be null")
	private String firstName;
	@NotNull(message = "Last Name cannot be null")
	private String lastName;	
	
	@Max(message="Provide valid phone number", value = 10)
	private Long phoneNumber;

    @Email(message = "Email should be valid")
	private String email;
    
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public RegistratioDetails() {
		
	}
	public RegistratioDetails(String firstName, String lastName,Long phoneNumber,String email) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	
}
