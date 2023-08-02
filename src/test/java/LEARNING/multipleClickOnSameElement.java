package LEARNING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleClickOnSameElement {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();



		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");

	//	driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		
	driver.findElement(By.id("divpaxinfo")).click();
	 
	Thread.sleep(2000);
	
	int i=1;
	while(i<5)
		//	for (int i=1;i<10;i++)
	{
		Thread.sleep(i);
		driver.findElement(By.xpath("//*[@id=\"hrefIncAdt\"]")).click();
		i++;
	}
	driver.findElement(By.cssSelector("input.buttonN")).click();
	
	 String gettext = driver.findElement(By.id("divpaxinfo")).getText();
	 System.out.println(gettext);
	 
	
	}
}



	