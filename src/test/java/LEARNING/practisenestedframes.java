package LEARNING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practisenestedframes {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");


		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		System.out.println(driver.findElement(By.tagName("frame")).getSize());
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		System.out.println(driver.switchTo().frame(driver.findElement(By.id("content"))));

		
		
	}

}
