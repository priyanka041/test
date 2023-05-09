package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login_page {

	
public static  void HDFC1() throws  InterruptedException  {
		
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://estate-manager-nar01.preprod.icloud.ingenico.com/emgui/login.jsp");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("username")).sendKeys("Commdel-FIS.WP");
		driver.findElement(By.id("password")).sendKeys("Jiten@12345");
		
}	
}
