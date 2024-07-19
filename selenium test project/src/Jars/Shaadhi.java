package Jars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shaadhi {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shaadi.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[text()='man' and @role='option']")).click();
		driver.findElement(By.xpath("//div[contains(@class, 'ageUpto')]/div/div/div[1]")).click();
		driver.findElement(By.xpath("//div[text()='30']")).click();

		
		}
}