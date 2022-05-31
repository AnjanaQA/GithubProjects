package PracticeSeleniumDemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\eclipse-workspace\\AgSeleniumRevision\\driver\\Chromediver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'No')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Impressive')]")).click();
		
		

	}

}
