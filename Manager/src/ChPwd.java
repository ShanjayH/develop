import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChPwd {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shanj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://ec2-65-1-5-19.ap-south-1.compute.amazonaws.com:8000/");	
		
		//maximize the window
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("LOGIN")).click(); //using Selenium click button method
		  Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("alokkumar@nttf.co.in");
		driver.findElement(By.name("password")).sendKeys("alok@123");
		WebElement loginButtonId = 
			    driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));

			    loginButtonId.click();
			    Thread.sleep(2000);
			    
	    //Click dropdown button
			    WebElement dp = driver.findElement(By.xpath("/html/body/div/div/nav/div/ul[2]/li/a/span[2]/span"));
			    dp.click();
			    Thread.sleep(2000);
		//Click Change Password 
			    WebElement ChPwd = driver.findElement(By.xpath("/html/body/div/div/nav/div/ul[2]/li/div/a[2]"));
			    ChPwd.click();
			    
		//Enter oldpwd
			    driver.findElement(By.name("old_password")).sendKeys("alok@123");
	    
	    //Enter NewPwd
			    driver.findElement(By.name("new_password1")).sendKeys("P@ssw0rd@123");
			    
		//Re-enter NewPwd
			    driver.findElement(By.name("new_password2")).sendKeys("P@ssw0rd@123");
		
	    //Click ChangePassword Button
			    WebElement ChPass = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
			    ChPass.click();
	}
}