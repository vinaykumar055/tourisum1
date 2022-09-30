package GithubPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleparameterTest {
@Test
public void parametertest() throws IOException
{

	/*
	 * String browser = System.getProperty("browser"); String url =
	 * System.getProperty("url"); if(browser.equalsIgnoreCase("chrome")) {
	 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
	 * driver.get(url); }
	 */
	System.out.println("browser");
	System.out.println("url");
}
}
