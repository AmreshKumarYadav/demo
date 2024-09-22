package amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealmeProd {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.linkText("Mobiles")).click();
		
		driver.findElement(By.xpath("//*[text()='realme']/preceding-sibling::div")).click();
		int totMobileCount = 0;
		WebElement next = driver.findElement(By.xpath("//*[text()='Next']"));

	
		//	WebElement next = driver.findElement(By.xpath("//*[text()='Next']"));
			List<WebElement> listOfMobile=driver.findElements(By.xpath("//*[@data-component-type='s-search-result']"));
			int mobileCount=listOfMobile.size();
			
			for (int i=1;i<=16;i++)
			{
				if(next.isDisplayed())
				{
					next.click();
					Thread.sleep(5000);
					totMobileCount+=mobileCount;
					next = driver.findElement(By.xpath("//*[text()='Next']"));

				}

			
			
			//System.out.println(mobileCount);
			
						
			//

			
		}
		System.out.println(totMobileCount);
		
		
		
		
		
	}

}
