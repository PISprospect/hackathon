package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyFirstTest1 extends BaseTest {

	
	@Test
	public static void LoginTest() throws InterruptedException
	{
		driver.findElement(By.xpath(loc.getProperty("username"))).sendKeys("akhila");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys("1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("comments"))).sendKeys("New test");
		Thread.sleep(3000);
		WebElement l = driver.findElement(By.xpath("//input[@name='filename']"));

		l.sendKeys("C:\\Users\\user\\Downloads\\tsting.txt");
		driver.findElement(By.xpath(loc.getProperty("checkbox"))).click();
		driver.findElement(By.xpath(loc.getProperty("checkbox1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("radio"))).click();
		driver.findElement(By.xpath(loc.getProperty("nav"))).click();
		driver.findElement(By.xpath(loc.getProperty("dropdown"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("submit"))).click();

		Thread.sleep(3000);
	}
	
	
}
