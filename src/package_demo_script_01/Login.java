package package_demo_script_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://newtours.demoaut.com/");
		driver.get("https://apeu2appvedic01.azurewebsites.net/#/identificar-usuario?codProd=PRICTA");
		
		driver.findElement(By.id("txtDNI")).sendKeys("43434456");
		
		//driver.findElement(By.name("userName")).sendKeys("yosua");
		//driver.findElement(By.name("password")).sendKeys("yosua");
		
		//driver.findElement(By.name("login")).submit();
		//driver.findElement(By.name("Acceder")).submit();
		//driver.findElement(By.partialLinkText("Acceder")).click();
		
		System.out.println("DNI ok");
		
		//driver.close();
	}

}
