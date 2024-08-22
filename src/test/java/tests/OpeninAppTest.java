package tests;

import java.util.Properties;

import org.testng.annotations.Test;

import Pages.Dashboardpage;
import Pages.InstagramPage;
import Pages.Loginpage;
import generics.Basetest;


public class OpeninAppTest extends Basetest {
	private Properties properties;
	private Loginpage loginpage;
	private Dashboardpage dashboardpage;
	private InstagramPage instagramPage; 
	
	
	@Test(priority = 0, enabled = true)
	public void login() throws InterruptedException {
		properties = new Properties();
		loginpage = new Loginpage(driver);
		
		loginpage.loginUser();
		loginpage.enterusername(uname);
		loginpage.enterpassword(pass);
	}
	
	@Test (priority = 1, enabled = true)
	public void topSecretlink() throws InterruptedException {
		properties = new Properties();
		dashboardpage = new Dashboardpage(driver);
		String[] links = linkcreated1.split(",");
		String[] titles = contentTitle.split(",");
		
		for(int i = 0; i < links.length; i++) {
			dashboardpage.topSecretclick();
			dashboardpage.createLink(links[i]);
			dashboardpage.setTitle(titles[i]);
			Thread.sleep(5000);
		}
		
	}
	
	@Test(priority = 2)
	public void LoginInstagramPage() throws InterruptedException {
	    properties = new Properties();
	    instagramPage = new InstagramPage(driver);
	    driver.get(instagramUrl);

	    
	    instagramPage.login(instagramUsername, instagramPassword);
	    Thread.sleep(5000);

	    
	    String[] links = linkcreated1.split(",");
	    instagramPage.clickOnProfileSection();
	    instagramPage.editProfile();
	    instagramPage.updateBioSequentially(links);
	    instagramPage.saveProfile();

	   
	    String expectedBio = String.join("\n", links);
	    assert instagramPage.verifyBioUpdate(expectedBio) : "Bio was not updated correctly!";

	    
	    instagramPage.clickEachBioLink();
	}

}
