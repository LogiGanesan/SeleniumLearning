package LEARNING;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practise2formdropdowncheckbox
{

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("logeshraja");
		driver.findElement(By.name("email")).sendKeys("logeshraja96@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("8667387437");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropdown  = driver.findElement(By.id("exampleFormControlSelect1"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Male");
		System.out.println(select.getFirstSelectedOption().getText());
		driver.findElement(By.cssSelector(".form-check.form-check-inline")).click();
		String gettext = driver.findElement(By.cssSelector(".form-check.form-check-inline")).getText();
		System.out.println(gettext);
		driver.findElement(By.name("bday")).sendKeys("26-07-2023");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

	}

}
