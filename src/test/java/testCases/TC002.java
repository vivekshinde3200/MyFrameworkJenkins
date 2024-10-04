package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002 {
	
	@Test
	public void test1() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/radio-button");
		Actions act = new Actions(driver);
		
		WebElement scroll = driver.findElement(By.xpath("//div[.='Forms']"));
		act.moveToElement(scroll).perform();
		
		WebElement yes=driver.findElement(By.xpath("//label[@for='yesRadio']"));
		yes.click();
		
		System.out.println(yes.isSelected()+": Result of yes.isSelected method ");
		//----> Check why this line is giving output as false
		
		String yesText= driver.findElement(By.xpath("//span[.='Yes']")).getText();
	}
}
