package com.css.repository;

import com.css.entity.Register;
import com.css.response.Response;

public interface UserRepository {
public abstract Response addUser(Register user);
public abstract Response verifyUser(Register user);
public abstract Response forgetPassword(String email);
}
