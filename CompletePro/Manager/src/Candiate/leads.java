package Candiate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class leads {
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

		// click add lead button
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/div/a")).click();

		// entering the required field and saving the details

		// enter firstname
		driver.findElement(By.name("first_name")).sendKeys("Shanjay");

		// enter lastname
		driver.findElement(By.name("last_name")).sendKeys("H");

		// enter Email
		driver.findElement(By.name("email")).sendKeys("NEC0920007@nttf.co.in");

		// Enter phone number
		driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[4]/label/input")).sendKeys("9638527412");

		// dropdown for gender
		WebElement test = driver.findElement(By.name("gender"));
		Select dd = new Select(test);
		// Using the object of select class, select option
		dd.selectByIndex(2);

		// date
		WebElement dateBox = driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[6]/label/input"));
		// Fill date as dd/mm/yyyy as 25/09/2002
		dateBox.sendKeys("25092002");

		// Address
		driver.findElement(By.name("address")).sendKeys("Plot No. 21, Sector 13, Gurgaon");

		// aadhar number
		driver.findElement(By.name("aadhar_number")).sendKeys("123456745813");

		// Qualification
		WebElement highqualification = driver.findElement(By.name("qualification"));
		Select high = new Select(highqualification);
		high.selectByIndex(6);

		// Selecting State
		WebElement State = driver.findElement(By.name("state"));
		Select st = new Select(State);
		st.selectByIndex(23);
		Thread.sleep(2000);

		// selecting District
		WebElement dis = driver.findElement(By.name("district"));
		Select dt = new Select(dis);
		dt.selectByIndex(6);
		Thread.sleep(2000);

		// Entering Year of pass
		driver.findElement(By.name("year_of_pass")).sendKeys("2019");

		// click save button
		WebElement sa = driver.findElement(By.xpath("//*[@id=\"submit_btn\"]"));
		sa.click();

		// after saving the process using edit option filling remaing data

		// enter the name in search bar
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Shanjay");

		// click search button
		driver.findElement(By.xpath("//*[@id=\"search\"]")).click();

		// Click the searched name
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[1]/a")).click();

		// click edit button
		driver.findElement(By.xpath("//*[@id=\"edit_btn\"]")).click();

		// enter firstname
		driver.findElement(By.name("first_name")).clear();
		driver.findElement(By.name("first_name")).sendKeys("Shanjay");

		// enter lastname
		driver.findElement(By.name("last_name")).clear();
		driver.findElement(By.name("last_name")).sendKeys("H");

		// enter Email
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("NEC0920007@nttf.co.in");

		// Enter phone number
		driver.findElement(By.name("phone_number")).clear();
		driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[4]/label/input")).sendKeys("9638527412");

		// dropdown for gender
		WebElement test1 = driver.findElement(By.name("gender"));
		Select gen = new Select(test1);
		// Using the object of select class, select option
		gen.selectByIndex(2);

		// date of birth
		driver.findElement(By.name("date_of_birth")).clear();
		WebElement date = driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[6]/label/input"));
		// Fill date as dd/mm/yyyy as 25/09/2002
		date.sendKeys("05092002");

		// Address
		driver.findElement(By.name("address")).clear();
		driver.findElement(By.name("address")).sendKeys("Plot No. 21, Sector 13, Gurgaon");

		// aadhar number
		driver.findElement(By.name("aadhar_number")).clear();
		driver.findElement(By.name("aadhar_number")).sendKeys("123456745813");

		// Qualification
		// driver.findElement(By.name("qualification")).clear();
		WebElement hqualification = driver.findElement(By.name("qualification"));
		Select hi = new Select(hqualification);
		hi.selectByIndex(5);

		// Selecting State
		// driver.findElement(By.id("state")).clear();
		WebElement Sta = driver.findElement(By.id("state"));
		Select St = new Select(Sta);
		St.selectByIndex(22);
		Thread.sleep(2000);

		// selecting District
		// driver.findElement(By.id("district")).clear();
		WebElement dist = driver.findElement(By.name("district"));
		Select dit = new Select(dist);
		dit.selectByIndex(2);
		Thread.sleep(2000);

		// Entering Year of pass
		driver.findElement(By.name("year_of_pass")).clear();
		driver.findElement(By.name("year_of_pass")).sendKeys("2020");

		// Select exam
		WebElement ex = driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[13]/label/select"));
		Select exam = new Select(ex);
		exam.selectByIndex(1);

		// date of join
		driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[15]/label/input")).sendKeys("25112020");

		// Referral mail
		driver.findElement(By.name("referral_email")).sendKeys("prabhar@nttf.co.in");

		// Month salary
		driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[17]/label/input")).sendKeys("30000");

		// Reporting date
		driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[18]/label/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[18]/label/input")).sendKeys("24122022");

		// Reporting location
		driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[19]/label/input")).sendKeys("Banglore");

		// Admin team
		WebElement ad = driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[20]/label/select"));
		Select admin = new Select(ad);
		admin.selectByIndex(2);

		// Industry
		WebElement in = driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[21]/label/select"));
		Select industry = new Select(in);
		industry.selectByIndex(2);

		// Profile Verification Status
		WebElement ver = driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[22]/label/select"));
		Select verification = new Select(ver);
		verification.selectByIndex(1);

		// Eligibility Status
		WebElement el = driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[23]/label/select"));
		Select Eligiblity = new Select(el);
		Eligiblity.selectByIndex(3);

		// Examination Status
		WebElement exa = driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[24]/label/select"));
		Select Examination = new Select(exa);
		Examination.selectByIndex(2);

		// Interview Status
		WebElement Int = driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[25]/label/select"));
		Select Interview = new Select(Int);
		Interview.selectByIndex(2);

		// Offer letter Status
		WebElement off = driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[26]/label/select"));
		Select offer = new Select(off);
		offer.selectByIndex(2);

		// Joining Status
		WebElement jo = driver.findElement(By.xpath("//*[@id=\"add_lead\"]/div[1]/div[27]/label/select"));
		Select joining = new Select(jo);
		joining.selectByIndex(1);
		Thread.sleep(2000);

		// click save button
		driver.findElement(By.id("submit_btn")).click();
		Thread.sleep(2000);

	}
}