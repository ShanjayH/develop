package Candiate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deleting_lead {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shanj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		driver.get("http://ec2-65-1-5-19.ap-south-1.compute.amazonaws.com:8000/");
		Thread.sleep(3000);

		driver.findElement(By.linkText("LOGIN")).click(); // using Selenium click button method
		Thread.sleep(3000);

		// Enter unsername and password
		driver.findElement(By.id("username")).sendKeys("alokkumar@nttf.co.in");
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd@123");

		// Click login button
		WebElement loginButtonId = driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));
		loginButtonId.click();
		Thread.sleep(2000);

		// Click Candidate button
		WebElement can = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/a"));
		can.click();

		// Click leads
		driver.findElement(By.xpath("//*[@id=\"candidate\"]/ul/li[1]/a")).click();

		// click searbox
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Shanjay");

		// click search button
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/form[1]/div/input[2]")).click();

		// click name
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[1]/a")).click();

		// click delete
		driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[2]/a[2]")).click();

		// More info
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[7]/a")).click();

		// click delete
		driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[2]/a[2]")).click();

		// click goback
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[8]/button")).click();

		// click delete
		driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[2]/a[2]")).click();

		// click confirm delete
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[8]/a")).click();

	}
}
