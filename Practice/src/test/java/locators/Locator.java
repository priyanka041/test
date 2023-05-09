package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.edge.driver","C:\\Program Files\\driver\\msedgedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
	   
		driver.get("http://35.236.232.177/Identity/Account/Login?ReturnUrl=%2F");
	    driver.manage().window().maximize();
		driver.findElement(By.id("Input_Email")).sendKeys("admin@admin.com");
		driver.findElement(By.id("Input_Password")).sendKeys("Admin@123");
		driver.findElement(By.id("login-submit")).click();
		

	}

}
