package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login22 {

	
public static void login(){
		
		//System.setProperty("webdriver.edge.driver","C:\\Program Files\\driver\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("http://35.236.232.177/Identity/Account/Login?ReturnUrl=%2F");
	    driver.manage().window().maximize();
		/*driver.findElement(By.id("Input_Email")).sendKeys("admin@admin.com");
		driver.findElement(By.id("Input_Password")).sendKeys("Admin@123");*/
		

	}

	
}
