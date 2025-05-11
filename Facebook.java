package week2.day2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args){
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://en-gb.facebook.com/");
        
        driver.manage().window().maximize();
        
        
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Kir");
        driver.findElement(By.name("lastname")).sendKeys("Lok");
        driver.findElement(By.name("reg_email__")).sendKeys("9765432089");
        driver.findElement(By.id("password_step_input")).sendKeys("Aathi@2021");
        
        WebElement date = driver.findElement(By.id("day"));
        Select select1 = new Select(date);
        //select1.selectByIndex(31);
        select1.selectByValue("31");
        
        
        WebElement month = driver.findElement(By.id("month"));
        Select select2 = new Select(month);
        select2.selectByValue("5");
        
        
        WebElement year = driver.findElement(By.id("year"));
        Select select3 = new Select(year);
        select3.selectByVisibleText("2021");
       
        
        driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
       
        
        //driver.close();
	}

}
