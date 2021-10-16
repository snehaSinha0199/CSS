package com.css.util;

import java.util.ResourceBundle;

import com.css.constant.AllFiles;
import com.css.constant.Message;
import com.css.repository.constant.DBInfo;

public class MessageBundle {
	public static String getDBInfo(String key) {
		ResourceBundle rb = ResourceBundle.getBundle(DBInfo.DB_FILE_NAME);
		return rb.getString(key);

	}
	public static String getAllFiles(String key) {
		ResourceBundle rb=ResourceBundle.getBundle(AllFiles.FILE_NAME);
		return rb.getString(key);
	}
	public static String getMessage(String key) {
		ResourceBundle rb=ResourceBundle.getBundle(Message.FILE_NAME);
		return rb.getString(key);
	}
}
