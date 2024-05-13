package git31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Git311 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
					System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
					WebDriver driver=new FirefoxDriver();//launch browser
					driver.get("http://www.facebook.com");
					driver.findElement(By.name("email")).sendKeys("lekshmisunil5712@gmail.com");
					driver.findElement(By.name("pass")).sendKeys("lekshmi@5712");	
					driver.findElement(By.name("login")).click();

}
}
