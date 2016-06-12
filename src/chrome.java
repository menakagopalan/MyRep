import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chrome {

	@Test
	public void testHomePage(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
}
}
