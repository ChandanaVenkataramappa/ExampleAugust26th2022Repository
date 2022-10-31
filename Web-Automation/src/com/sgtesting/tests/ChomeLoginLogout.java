package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChomeLoginLogout {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lanchBrowser();
		navigate();
		login();
		flyoutWindow();
		logout();
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
	Thread.sleep(5000);	
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
	Thread.sleep(5000);
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
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void logout()
{
	try
	{
		oBrowser.findElement(By.linkText("Logout")).click();
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

