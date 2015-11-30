package com.kids.ads.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EnvironmentSetup {
	
	public WebDriver driver;
	
	public void configBrowsers() throws MalformedURLException{
	String browser = System.getProperty("browser");
	
	if(browser.equals("Firefox"))
		driver = new FirefoxDriver();
	else if(browser.equals("Chrome"))
		driver = new ChromeDriver();
	else if(browser.equalsIgnoreCase("phantom"))
		driver = new PhantomJSDriver();
	else if(browser.equalsIgnoreCase("GRID_CHROME")){
		    DesiredCapabilities capability = DesiredCapabilities.chrome();
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
	}
	else if(browser.equalsIgnoreCase("GRID_FIREFOX")){
		DesiredCapabilities capability= new DesiredCapabilities();
		capability.setBrowserName("firefox");
		capability.setCapability("platform", "MAC");
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
	}
	
	}
	
	public void configEnvironments(){
		
		String env = System.getProperty("env");
		if(env.equalsIgnoreCase("CI"))
			driver.get("https://www.google.com/keep/");
		else if(env.equalsIgnoreCase("SI"))
			driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
	public void open_browser() throws MalformedURLException{
		
		configBrowsers();
		configEnvironments();
	}
	
}
