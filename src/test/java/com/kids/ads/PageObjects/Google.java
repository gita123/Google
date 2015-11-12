package com.kids.ads.PageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.FindBy;

public class Google {
	
	WebDriver driver;
	public String browser;
	
	@FindBy(css=".social-icon-on.gplus-on")
	private WebElement gplus;
	
	@FindBy(css=".social-icon-on.facebook-on")
	private WebElement facebook;
	
	@FindBy(css=".social-icon-on.twitter-on")
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
	
	public void open(String url, String browser) throws InterruptedException {
	
		if(browser.equals("Firefox"))
			driver = new FirefoxDriver();
		else if(browser.equals("Chrome"))
			driver = new ChromeDriver();
		else
			System.out.println("Intialize the new driver here");
		
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		}
	
	public void getBrowser(String browser){
		if(browser.equalsIgnoreCase("Firefox")){
			driver = new FirefoxDriver();
			System.out.println("Firefox browser started");
		}
		else if(browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
			System.out.println("Chrome browser started");
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
