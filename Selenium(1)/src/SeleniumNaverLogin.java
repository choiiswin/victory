import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumNaverLogin {
	private static WebDriver driver;
	public static void main(String [] args) throws Exception{
		setUp();
	}
	public static void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//	options.addArguments("--headless");
		//	options.addExtensions (new File("/path/to/extension.crx"));
			
			driver = new ChromeDriver(options);
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //Set response time
			driver.get("https://www.naver.com");  //url
	}
	
	public void Test_1 () throws Exception {
	}
	
	public static void tearDown() throws Exception {
		driver.quit();
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");	//크롬드라이버 프로세스 킬
	}
}
