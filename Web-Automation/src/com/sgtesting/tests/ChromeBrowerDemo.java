package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowerDemo {
public static  WebDriver oBrower=null;
	public static void main(String[] args) {
		lanchBrower();
		navigate();
		CloseApplication();
	}
	private static void lanchBrower()
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrower=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
private static void navigate()
{
	try
	{
		oBrower.get("http://localhost/login.do");
		Thread.sleep(5000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void CloseApplication()
{
	try
	{
		oBrower.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
