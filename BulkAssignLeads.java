package Candiate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BulkAssignLeads {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shanj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		driver.get("http://ec2-65-1-5-19.ap-south-1.compute.amazonaws.com:8000/");
		Thread.sleep(2000);

		driver.findElement(By.linkText("LOGIN")).click(); // using Selenium click button method
		Thread.sleep(2000);

		// Enter unsername and password
		driver.findElement(By.id("username")).sendKeys("manager@gmail.com");
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd@123");

		// Click login button
		WebElement loginButtonId = driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));
		loginButtonId.click();
		Thread.sleep(2000);

		// Click Candidate button
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/a")).click();
		Thread.sleep(1000);

		// Click bulk Assign Leads
		driver.findElement(By.xpath("//*[@id=\"candidate\"]/ul/li[2]/a")).click();
		Thread.sleep(2000);

		// click Unassigned leads
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/form[2]/div/label/input")).click();

		// Select team
		WebElement st = driver.findElement(By.xpath("//*[@id=\"agent\"]"));
		Select team = new Select(st);
		team.selectByIndex(1);

		// Click checkbox
		driver.findElement(By.xpath("//*[@id=\"select_all\"]")).click();
		Thread.sleep(1500);

		// Click Assign Button
		driver.findElement(By.xpath("//*[@id=\"assignLeads\"]")).click();
        
	}
}