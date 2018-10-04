package sep28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample {
@FindBy(xpath="//input[@class='_2zrpKA']")
private WebElement usernametb;

@FindBy(xpath="//input[@type='password']")
private WebElement passwordtxtbox;

@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
private WebElement submitbutton;

public Sample(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void username(String dummy)
{
usernametb.sendKeys(dummy);
}
public void password(String pasww)
{
passwordtxtbox.sendKeys(pasww);
}
public void submitbutton()
{
submitbutton.click();
}
}

