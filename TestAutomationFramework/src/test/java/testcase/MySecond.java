package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import base.BaseTest2;

@Test
public class MySecond extends BaseTest2 {
	public static void LoginTest1() throws InterruptedException {

	driver.findElement(By.xpath(loc.getProperty("clour"))).sendKeys("125,100,135");
	Thread.sleep(3000);
	driver.findElement(By.xpath(loc.getProperty("date"))).sendKeys("10/9/2023");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath(loc.getProperty("email"))).clear();
		driver.findElement(By.xpath(loc.getProperty("email"))).sendKeys("akhilavemulapalli1@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath(loc.getProperty("month"))).sendKeys("October");
	driver.findElement(By.xpath(loc.getProperty("month"))).sendKeys(Keys.TAB);
	driver.findElement(By.xpath(loc.getProperty("month"))).sendKeys("2023");
	Thread.sleep(3000);
	driver.findElement(By.xpath(loc.getProperty("number"))).clear();
	driver.findElement(By.xpath(loc.getProperty("number"))).sendKeys("45");
	Thread.sleep(3000);
	driver.findElement(By.xpath(loc.getProperty("submit"))).click();
	Thread.sleep(3000);
}
}
