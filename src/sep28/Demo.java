package sep28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo { 
	static
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}
    public static void main(String[] args)
    {
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.flipkart.com/");
    	Sample s=new Sample(driver);
    	s.username("9731561680");
    	s.password("6363056235");
    	s.submitbutton();
    	
    }
}
