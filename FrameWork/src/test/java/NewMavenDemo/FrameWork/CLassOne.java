package NewMavenDemo.FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class CLassOne {
	
	
	@Test
	public void MavenReview() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ar");
		
		Thread.sleep(3000);
		
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option : options)
		                                  { 
			
			if(option.getText().equalsIgnoreCase("Argentina")) { 
				
				option.click();
				
				break;  
			}
		}
		
		Thread.sleep(3000);
		
		
		driver.quit();
		
		

		

	}
	
	@Test
	 public void mavenMethodTwo() {
 	 System.out.println("Printing mavenMethodTwo ");
 	}
		
		
		
	

}
