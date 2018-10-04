package scripts;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constant;
import generic.Excel;

public class Validlogin implements Auto_constant

{
	static
	{
		System.setProperty(Key, Value);
	}
	public static void main(String[] args)
	{
		String us=Excel.abc(excelPath, "Sheet1", 4, 2);
		String pwd=Excel.abc(excelPath, "Sheet1", 6, 2);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email")).sendKeys(us);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(pwd);
		driver.findElement(By.id("signInSubmit")).click();
	}
}
		
		
		
	
