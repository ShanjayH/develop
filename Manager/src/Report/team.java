package Report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class team {
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
		driver.findElement(By.id("username")).sendKeys("alokkumar@nttf.co.in");
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd@123");
		WebElement loginButtonId = driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));
		loginButtonId.click();
		Thread.sleep(2000);

		// click reports dropdown button
		WebElement rep = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[5]/a"));
		rep.click();

		// Click teamwise report
		WebElement tr = driver.findElement(By.xpath("//*[@id=\"report\"]/ul/li[1]/a"));
		tr.click();
		Thread.sleep(2000);

		// click dashboard
		WebElement dash = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[1]/a"));
		dash.click();

		Thread.sleep(2000);

		// click reports dropdown button
		WebElement rep1 = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[5]/a"));
		rep1.click();

		// Click Industry report
		WebElement ind = driver.findElement(By.xpath("//*[@id=\"report\"]/ul/li[2]/a"));
		ind.click();
        Thread.sleep(2000);
		// click dashboard
		WebElement dash1 = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[1]/a"));
		dash1.click();
		
		//click reports dropdown button
		WebElement rep2 = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[5]/a"));
		rep2.click();
		
		//click state report
    	driver.findElement(By.xpath("//*[@id=\"report\"]/ul/li[3]/a")).click();
		
		Thread.sleep(2000);
	    //click dashboard
	    WebElement dash2 = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[1]/a"));
		dash2.click();
		
		//click report dropdown button 
		WebElement rep3 = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[5]/a"));
		rep3.click();
		Thread.sleep(2000);
		//click month report
	    driver.findElement(By.xpath("//*[@id=\"report\"]/ul/li[4]/a")).click();
		
	}
}