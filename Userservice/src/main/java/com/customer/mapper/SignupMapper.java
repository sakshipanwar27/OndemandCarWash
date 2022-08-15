package com.customer.mapper;

import org.springframework.stereotype.Component;

import com.customer.model.Signup;

@Component
public class SignupMapper {

	
	public Signup mapDtoToEntity(Signup signup) {
		 
		Signup signentity = new Signup();
		signentity.setId(signup.getId());
		signentity.setName(signup.getName());
		signentity.setPassword(signup.getPassword());
		signentity.setConfirmpassword(signup.getConfirmpassword());
		signentity.setContactno(signup.getContactno());
		signentity.setEmail(signup.getEmail());
		return signentity;
	}

		
}
