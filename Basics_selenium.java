package Jars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basics_selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver= new ChromeDriver();
		  driver.get("https://www.facebook.com/");
	      driver.manage().window().maximize();
	      driver.findElement(By.linkText("Create new account")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.name("firstname")).sendKeys("Himaja");
	      driver.findElement(By.name("lastname")).sendKeys("Singampalli");
	      driver.findElement(By.name("reg_email__")).sendKeys("singampallihimaja@gmail.com");
	      driver.findElement(By.name("reg_email_confirmation__")).sendKeys("singampallihimaja@gmail.com");
	      driver.findElement(By.name("reg_passwd__")).sendKeys("Himaja@2001");
	      new Select(driver.findElement(By.id("day"))).selectByIndex(16);
	      new Select(driver.findElement(By.id("month"))).selectByValue("8");
	      new Select(driver.findElement(By.id("year"))).selectByVisibleText("2001");
	      driver.findElement(By.xpath("//input[@name='sex']/preceding-sibling::label[text()='Female']")).click();
	      driver.findElement(By.name("websubmit")).click();
		}
	}


