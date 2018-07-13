package seleniumframework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new  ChromeDriver();
		driver.get("http://mail.yahoo.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 60 );
		    wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));
		

			WebDriverWait wait1 = new WebDriverWait(driver, 60 );
			wait1.pollingEvery(5,TimeUnit.SECONDS);
			wait1.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.tagName("\\q"))));
			
			
			Alert alert = driver.switchTo().alert();
			alert.accept();
			alert.dismiss();
			
			driver.findElements(By.tagName("")).size();
			
			driver.switchTo().frame(3);
			driver.switchTo().frame("auto");
			driver.switchTo().frame(driver.findElement(By.className("ravi")).getAttribute(""));
			
		
	}

}
