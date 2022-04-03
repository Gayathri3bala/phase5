package session2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {

		//set the driver property
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement email= driver.findElement(By.cssSelector("input[id*='mail']"));
		System.out.println(email.getAttribute("placeholder"));

		WebElement button= driver.findElement(By.cssSelector("button[value='1'][type='submit']"));
		button.submit();
		System.out.println(button.getAttribute("data-testid"));
		driver.close();
	}
}
