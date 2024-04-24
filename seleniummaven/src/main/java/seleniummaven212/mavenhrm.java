package seleniummaven212;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mavenhrm  {
	       String driverPath = "C:\\Users\\Shashidhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
			
	        WebDriver driver = new ChromeDriver();
	     
	        @BeforeTest
	        void navigate() throws InterruptedException {
	        	
	        	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shashidhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    	     Thread.sleep(2000);
	        	
	        }
	        @AfterTest
	        void close() {
	        	driver.quit();
	        }
	@Test(priority=1)
	 void login() throws InterruptedException {
		
	 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
     driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
     driver.findElement(By.cssSelector("button[type='submit']")).click();
     Thread.sleep(2000);
    
	}
	@Test(priority=2)
	void buzz() throws InterruptedException {
		
	 driver.findElement(By.xpath("//span[normalize-space()='Buzz']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]")).sendKeys("MANISH");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}