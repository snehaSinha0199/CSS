package com.css.service.serviceimpl;

import com.css.converter.UserMapper;
import com.css.factory.CssFactory;
import com.css.repository.UserRepository;
import com.css.response.Response;
import com.css.service.UserService;
import com.css.vo.Register;

public class UserServiceImpl implements UserService {
private UserRepository repo;
private UserMapper mapper;
private Register user;

	public UserServiceImpl() {
	super();
	this.repo=CssFactory.getUserRepositoryInstance();
	this.mapper=CssFactory.getUserMapperInstance();
	this.user=CssFactory.getRegisterInstance();
}

	@Override
	public Response addUser(Register user) {
	return repo.addUser(mapper.mapToUserEntity(user));
		
		
	}

	@Override
	public Response verifyUser(Register user) {
		return repo.verifyUser(mapper.mapToUserEntity(user));
	}

	@Override
	public Response getUser(String email) {
		return repo.forgetPassword(email);
	}
}
