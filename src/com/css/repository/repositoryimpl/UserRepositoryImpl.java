package com.css.repository.repositoryimpl;

import com.css.entity.Register;
import com.css.factory.CssFactory;
import com.css.repository.UserRepository;
import com.css.repository.template.JdbcTemplate;
import com.css.response.Response;

public class UserRepositoryImpl implements UserRepository{
private JdbcTemplate temp;

	public UserRepositoryImpl() {
	super();
	this.temp=CssFactory.getJdbcTemplateInstance();
	
}

	@Override
	public Response addUser(Register user) {
		return temp.addUser(user);
		
	}

	@Override
	public Response verifyUser(Register user) {
		return temp.verifyUser(user);
	}

	@Override
	public Response forgetPassword(String email) {
		return temp.getUser(email);
	}

}
