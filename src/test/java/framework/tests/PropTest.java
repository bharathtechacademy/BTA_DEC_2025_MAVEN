package framework.tests;

import java.util.Properties;

import framework.utilities.PropUtil;

public class PropTest {

	public static void main(String[] args) {
		
		//Read the data from property file
		Properties prop = PropUtil.readData("Config.properties");
		
		//Print the data from property file for the Key "APP_URL"
		System.out.println(prop.getProperty("app.url"));

	}

}
