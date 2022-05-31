package PracticeSeleniumDemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\eclipse-workspace\\AgSeleniumRevision\\driver\\Chromediver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("item-0")).click();
		driver.findElement(By.id("userName")).sendKeys("Anjana");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Frisco Texas");
		driver.findElement(By.id("permanentAddress")).sendKeys("Texas USA");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//button[@id='submit']"));
		ele.click();
		
		

	}

}
