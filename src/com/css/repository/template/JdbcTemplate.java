package com.css.repository.template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.css.constant.Message;
import com.css.entity.Register;
import com.css.exception.DataAccessException;
import com.css.exception.ErrorMessage;
import com.css.factory.CssFactory;
import com.css.repository.constant.QueryConstant;
import com.css.repository.constant.SQLBuilder;
import com.css.repository.util.JdbcUtil;
import com.css.response.Response;
import com.css.util.MessageBundle;

public class JdbcTemplate {
private Response res;
private ErrorMessage error;

public JdbcTemplate() {
	super();
	this.res=CssFactory.getResponseInstance();
	this.error=CssFactory.getErrorMessageInstance();
}
//insert into user_registration(first_name,last_name,email,phone,dob,gender,state,pwd)
public Response addUser(Register user) {
	try(Connection con=JdbcUtil.getConnection();PreparedStatement ps=con.prepareStatement(SQLBuilder.INSERT_USER)){
		ps.setString(QueryConstant.ONE,user.getFirstName());
		ps.setString(QueryConstant.TWO, user.getLastName());
		ps.setString(QueryConstant.THREE, user.getEmail());
		ps.setLong(QueryConstant.FOUR, user.getPhone());
		ps.setString(QueryConstant.FIVE, user.getDob());
		ps.setString(QueryConstant.SIX, user.getGender());
		ps.setString(QueryConstant.SEVEN, user.getState());
		ps.setString(QueryConstant.EIGHT, user.getPassword());
		//ps.setString(QueryConstant.NINE, user.getConfirmPassword());
		ps.executeUpdate();
		res.setSuccess(true);
		res.setMessage("Your account is created.Please Login.");
		
	} catch (SQLException e) {
		
		e.printStackTrace();
		error.setMessage("error occured while inserting user detail");
		throw new DataAccessException(error);
	}
	return res;
}
public Response verifyUser(Register user) {
	try(Connection con=JdbcUtil.getConnection();PreparedStatement ps=con.prepareStatement(SQLBuilder.SELECT_USER)){
		ps.setString(QueryConstant.ONE, user.getEmail());
		ps.setString(QueryConstant.TWO, user.getPassword());
		ResultSet rs = ps.executeQuery();
		if(rs!=null && rs.next()) {
			res.setSuccess(true);
			res.setMessage(MessageBundle.getMessage(Message.VALID_ACCOUNT));
			res.setData(rs.getString(1));
		}
		else {
			res.setSuccess(false);
			res.setMessage(MessageBundle.getMessage(Message.INVALID_ACCOUNT));
		}
	} catch (SQLException e) {
		e.printStackTrace();
		error.setMessage("error occured while verifying user account");
		throw new DataAccessException(error);
	}
	return res;
}
public Response getUser(String email) {
	try(Connection con=JdbcUtil.getConnection();PreparedStatement ps=con.prepareStatement(SQLBuilder.PASSWORD_RECOVERY)){
		ps.setString(QueryConstant.ONE, email);
		ResultSet rs = ps.executeQuery();
		if(rs!=null && rs.next()) {
			res.setSuccess(true);
		
	}
		else {
			res.setSuccess(false);
			res.setMessage(MessageBundle.getMessage(Message.INVALID_EMAIL));
		}
	}
	catch (SQLException e) {
		e.printStackTrace();
		error.setMessage("error occured while verifying user account");
		throw new DataAccessException(error);
	}
	return res;
	}
}

