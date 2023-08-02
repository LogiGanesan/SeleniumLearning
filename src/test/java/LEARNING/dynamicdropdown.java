package LEARNING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();



		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");

		//	driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();		
		driver.findElement(By.xpath("//td[@class='mapbg']//a[@value='CCU']")).click();
		//	driver.findElement(By.xpath("//td[@class='mapbg']//a[@value='PNQ']")).click();

		// parent child relation xpath for dynamic dropdowns


		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

	}
}