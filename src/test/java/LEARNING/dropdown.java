package LEARNING;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();



		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");

	//	driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		
		WebElement dd1 = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		// if select in dropdown then it is static dropdown

		Select dd2 = new Select(dd1);
		dd2.selectByIndex(1);

		System.out.println(dd2.getFirstSelectedOption().getText());

		dd2.selectByValue("AED");

		System.out.println(dd2.getFirstSelectedOption().getText());

		dd2.selectByVisibleText("USD");

		System.out.println(dd2.getFirstSelectedOption().getText());



	}



}
