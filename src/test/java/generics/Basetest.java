package generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Basetest {

		protected WebDriver driver;
		protected String uname;
		protected String pass;
		protected String linkcreated1;
		protected String contentTitle;
		protected String instagramUrl;
		protected String instagramUsername;
		protected String instagramPassword;
		
		@BeforeClass
	    public void setUp() throws IOException {
			driver = new ChromeDriver();
			Properties pr = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\OpeninAppAssignment\\src\\test\\resources\\config.properties");
			pr.load(fis);
			String url = pr.getProperty("url");
			instagramUrl = pr.getProperty("instagramUrl");
			instagramUsername = pr.getProperty("instagramUsername");
			instagramPassword = pr.getProperty("instagramPassword");
			uname =pr.getProperty("email");
			pass =pr.getProperty("password");
			linkcreated1=pr.getProperty("Linkcreated1");
			contentTitle=pr.getProperty("ContentTitle");
			
			
	        driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		
	    }
		
		@AfterClass
		public void teardown() {
			//if(driver != null) {
			//driver.quit();
	}
	}



