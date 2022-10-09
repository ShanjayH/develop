import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Profile {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shanj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		driver.get("http://ec2-65-1-5-19.ap-south-1.compute.amazonaws.com:8000/");

		Thread.sleep(2000);

		driver.findElement(By.linkText("LOGIN")).click(); // using Selenium click button method
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("manager@gmail.com");
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd@123");
		WebElement loginButtonId = driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));

		loginButtonId.click();
		Thread.sleep(2000);

		// Click dropdown button
		driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]/span")).click();
		Thread.sleep(2000);

		// Click Profile
		driver.findElement(By.xpath("/html/body/div/div/nav/div/ul[2]/li/div/a[1]")).click();

		// Click Edit Button
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/button")).click();

		// Editing fistname, lastname, email, phone number, address
		driver.findElement(By.name("first_name")).clear();
		driver.findElement(By.name("first_name")).sendKeys("Alok");
		driver.findElement(By.name("last_name")).clear();
		driver.findElement(By.name("last_name")).sendKeys("Kumar");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("alokkumar@nttf.co.in");
		driver.findElement(By.name("phone_number")).clear();
		driver.findElement(By.name("phone_number")).sendKeys("7306262674");
		driver.findElement(By.name("address")).clear();
		driver.findElement(By.name("address")).sendKeys("KA");

		Thread.sleep(2000);

		// Click update button
		driver.findElement(By.id("submit_btn")).click();
		Thread.sleep(2000);

		// click dashboard button
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[2]/a")).click();

	}
}