package week2.day1.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

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
        driver.findElement(By.id("accountName")).sendKeys("Isaivani2");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        driver.findElement(By.id("numberEmployees")).sendKeys("3");
        
        driver.findElement(By.className("smallSubmit")).click();
        
        Thread.sleep(100000);
        
        String title1 = driver.getTitle();
        System.out.println(title);
        driver.close();
	}

}
