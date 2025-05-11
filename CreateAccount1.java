package week2.day2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		
		String title = driver.getTitle();
        System.out.println(title);
        
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
	
		
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("accountName")).sendKeys("Isaivani1");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        
        Thread.sleep(1000);
        WebElement industry = driver.findElement(By.name("industryEnumId"));
        Select select1 = new Select(industry);
        select1.selectByValue("IND_SOFTWARE"); 	   
        
        WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
        Select select2 = new Select(ownership);
        select2.selectByVisibleText("S-Corporation");
        
        WebElement source = driver.findElement(By.id("dataSourceId"));
        Select select3 = new Select(source);
        select3.selectByValue("LEAD_EMPLOYEE");
        
        WebElement marketingCampaign = driver.findElement(By.id("marketingCampaignId"));
        Select select4 = new Select(marketingCampaign);
        select4.selectByIndex(6);
        
        
        Thread.sleep(1000);
        
        WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
        Select select5 = new Select(state);
        select5.selectByValue("TX");
        
        Thread.sleep(1000);
        
        driver.findElement(By.className("smallSubmit")).click();
        
        Thread.sleep(10000);
        String title1 = driver.getTitle();
        System.out.println(title);
        
        driver.close();
	}

}
