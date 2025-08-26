import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class FullRegartionTestAOC {
	
	WebDriver Driver;
	
	@BeforeClass
	public void setup() {
		
		Driver = new ChromeDriver(); 
		System.setProperty("WebDriver.Chrome.driver", "\"C:\\Users\\yashw\\eclipse-workspace\\testf acebook loginpage\\bin\\org\\openqa\\selenium\\chrome\"");
		Driver.get("https://www.ayanshoverseasconsultancy.com/");
		
		Driver.manage().window().maximize();
		
	}

	@Test
	public void regrationflow() throws InterruptedException {
		
		Driver.findElement(By.linkText("Home")).click();
        Thread.sleep(2000);
        
        Driver.findElement(By.xpath("//*[@id=\"hero-cta\"]/div[2]/a[1]")).click();
        Driver.findElement(By.xpath("//*[@id=\"hero-cta\"]/div[2]/a[2]")).click();
        
        Driver.findElement(By.name("name")).sendKeys("Yashwanth Kumar");
        Driver.findElement(By.name("email")).sendKeys("test@gmail.com");
        Driver.findElement(By.name("phone")).sendKeys("9701718181");
        Driver.findElement(By.name("city")).sendKeys("Telangana");
        Driver.findElement(By.name("destination")).sendKeys("USA");
        Driver.findElement(By.name("visaType")).sendKeys("Work Visa");
        Driver.findElement(By.name("message")).sendKeys("Hi This is automation.");
        Thread.sleep(2000);
        
     
        Driver.findElement(By.xpath("//*[@id=\"enquiryForm\"]/button")).click();
        Thread.sleep(2000);
        
		Driver.findElement(By.linkText("Services")).click();
		Thread.sleep(2000);
		
		Driver.findElement(By.linkText("About Us")).click();
		Thread.sleep(2000);
		
		Driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(2000);
		
		Driver.findElement(By.name("name")).sendKeys("Yashwanth Basanapally"); // replace locator
        Driver.findElement(By.name("email")).sendKeys("testemail@example.com");
        Driver.findElement(By.name("phone")).sendKeys("9701718181");
        Driver.findElement(By.name("city")).sendKeys("Hyderabad");
        Driver.findElement(By.name("destination")).sendKeys("UK");
        Driver.findElement(By.name("visaType")).sendKeys("Student Visa");
        Driver.findElement(By.name("message")).sendKeys("Hi This is Automation testing.");
        Driver.findElement(By.xpath("//*[@id=\"contactForm\"]/button")).click();
        
    
	}
	
	@AfterClass
	public void teardown() {
		Driver.quit();
	}
	
}
