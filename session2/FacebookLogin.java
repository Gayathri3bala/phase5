package session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {

		//set the driver property
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://m.facebook.com/");

		WebElement email= driver.findElement(By.xpath("//*[@id=\"m_login_email\"]"));
		email.sendKeys("gayathri@gmail.com");

		WebElement pass= driver.findElement(By.xpath("//*[@id=\"m_login_password\"]"));
		pass.sendKeys("gayathri@gmail.com");

		WebElement button= driver.findElement(By.xpath("//*[@id=\"login_password_step_element\"]/button"));
		button.submit();
}
}