package com.test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Opening Browser in Chrome
		System.setProperty("webdriver.chrome.driver", "D://Jenkins/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://postnord.sharepoint.com/sites/intranetat/SitePages/Home.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		//login to Sharepoint Intranet
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("krishnamurthy.yarram@postnord.com",Keys.ENTER);
		Thread.sleep(1000);
		driver.get("https://KRYA300:London11@idp.ess.postnord.com/adfs/ls/wia?client-request-id=e074369e-80d5-5000-c7e1-e265375c52c7&username=krishnamurthy.yarram%40postnord.com&wa=wsignin1.0&wtrealm=urn%3afederation%3aMicrosoftOnline&wctx=LoginOptions%3D3%26estsredirect%3d2%26estsrequest%3drQIIAZ2RvW_TQADFfXFqpRUSFRNjh05Uju8jd-eLxHC-8y0MASTaBalyax9xoTnHdhAw8Sd0YmRgQcrIhBhYI3XqABLqBEzAhGBhQmCxMCLe8PTG937vio-GaLwN_4iEnYfQWhQeFl36S_Wljc2nrH3_9rF3ffXhY8Fv31wtAZm2bdWMo6hyTTtzdT5splldVK6ctcNDdxztW1cfN1Fe2Gxxrx1mTfXgJQBnAHwCYNmbc6mR4lhJhKjCWmDCaAoNx5wnMU2RwrGUBCVQixShJA2NjHkstSJaEJUmhDGGE6FTbORIUcYTBrXmlCQacoixEWLEJaeGYqMMZfC8d3EiF-0Ud-bq8lHxrbfeddzvFiz9f2Lxwt8WyEJBGQuzmMJwZLMiPDgoUIhFlpMYjjJs2akfuKqYlflZH3zpX4D-eDDY2PQue1vejz54tvab6BP-_fP5u5_XXj9_sxqYgXe6Fu2qW3d3Jrbk80Y4tFstTDSpj-S8uAGtLu_vHe3stQ8XKnd30qt4jE4CcBIEXwPv1fr_nPEL0&cbcxt=&mkt=&lc=");
		System.out.println("Executed");
		System.out.println(driver.getTitle());
		//Click on Settings Page
		driver.findElement(By.xpath("//i[@class=\"ms-Icon ms-Icon--Settings\"]")).click();
		Thread.sleep(1000);
		WebElement ele= driver.findElement(By.xpath("//div/span[text()='Cancel']"));
		System.out.println(ele.getText());
		ele.click();
		System.out.println("Successfully clicked on Cancel Button");
		driver.close();
		
		

	}

}
