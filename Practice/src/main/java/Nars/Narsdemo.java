package Nars;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Narsdemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://estate-manager-nar01.preprod.icloud.ingenico.com/emgui/login.jsp");
		driver.findElement(By.id("username")).sendKeys("Commdel-FIS.WP");
		driver.findElement(By.id("password")).sendKeys("Jiten@12345");
		driver.findElement(By.className("buttonlink")).click();
	
		
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(20))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='ul_terminals']//li[1]//a")));
		
		
		//driver.findElement(By.xpath("//ul[@id='ul_terminals']//li[1]//a")).click();

	}

}
