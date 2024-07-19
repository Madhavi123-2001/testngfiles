package Jars;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


	public class Microsoft_register {
		WebDriver driver;

			public static void main(String[] args) throws InterruptedException {
				Microsoft_register m1 =new Microsoft_register();
				m1.setUp("https://account.microsoft.com/account");
				m1.createAccount();
			 
			}
			private void setUp(String url) {
				// TODO Auto-generated method stub
				driver =  new ChromeDriver();
				driver.get(url);
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
			}
			public void createAccount() throws InterruptedException {
				driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div[1]/div/div/main/div[1]/div[1]/div/button/span/span/span")).click();
				driver.findElement(By.xpath("//a[text()='Create one!']")).click();
				driver.findElement(By.xpath("//input[@id='MemberName']" )).sendKeys("himajasingampalli17@gmail.com");
				driver.findElement(By.id("iSignupAction")).click();
				driver.findElement(By.xpath("//input[@id='PasswordInput']")).sendKeys("himaja@17");
				driver.findElement(By.id("iSignupAction")).click();
				new Select(driver.findElement(By.xpath("//select[@id='Country']"))).selectByValue("IN");
				new Select(driver.findElement(By.id("BirthMonth"))).selectByVisibleText("August");
				new Select(driver.findElement(By.id("BirthDay"))).selectByIndex(7);
				driver.findElement(By.id("BirthYear")).sendKeys("2001");
				driver.findElement(By.id("iSignupAction")).click();
			}
				

		}

