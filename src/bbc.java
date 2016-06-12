
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
// comparison of titles
public class bbc {
@Test

public void main(){
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.gmail.com/");
	//String actual=driver.getTitle();
	String actual=driver.getCurrentUrl();
	
	System.out.println(actual);
	String expected="http://www.Gmail.com/";
	//System.out.println(expected);
	
	if(actual.equalsIgnoreCase(expected))
	{
		System.out.println("both are equal");
	}
	else
	{
		System.out.println("Not equal");
		
	}
}

}
