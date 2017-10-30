package com.test.helpers;

import java.io.InputStream;

import java.util.Properties;


import com.test.entity.SignInUser;




import com.test.entity.WebUrl;
import com.test.utils.FileUtils;


public class DataHelper {
	
	private static SignInUser userFromProperties = null;
	
	
	private static WebUrl urlFromProperties = null;
	
	

	
	private static Properties properties;
	
	
	
	
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String BASE_URL = "base_url";
	private static final String USER_NAME = "email";
	private static final String PASSWORD = "password";
	//private static final String TARGET_URL = "target_url";
	private static final String SIGNUP_USER_NAME = "signup_name";
	private static final String SIGNUP_EMAIL = "signup_email";
	private static final String SIGNUP_PASSWORD = "signup_password";	
	private static final String SIGNUP_URL = "signup_url";

   
	public static WebUrl getUrlFromPropertiesFile() {
		DataHelper.getReadPropertiesFile();		
		//String url = properties.getProperty(TARGET_URL);
		String url = getLoginURL();
		urlFromProperties = new WebUrl();
		urlFromProperties.setTarget_url(url);
        return urlFromProperties;
	}
	
	public static SignInUser getUserFromPropertiesFile() {
		DataHelper.getReadPropertiesFile();
		String email = properties.getProperty(USER_NAME);
		String password = properties.getProperty(PASSWORD);
		userFromProperties = new SignInUser();
		userFromProperties.setEmail(email);
		userFromProperties.setPassword(password);
		return userFromProperties;
	}
	
	
	
	
	public static String getLoginURL() 
	{
		String baseUrl = null;
		if(System.getenv("TEST_URL") != null){
			baseUrl = System.getenv("TEST_URL");
			System.out.println("environment >"+baseUrl);
		}else{
			baseUrl = getProperty(BASE_URL);
			System.out.println("property >"+baseUrl);

		}
		baseUrl = baseUrl.trim();
		
		if(baseUrl.endsWith("/")){
			baseUrl = baseUrl.substring(0, baseUrl.length()-1);
		}
		return baseUrl; 
	}
	
	public static String getProperty(String  key){
		if(properties == null){
			getUserFromPropertiesFile();
		}
		return properties.getProperty(key);
	}
	
	
	public static void getReadPropertiesFile() {
		if(userFromProperties == null || urlFromProperties ==null){
			InputStream is = null;
			try{
				is = FileUtils.readFileFromClassPath(TEST_PARAMETER_PROPERTIES);
				properties = new Properties();
				properties.load(is);
				
			}catch(Exception e){
				e.printStackTrace();
				throw new RuntimeException(e);
			}finally{
				FileUtils.close(is);
			}	
		}
	}
	
	
	
	
}
