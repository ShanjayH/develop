package ComPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CProfile{
	public static void main(String args[])throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shanj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://ec2-65-1-5-19.ap-south-1.compute.amazonaws.com:8000/dashboard");
		
		//Entering credentials
		driver.findElement(By.id("username")).sendKeys("NEC0920007@nttf.co.in");
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd@123");
		
		// click login button
		WebElement loginButtonId = driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));
		loginButtonId.click();
		Thread.sleep(2000);
		
		//click banner
		WebElement Cprofile = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/a"));
		Cprofile.click();
		Thread.sleep(3000);
		
		//enter firstname
		driver.findElement(By.name("first_name")).sendKeys("Shanjay");
		
		//enter lastname
		driver.findElement(By.name("last_name")).sendKeys("H");
		
		//dropdown for gender
		WebElement test = driver.findElement(By.name("gender"));
		Select dd = new Select(test);
		// Using the object of select class, select option
		dd.selectByIndex(2);
		// Thread.sleep(5000);
		// dd.selectByValue("Performance");
		Thread.sleep(2000);
		
		//aadhar number
		driver.findElement(By.name("aadhar_number")).sendKeys("765432189013");
		
		//date
		WebElement dateBox = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[1]/div[5]/label/input"));
		 // Fill date as dd/mm/yyyy as 25/09/2002
		dateBox.sendKeys("25092002");
		
		//Address
		driver.findElement(By.name("address")).sendKeys("Plot No. 21, Sector 13, Gurgaon");
		
		//Qualifacation
		WebElement highqualification = driver.findElement(By.name("qualification"));
		Select high = new Select(highqualification);
		high.selectByIndex(6);
		  //Thread.sleep(5000);
		  //dd.selectByValue("Any Other Diploma Perusing (Which is not in above)");
		Thread.sleep(2000);
		
		//Selecting State
		WebElement State = driver.findElement(By.name("state"));
		Select st = new Select(State);
		st.selectByIndex(23);
		  //Thread.sleep(5000);	
		Thread.sleep(2000);
		
		//selecting District
		WebElement dis = driver.findElement(By.xpath("//*[@id=\"district\"]"));
		Select dt = new Select(dis);
		dt.selectByIndex(6);
		
		//Entering Year of pass
		driver.findElement(By.name("year_of_pass")).sendKeys("2019");
		
		//Entering Mail 
	    driver.findElement(By.name("referral_email")).sendKeys("prabhar@nttf.co.in");
	    
	    //Clicking Save Button
	    WebElement Save = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[2]/input"));
	    Save.click();
		}
	
}