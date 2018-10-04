package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constant;
import generic.Excel;

public class SearchProduct implements Auto_constant
{
	static
	{
		System.setProperty(Key, Value);
	}
	public static void main(String[] args)
	{
		String search=Excel.abc(excelPath, "Sheet1", 16, 2);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(search);
		driver.findElement(By.className("nav-input")).click();
		

}
}
