package com.test.login_register.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private Long id;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotEmpty(message = "Email should not be empty")
    @Email
    private String email;
    @NotEmpty(message = "Password should not be empty")
    private String password;
	public void setFirstName(String firstname) {
		this.firstName= firstname;
		
	}
	public void setLastName(String lastname) {
		this.lastName=lastname;
		
	}
	public void setEmail(String email2) {
		this.email= email2;
		
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getEmail() {
		return this.email;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getPassword() {
		return this.password;
	}
	
}