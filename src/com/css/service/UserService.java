package com.css.service;

import com.css.response.Response;
import com.css.vo.Register;

public interface UserService {
public abstract Response addUser(Register user);
public abstract Response verifyUser(Register user);
public abstract Response getUser(String email);
}
