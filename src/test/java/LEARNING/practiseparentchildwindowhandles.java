package LEARNING;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiseparentchildwindowhandles {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.partialLinkText("Multiple")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		String getchildwindowtext = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(getchildwindowtext);
		driver.switchTo().window(parentwindow);
		System.out.println(driver.findElement(By.xpath(".//h3[text()='Opening a new window']")).getText());
		
	}

}
