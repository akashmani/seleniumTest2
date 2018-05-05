import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LounchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver","F:\\software\\selenium\\geckodriver-v0.20.0-win64\\geckodriver.exe" );
		//WebDriver driver = new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver","F:\\software\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.youtube.com/");
		//driver.manage().window().maximize();
		driver.quit();

	}

}
