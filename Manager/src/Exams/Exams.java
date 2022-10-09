package Exams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exams {
	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.id("username")).sendKeys("manager@gmail.com");
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd@123");

		// Click login button
		WebElement loginButtonId = driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));
		loginButtonId.click();
		Thread.sleep(2000);

		// click Exam
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[4]/a/span")).click();

		// Click Exams
		driver.findElement(By.xpath("//*[@id=\"exams\"]/ul/li[1]/a")).click();

		// Search
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Entrance Exam");

		// Click Search
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/form/div/input[2]")).click();

		// Click name
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[1]/a")).click();

		// Name
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("Entrance Exam");

		// Instruction have to access

		// Min mark
		driver.findElement(By.xpath("//*[@id=\"add_exam\"]/div[1]/div[3]/label/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"add_exam\"]/div[1]/div[3]/label/input")).sendKeys("30");

		// Click Disable exam
		driver.findElement(By.xpath("//*[@id=\"add_exam\"]/div[1]/div[4]/div/label/input")).click();
		Thread.sleep(1000);

		// Click Update Button
		driver.findElement(By.xpath("//*[@id=\"submit_btn\"]")).click();
		Thread.sleep(1000);

		// Click Search
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/form/div/input[2]")).click();

		// Click name
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[1]/a")).click();

		// Click Disable exam
		driver.findElement(By.xpath("//*[@id=\"add_exam\"]/div[1]/div[4]/div/label/input")).click();
		Thread.sleep(1000);

		// Click Update Button
		driver.findElement(By.xpath("//*[@id=\"submit_btn\"]")).click();
		Thread.sleep(1000);

	}
}