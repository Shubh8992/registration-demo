package com.persistent.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistent.registration.model.User;
import com.persistent.registration.repository.RegistrationRepository;


@Service		
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository repo;
	
	public User saveUser(User user)
	{
		return repo.save(user);
	}
	
	public User fetchUserByEmailId(String emailId)
	{
		return repo.findByEmailId(emailId); 	//customized method
		
	}
	
	public User fetchUserByEmailIdAndPassword(String emailId, String password)
	{
		return repo.findByEmailIdAndPassword(emailId, password);	//customized method
		
	}
}
