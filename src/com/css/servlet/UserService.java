/*
 * package com.css.servlet;
 * 
 * import java.sql.Connection; import java.sql.PreparedStatement; import
 * java.sql.ResultSet; import java.sql.SQLException;
 * 
 * import com.css.util.JdbcUtil;
 * 
 * 
 * 
 * public class UserService { public boolean verifyUser(String email,String pwd)
 * { final String sql="SELECT * FROM register WHERE email=? AND pwd=?"; boolean
 * isVerified=false;//flag try(Connection
 * con=JdbcUtil.getMySqlConnection();PreparedStatement
 * ps=con.prepareStatement(sql)){ ps.setString(1, email); ps.setString(2, pwd);
 * ResultSet rs = ps.executeQuery(); rs.next();
 * System.out.println(rs.getString(1) +" "+ rs.getString(2));
 * if(rs.getString(1).equals(email) && rs.getString(2).equals(pwd))
 * isVerified=true;
 * 
 * } catch (SQLException e) { e.printStackTrace(); } return isVerified; } }
 * 
 * 
 * 
 */