package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem {
	public static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://dev69210.service-now.com/");
		driver.manage().window().maximize();
		
		//Login Page
		driver.switchTo().frame("gsft_main");
		driver.findElementById("user_name").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("India@1234");
		driver.findElementById("sysverb_login").click();
	
		
		//Problem
		driver.findElementByXPath("//input[@id='filter']").sendKeys("Problem",Keys.ENTER);
		
		//driver.findElementByXPath("//span[text()='Problem']").click();
		//System.out.println("Problem Click");
		
		Thread.sleep(10000);
		driver.findElementByXPath("(//div[text()='Create New'])[2]").click();
		System.out.println("Create New");
		
		//call
		
	}

}
