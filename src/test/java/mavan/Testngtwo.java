package mavan;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Testngtwo {
WebDriver driver;
@Test(priority=1)
void openApp() {
	driver = new FirefoxDriver();
}
@Test(priority=2)
void waitforsometime() throws Exception{
	Thread.sleep(2000);
}
@Test(priority=3)
void closeApp() {
	driver.close();
}
}
