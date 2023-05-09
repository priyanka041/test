package Nars;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NarsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://35.236.232.177/Identity/Account/Login?ReturnUrl=%2F");
		driver.findElement(By.cssSelector("#Input_Email")).sendKeys("admin@admin.com");
		driver.findElement(By.cssSelector("input#Input_Password")).sendKeys("Admin@123");
		driver.findElement(By.cssSelector("button#login-submit")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("#eId")).sendKeys("7054555");
		//driver.findElement(By.cssSelector("#fa fa-search")).click();
		
	}

}
