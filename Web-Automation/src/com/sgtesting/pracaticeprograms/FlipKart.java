package com.sgtesting.pracaticeprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		 navigate();
		 flipKart();
	}
	private static void launch()
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
		oBrowser.get("https://www.flipkart.com/");
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
private static void flipKart()
{
	try
	{
		oBrowser.findElement(By.xpath("//button[text()='✕']")).click();
		oBrowser.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[1]/div/img")).click();
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
