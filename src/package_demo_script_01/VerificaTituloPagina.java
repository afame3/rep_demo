package package_demo_script_01;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificaTituloPagina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String baseUrl = "http://newtours.demoaut.com/";
		//String expectedTitle = "Bienvenidos: Mercury Tours";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		String actualUrl = "";

		driver.get(baseUrl);
		actualTitle=driver.getTitle();
		actualUrl=driver.getCurrentUrl();
		
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("test passed");	
			System.out.println(actualUrl);
		}else {
			System.out.println("test failed");
			//System.out.println(actualTitle);
		}
		driver.close();
	}

}
