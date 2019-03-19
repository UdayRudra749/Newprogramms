package p1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		Properties myProperties=new Properties();
		myProperties.setProperty("user_name","sa");
		myProperties.setProperty("password","sa");
		myProperties.setProperty("dbname","test");
		FileWriter file=new FileWriter("test.properties");
		myProperties.store(file,"new Properties File");
		
	}

}

