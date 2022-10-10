package com.Mou.Frame.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Amazon_Base__Class {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public Amazon_Base__Class () {      //Constructor
		
		 prop = new Properties();
		try {
			FileInputStream  flss = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\Mou\\Frame\\Configureeeee\\congigureee.properties");
			prop.load(flss);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void initBrowser () {
		
		String browserset=prop.getProperty("BROWSERS1");
		
		if (browserset.equals("CHROME")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\WeBDriver\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().timeouts().pageLoadTimeout(test_Data.pageLoadTimeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(test_Data.implicitlyWait, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Spring Chrome Browser Launch");
		
			
		}
		
		else if (browserset.equals("FF")) {
			
					
		}
				
		
	}
	public static void getURL (String URL) {
		driver.get(prop.getProperty("URL1"));
		
	}

}
