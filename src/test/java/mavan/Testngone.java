package mavan;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class Testngone {
	WebDriver driver;
	
	@Test(priority=1)
	void openApp() {
		driver=new FirefoxDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
	}
	@Test(priority=2)
	void loginApp() {
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");;
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
	}
	@Test(priority=3)
	void logoutApp() {
		driver.findElement(By.linkText("Logout")).click();
	}
	@Test(priority=4)
	void closeApp() {
		driver.close();
	}
}
