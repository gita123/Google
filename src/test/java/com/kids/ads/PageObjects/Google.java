package com.kids.ads.PageObjects;

import java.io.IOException;
import java.net.MalformedURLException;
//import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
//import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.FindBy;



public class Google {
	
	WebDriver driver;
	
	public String browser;
	
	@FindBy(css=".social-icon-on.gplus-on")
	private WebElement gplus;
	
	@FindBy(css="li.social-link.social-link--facebook")
	private WebElement facebook;
	
	@FindBy(css="li.social-link.social-link--twitter")
	private WebElement twitter;
	
	@FindBy(className="lockup-logo")
	private WebElement logo;
	
	@FindBy(css=".lockup-brand")
	private WebElement brand;
	
	@FindBy(css=".keep-capture")
	private WebElement capture_section;
	
	@FindBy(css=".keep-capture__title")
	private WebElement capture_title;
	
	@FindBy(css=".keep-capture__sub-title")
	private WebElement capture_sub_title;
	 
	public Google(WebDriver driver) {
	this.driver = driver;
	}
	
	public void open() throws InterruptedException, MalformedURLException {
		String browser = System.getProperty("browser");
		String env = System.getProperty("env");
		if(browser.equals("Firefox"))
			driver = new FirefoxDriver();
		else if(browser.equals("Chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("phantom"))
			driver = new PhantomJSDriver();
		else if(browser.equalsIgnoreCase("GRID_CHROME")){
 		    DesiredCapabilities capability = DesiredCapabilities.chrome();
//			DesiredCapabilities capability= new DesiredCapabilities();
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		}
		else if(browser.equalsIgnoreCase("GRID_FIREFOX")){
			DesiredCapabilities capability= new DesiredCapabilities();
			capability.setBrowserName("firefox");
			capability.setCapability("platform", "MAC");
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		}
		
		if(env.equalsIgnoreCase("CI"))
			driver.get("https://www.google.com/keep/");
		else if(env.equalsIgnoreCase("SI"))
			driver.get("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		}
	
	public void getBrowser(String browser) throws IOException{
//		DesiredCapabilities capability= new DesiredCapabilities();
//		capability.setBrowserName(browser);
		if(browser.equalsIgnoreCase("Firefox")){
			driver = new FirefoxDriver();
			System.out.println("Firefox browser started");
		}
		else if(browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
			System.out.println("Chrome browser started");
		}
		else if(browser.equalsIgnoreCase("phantom")){
//			driver = new PhantomJSDriver();
			System.out.println("PhantomJS started");
		}
		else if(browser.equalsIgnoreCase("GRID_CHROME")){
 		    DesiredCapabilities capability = DesiredCapabilities.chrome();
//			DesiredCapabilities capability= new DesiredCapabilities();
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		}
		else if(browser.equalsIgnoreCase("GRID_FIREFOX")){
			DesiredCapabilities capability= new DesiredCapabilities();
			capability.setBrowserName("firefox");
			capability.setCapability("platform", "MAC");
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		}
	}
	
		 
	public void close() {
		driver.quit();
	}
		
	public boolean elementExists(String ele){
		if(ele !=null)
			return true;
		return false;
	}
		
		public String get_text_from_brand(){
			String text = brand.getText();
			return text;
		}
		
		public void click_on_google_keep(){
			WebElement ele = driver.findElement(By.cssSelector(".keep-header .split-button-main-button>a"));
			ele.click();
		}
		
		public void get_goole_keep_versions(){
			List<WebElement> elements = driver.findElement(By.cssSelector(".split-button-container--open .split-button-child-buttons")).findElements(By.tagName("a"));
			for(int i = 0; i < elements.size(); i++) {
	            System.out.println(elements.get(i).getText());
	        }
		}
		
		public boolean is_capture_section_exists(){
			if(capture_section.isDisplayed())
				return true;
			return false;
		}
		
		public String get_capture_title(){
			WebElement capture_title = driver.findElement(By.cssSelector(".keep-capture__title"));
			return (capture_title.getText());
		}
		
		public String get_capture_sub_title(){
			WebElement capture_sub_title = driver.findElement(By.cssSelector(".keep-capture__sub-title"));
			return (capture_sub_title.getText());
		}
		
		public void verify_capture_item_containers(){
			
			List<WebElement> item_containers = driver.findElements(By.cssSelector(".keep-item-container"));
			for(int i = 0; i < item_containers.size(); i++) {
	            System.out.println(item_containers.get(i).getText());
	        }
		}

}
