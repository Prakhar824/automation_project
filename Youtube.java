package project;
//this is to automate youtube;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Youtube {
	public static WebDriver driver;
	//public static WebElement element;
	public static String str,s1;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-udemy\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
		}
	
	@Test
	public void search() {
	WebElement element = driver.findElement(By.id("search"));
	element.sendKeys("iphone");
	WebElement element2=driver.findElement(By.id("search-icon-legacy"));
	element2.click();	
	}
	
	@AfterTest
	public static void afterTest() throws InterruptedException {
		System.out.println("Successful");
		Thread.sleep(20000);
		driver.quit();
	}

}
