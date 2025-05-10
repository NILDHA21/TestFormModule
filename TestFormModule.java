import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestFormModule {

	@Test
	void addUserTest_TC_01() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/TestForm.html");
		driver.findElement(By.id("fullname")).sendKeys("fullname");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.name("email")).sendKeys("email@gmail.com");
		driver.findElement(By.id("age")).sendKeys("30");
		driver.findElement(By.id("dob")).sendKeys("1990-05-10");
		driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
		driver.findElement(By.name("skills")).click();
		WebElement country = driver.findElement(By.id("country"));
		country.click();
		Select select = new Select(country);
		select.selectByValue("USA");
		driver.findElement(By.id("comments")).sendKeys("Thank you for the feedback.");
		driver.findElement(By.id("resume")).sendKeys("C:\\Users\\Admin\\Downloads\\1709055771147.jpg");
		driver.findElement(By.id("favcolor")).sendKeys("#832121");
		driver.findElement(By.id("satisfaction")).sendKeys("4");
		driver.findElement(By.id("appt")).sendKeys("14:12");
		driver.findElement(By.xpath("/html/body/form/input[15]")).sendKeys("https://www.google.com/");
		//driver.findElement(By.xpath("/html/body/form/input[16]")).click();
		}
}
