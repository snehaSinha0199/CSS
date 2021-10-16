package com.css.repository.constant;

public class SQLBuilder {
	public static final String INSERT_USER = "insert into user_registration(first_name,last_name,email,phone,dob,gender,state,pwd) values(?,?,?,?,?,?,?,?)";
	public static final String SELECT_USER="select * from register WHERE email=? AND pwd=?";
	public static final String PASSWORD_RECOVERY="select pwd from register where email=?";
}
