package com.kids.ads.code;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google{
	
	final WebDriver driver;
	
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
	
	@FindBy(css=".keep-header .split-button-main-button>a")
	public WebElement tryGoogle;
	
	
	
	public Google(WebDriver driver){
		this.driver=driver;
	}
	
	public void open() throws InterruptedException, MalformedURLException {
		
		EnvironmentSetup env = new EnvironmentSetup();
		env.configBrowsers();
		env.configEnvironments();
//		driver = env.getDriver();
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
			tryGoogle.click();
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
