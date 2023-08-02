package LEARNING;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginautomation {

	public static void main(String[] args) {

		
		
		 // selenium 4.6.0 donot have this System.setProperty
 
	//	System.setProperty("weddriver.chrome.driver","C:\\Users\\loges\\Downloads\\chrome-win64\\chrome-win64.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("logeshraja96@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("8527485");
		driver.findElement(By.className("submit")).click();
		// CSS selection below
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		// link text selection below should contain anchor tag <a then it is linking text.
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		// CSS selection ("tagName[attribute='value']")
		
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("logeshraja");
		
		// (//tagName[@attribute='value']")) to find own xPath
		
		driver.findElement(By.xpath("//input[@placeholder='email')[2]")).sendKeys("logeshraja96@gmail.com");
		
		
		
		
		

	}

}
