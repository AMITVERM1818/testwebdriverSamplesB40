package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		getAttribute() method
		driver.get("https://automationbookstore.dev/");
		driver.findElement(By.xpath("//input[@id='searchBar']")).sendKeys("Test");
		String strPlaceHolder = driver.findElement(By.id("searchBar")).getAttribute("placeholder");
		System.out.println(strPlaceHolder);
		
//		isDisplayed() method
		WebElement closeIcon = driver.findElement(By.cssSelector("a[title='Clear text']"));
		System.out.println(closeIcon.isDisplayed());
		if(closeIcon.isDisplayed()) {
			closeIcon.click();
		}
		

	}
	
}


