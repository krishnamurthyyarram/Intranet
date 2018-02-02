package com.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Jenkins/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://services3.postnord.se/pkimse/api/login/LoginHandler_do.jsp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div/input[@id=\"username\"]")).sendKeys("linusk1");
		driver.findElement(By.xpath("//div/input[@id='password']")).sendKeys("hejlinus123");
		driver.findElement(By.xpath("//div/button[@title=\"Fortsätt\"]")).click();
		Thread.sleep(10000);
		driver.navigate().refresh();
		// driver.quit();
		

	}

}
