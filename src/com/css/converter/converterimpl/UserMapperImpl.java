package com.css.converter.converterimpl;

import com.css.converter.UserMapper;
import com.css.entity.Register;

public class UserMapperImpl implements UserMapper {

	@Override
	public Register mapToUserEntity(com.css.vo.Register user) {
		Register entity = new Register();
		entity.setFirstName(user.getFirstName());
		entity.setLastName(user.getLastName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
		entity.setDob(user.getDob());
		entity.setState(user.getState());
		entity.setGender(user.getGender());
		entity.setPassword(user.getPassword());
		entity.setConfirmPassword(user.getConfirmPassword());
		return entity;
	}

	@Override
	public com.css.vo.Register mapToUserModel(Register user){
		/*
		 * Register entity=new Register(); model.setUserName(user.getUserName());
		 * model.setPass(user.getPass()); return model;
		 */
		return null;
	}
}
