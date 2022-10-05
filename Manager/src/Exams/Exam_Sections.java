package Exams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exam_Sections {
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
		driver.findElement(By.id("username")).sendKeys("alokkumar@nttf.co.in");
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd@123");

		// Click login button
		WebElement loginButtonId = driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));
		loginButtonId.click();
		Thread.sleep(2000);

		// click Exam
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[4]/a/span")).click();

		// Click Exam Sections
		driver.findElement(By.xpath("//*[@id=\"exams\"]/ul/li[3]/a")).click();

		// Click Add Section
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/div/a")).click();

		// Section name
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[1]/div[1]/label/input"))
				.sendKeys("Testing");

		// Exam
		WebElement Ex = driver.findElement(By.xpath("//*[@id=\"agent\"]"));
		Select Exam = new Select(Ex);
		Exam.selectByIndex(1);

		// Order
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[1]/div[3]/label/input")).sendKeys("1");

		// Click Add Button
		driver.findElement(By.xpath("//*[@id=\"submit_btn\"]")).click();
		Thread.sleep(1000);

		// Click Add
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[4]/a[1]"))
				.click();

		// Answer
		WebElement ans = driver
				.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[2]/div[6]/label/select"));
		Select answer = new Select(ans);
		answer.selectByIndex(2);

		// Marks
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[2]/div[7]/label/input")).clear();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[2]/div[7]/label/input")).sendKeys("1");

		// Click Add
		driver.findElement(By.xpath("//*[@id=\"submit_btn\"]")).click();

		// View
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[4]/a[2]"))
				.click();

		// Navigate to Back
		driver.navigate().back();

		// Repeat the view and back for all the Sections

		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[4]/a[2]"))
				.click();
		Thread.sleep(1000);

		driver.navigate().back();

		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[3]/td[4]/a[2]"))
				.click();
		Thread.sleep(1000);

		driver.navigate().back();

		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[4]/td[4]/a[2]"))
				.click();
		Thread.sleep(1000);

		driver.navigate().back();

		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[5]/td[4]/a[2]"))
				.click();
		Thread.sleep(1000);

		driver.navigate().back();

		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[6]/td[4]/a[2]"))
				.click();
		Thread.sleep(1000);

		driver.navigate().back();

		// Search
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Testing");

		// Click Search
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/form/div/input[2]")).click();

		// Click name
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[1]/a")).click();

		// Re-Enter Order
		driver.findElement(By.xpath("//*[@id=\"add_examsection\"]/div[1]/div[3]/label/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"add_examsection\"]/div[1]/div[3]/label/input")).sendKeys("6");

		// Update
		driver.findElement(By.xpath("//*[@id=\"submit_btn\"]")).click();
		Thread.sleep(1000);

		// Click name
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[6]/td[1]/a")).click();

		// click delete
		driver.findElement(By.xpath("//*[@id=\"add_examsection\"]/div[2]/a[2]")).click();

		// More info
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[7]/a")).click();

		// click delete
		driver.findElement(By.xpath("//*[@id=\"add_examsection\"]/div[2]/a[2]")).click();

		// click goback
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[8]/button")).click();

		// click delete
		driver.findElement(By.xpath("//*[@id=\"add_examsection\"]/div[2]/a[2]")).click();

		// click confirm delete
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[8]/a")).click();

	}
}