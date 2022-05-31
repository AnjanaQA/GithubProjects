package PracticeSeleniumDemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\eclipse-workspace\\AgSeleniumRevision\\driver\\Chromediver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(" //div[@id='tree-node']")).click();
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
