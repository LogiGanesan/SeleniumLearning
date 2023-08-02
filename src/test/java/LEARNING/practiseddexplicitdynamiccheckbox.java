package LEARNING;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practiseddexplicitdynamiccheckbox {

	public static void main(String[] args) throws InterruptedException {


			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(7));

			driver.get("https://rahulshettyacademy.com/loginpagePractise/");
			driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
			driver.findElement(By.name("password")).sendKeys("learning");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();
			WebElement dropdownselection = driver.findElement(By.xpath("//select[@class='form-control']"));
			Select dropdown = new Select(dropdownselection);
			dropdown.selectByVisibleText("Teacher");
			driver.findElement(By.id("terms")).click();
			driver.findElement(By.id("signInBtn")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
			List <WebElement> productslist = driver.findElements(By.cssSelector(".card-footer.btn-info"));			
			for (int i=0;i<productslist.size();i++)
			{
				productslist.get(i).click();
				
			}
		//	driver.switchTo().alert().accept();
			
			
			
	}

}
