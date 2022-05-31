package PracticeSeleniumDemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\eclipse-workspace\\AgSeleniumRevision\\driver\\Chromediver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	    
	    driver.findElement(By.xpath("//div/div/span[@id='edit-record-1']")).click();
	    driver.findElement(By.xpath("//input[@id='firstName'and @value='Cierra']")).sendKeys(" Vega");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@id='submit']")).click();
	    driver.close();

	}

}
