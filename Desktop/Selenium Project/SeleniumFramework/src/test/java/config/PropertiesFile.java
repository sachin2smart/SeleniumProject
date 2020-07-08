package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import testng.TestNG_demo;

public class PropertiesFile {
	static  String Projectpath = System.getProperty("user.dir");
	static Properties prop = new Properties();
	
	public static void main(String[] args) throws IOException {
		getProperties();
		setProperties();
	}
	
	public static void getProperties() throws IOException {
		try {
		InputStream input = new FileInputStream(Projectpath+"\\src\\test\\java\\config\\config.properties");
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		TestNG_demo.browsername=(browser);
		
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

	public static void setProperties() throws IOException {
		try {
		OutputStream output = new FileOutputStream(Projectpath+"\\src\\test\\java\\config\\config.properties");
	     prop.setProperty("Result", "Pass");
	     prop.store(output, null);
		
		} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		e.printStackTrace();
	}
	}
	}

