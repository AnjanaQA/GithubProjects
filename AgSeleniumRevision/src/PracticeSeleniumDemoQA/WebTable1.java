package PracticeSeleniumDemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\eclipse-workspace\\AgSeleniumRevision\\driver\\Chromediver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Anjana");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Gautam");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("age")).sendKeys("38");
		driver.findElement(By.id("salary")).sendKeys("five Thousand per month");
		driver.findElement(By.id("department")).sendKeys("QA");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		driver.findElement(By.xpath("//div[@class='rt-table']")).isDisplayed();
		driver.close();

	}

}
