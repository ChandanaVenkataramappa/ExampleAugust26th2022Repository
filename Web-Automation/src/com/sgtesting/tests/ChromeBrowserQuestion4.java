package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserQuestion4 {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		lanchBrowser();
		navigate();
		login();
		flyoutWindow();
		createCustomer();
		deleteCustomer();
		logOut();
		
		closeApplication();
}
	public static void lanchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
		Thread.sleep(2000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}

	}
	private static void flyoutWindow()
	{
		try
		{
		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Allen");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void logOut()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
		e.printStackTrace();	
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
	 

