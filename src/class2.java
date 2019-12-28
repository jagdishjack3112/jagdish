import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class class2 {
	 WebDriver driver;
	@Test
  public void f() 
	{
		driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@value='1']")).click();
		 driver.findElement(By.xpath("//input[@value='2']")).click();
		 driver.findElement(By.xpath("//input[@value='3']")).click();
		 driver.findElement(By.xpath("//input[@value='4']")).click();
		 driver.findElement(By.xpath("//input[@value='Submit']")).click();
		}
	@Test
	public void testcase5()
	{
		    driver.findElement(By.xpath("//span[text()='Alerts']")).click();
			driver.findElement(By.xpath("//span[text()='Alerts History']")).click();
			driver.findElement(By.id("typeSelect")).click();
			WebElement testDropDown = driver.findElement(By.id("typeSelect"));  
			Select dropdown = new Select(testDropDown); 
			dropdown.selectByValue("MEMBER"); 
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/table/tbody/tr[2]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("27/11/2018");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/table/tbody/tr[2]/td/form/table/tbody/tr[2]/td[4]/input")).sendKeys("27/12/2023");
			driver.findElement(By.id("memberUsername")).sendKeys("pinkubhui");
			driver.findElement(By.id("memberName")).sendKeys("pinkubhui");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/table/tbody/tr[2]/td/form/table/tbody/tr[4]/td/input")).click();


			
	
	}
	
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("http://localhost:8585/");
	  
  }

  @AfterMethod
  public void afterMethod() {
	   
  }

  @BeforeTest
  public void beforeTest() {
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		
  }

  @AfterTest
  public void afterTest() {
  }

}
