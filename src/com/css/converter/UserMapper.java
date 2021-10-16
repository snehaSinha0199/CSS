package com.css.converter;

import com.css.entity.Register;
import com.css.factory.CssFactory;

public interface UserMapper {
public abstract Register mapToUserEntity(com.css.vo.Register user);
public abstract com.css.vo.Register mapToUserModel(Register user);
	
}
