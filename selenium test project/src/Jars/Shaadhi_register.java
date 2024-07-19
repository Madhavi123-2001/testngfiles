package Jars;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shaadhi_register {

	public static void main(String[] args) {
		
		WebDriver driver;
		Web
		Actions action;
		public static void main(String[] args) {
			Shaadhi_register s1 = new Shaadhi_register();
			s1.setUp("https://www.shaadi.com/");
		    s1.registershaadhi();
		}
		public void setUp(String url) {
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			action = new Actions(driver);
		}
		public void quitDriver() {
			driver.quit();
		}
		public void registershaadhi() {
		}

}
