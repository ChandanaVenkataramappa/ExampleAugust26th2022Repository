package com.sgtesting.pracaticeprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeNavigation {
private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lanch();
		navigate();
		search();
	}
private static void lanch()
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
		oBrowser.get("https://youtube.com/");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void search()
{
	try
	{
		oBrowser.findElement(By.name("search_query")).sendKeys("KannadaSongs");
		oBrowser.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(5000);
		oBrowser.findElement(By.id("hover-overlays")).click();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
