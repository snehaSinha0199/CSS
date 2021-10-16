package com.css.factory;

import com.css.converter.UserMapper;
import com.css.converter.converterimpl.UserMapperImpl;
import com.css.exception.ErrorMessage;
import com.css.repository.UserRepository;
import com.css.repository.repositoryimpl.UserRepositoryImpl;
import com.css.repository.template.JdbcTemplate;
import com.css.response.Response;
import com.css.service.UserService;
import com.css.service.serviceimpl.UserServiceImpl;
import com.css.vo.Register;

public class CssFactory {
	public static Response getResponseInstance() {
		return new Response();
	}

	public static ErrorMessage getErrorMessageInstance() {
		return new ErrorMessage();
	}
	public static Register getRegisterInstance() {
		return new Register();
	}
	public static UserService getUserServiceInstance() {
		return new UserServiceImpl();
	}

	public static UserRepository getUserRepositoryInstance() {
		return new UserRepositoryImpl();
	}

	public static UserMapper getUserMapperInstance() {
		return new UserMapperImpl();
	}

	public static JdbcTemplate getJdbcTemplateInstance() {
		return new JdbcTemplate();
	}

}
