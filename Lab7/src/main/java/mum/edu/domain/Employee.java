package mum.edu.domain;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Employee implements Serializable {
	
	
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Size(min=4, max=50, message="{Size}")
	@NotEmpty
	private String firstName;
	@NotEmpty
 	private String lastName;
	@Email
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
