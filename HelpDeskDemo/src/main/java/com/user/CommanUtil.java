package com.user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.user.UserService;
 

/**
 * This is the common utility class to load all property details at once when it
 * is initializing .
 */
public  class CommanUtil {

	/** Initialize logger */
	public static final Logger log = Logger.getLogger(UserService.class.getName());

	public static final Properties properties = new Properties();

	static {
		try {
			
			// Read the property only once when load the class
			properties.load(QueryUtil.class.getResourceAsStream(CommonConstants.PROPERTY_FILE));
			
		} catch (IOException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
	}
}
