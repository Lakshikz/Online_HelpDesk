package com.user;

import java.util.List;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

public interface UserService {

	/** Initialize logger */
	public static final Logger log = Logger.getLogger(UserService.class.getName());

	public static boolean validate(String username, String password) {
		return false;
	}

	public static List<User> getUser(String username, String password) {
		return null;
	}

	public static boolean insertUser(String name, String email, String phone, String username, String password) {
		return false;
	}

	public static boolean updateUser(String iduser, String name, String email, String phone, String username,
			String password) {
		return false;
	}

	public static List<User> getUserDetails(String Id) {
		return null;
	}

	public static boolean deleteuser(String iduser) {
		return false;
	}

}
