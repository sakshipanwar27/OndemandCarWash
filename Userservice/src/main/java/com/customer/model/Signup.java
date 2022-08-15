package com.customer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "signup")
public class Signup {

	@Id
	private Long id;
	private String name;
	private String username;
	private String password;
	private String confirmpassword;
	private String contactno;
	private String email;

	
	public static final String SEQUENCE_NAME = "users_sequence";

	public Signup() {
		super();
	}

	public Signup(String name, String username, String password, String confirmpassword, String contactno,
			String email) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.contactno = contactno;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}

	@Override
	public String toString() {
		return "Signup [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + ", contactno=" + contactno + ", email=" + email + "]";
	}

}