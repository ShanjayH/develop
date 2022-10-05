package Administation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class My_Team {
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
		driver.findElement(By.id("username")).sendKeys("alokkumar@nttf.co.in");
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd@123");
		WebElement loginButtonId = driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));
		loginButtonId.click();
		Thread.sleep(2000);

		// Click Administration Dropdown button
		WebElement admin = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/a"));
		admin.click();

		// Click Myteam
		WebElement team = driver.findElement(By.xpath("//*[@id=\"administration\"]/ul/li/a"));
		team.click();
		Thread.sleep(2000);

		// Add team Member
		WebElement add = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/div/a"));
		add.click();

		// Entering First name
		driver.findElement(By.xpath("//*[@id=\"add_employee\"]/div[1]/div[1]/label/input")).sendKeys("Mohammed");

		// Last Name
		driver.findElement(By.xpath("//*[@id=\"add_employee\"]/div[1]/div[2]/label/input")).sendKeys("Razak");

		// Email
		driver.findElement(By.xpath("//*[@id=\"add_employee\"]/div[1]/div[3]/label/input"))
				.sendKeys("nec0920021@nttf.co.in");

		// Phone Number
		driver.findElement(By.xpath("//*[@id=\"add_employee\"]/div[1]/div[4]/label/input")).sendKeys("9638524710");

		// Address
		driver.findElement(By.name("address")).sendKeys(" Plot No. 1, Sector 1, Gurgaon");

		// Employee id
		driver.findElement(By.xpath("//*[@id=\"add_employee\"]/div[1]/div[6]/label/input")).sendKeys("NEC0920021");

		// Designation
		driver.findElement(By.xpath("//*[@id=\"add_employee\"]/div[1]/div[7]/label/input")).sendKeys("Staff");

		// Role
		WebElement role = driver.findElement(By.name("role"));
		Select dd = new Select(role);
		// Using the object of select class, select option
		dd.selectByIndex(2);

		Thread.sleep(2000);

		// click save button
		WebElement save = driver.findElement(By.xpath("//*[@id=\"submit_btn\"]"));
		save.click();
		Thread.sleep(2000);

		// Search box

		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Mohammed");

		WebElement search = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/form/div/input[2]"));
		search.click();

		WebElement pr = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[1]/a"));
		pr.click();

		// Click Edit Button
		WebElement edit = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/button"));
		edit.click();

		// Editing fistname, lastname, email, phone number, address,emp id ,designation,role
		driver.findElement(By.name("first_name")).clear();
		driver.findElement(By.name("first_name")).sendKeys("Mohammed");
		driver.findElement(By.name("last_name")).clear();
		driver.findElement(By.name("last_name")).sendKeys("Kumaor");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("alokkum@nttf.co.in");
		driver.findElement(By.name("phone_number")).clear();
		driver.findElement(By.name("phone_number")).sendKeys("7355262674");
		driver.findElement(By.name("address")).clear();
		driver.findElement(By.name("address")).sendKeys("KA");
		driver.findElement(By.name("employee_id")).clear();
		driver.findElement(By.name("employee_id")).sendKeys("EMP001");
		driver.findElement(By.name("employee_designation")).clear();
		driver.findElement(By.name("employee_designation")).sendKeys("Staff");
		
		// Role
		WebElement role1 = driver.findElement(By.name("role"));
		Select rol = new Select(role1);
		rol.selectByIndex(2);
		Thread.sleep(2000);
		
		// Click save button
		WebElement Save1 = driver.findElement(By.id("submit_btn"));
		Save1.click();

		Thread.sleep(2000);

		// Search box
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Mohammed");

		WebElement search1 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/form/div/input[2]"));
		search1.click();
		
		// Clicking Team Member name
		WebElement Md = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[1]/a"));
		Md.click();

		// click delete
		WebElement del = driver.findElement(By.xpath("//*[@id=\"add_employee\"]/div[2]/a[2]"));
		del.click();

		// More info
		WebElement mi = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[7]/a"));
		mi.click();

		// click delete
		WebElement del1 = driver.findElement(By.xpath("//*[@id=\"add_employee\"]/div[2]/a[2]"));
		del1.click();

		// click goback
		WebElement gob = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[8]/button"));
		gob.click();

		// click delete
		WebElement del2 = driver.findElement(By.xpath("//*[@id=\"add_employee\"]/div[2]/a[2]"));
		del2.click();

		// click confirm delete
		WebElement cd = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[8]/a"));
		cd.click();
	}
}