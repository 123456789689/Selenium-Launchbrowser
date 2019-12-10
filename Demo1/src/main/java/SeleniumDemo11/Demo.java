package SeleniumDemo11;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver(); // launch browser

		driver.get("https://www.google.co.in/");

		driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(-2000, 0));
		String title = driver.getTitle(); // get title
		System.out.println(title);

		// validation part
		if (title.equals("Google")) { // Comparing the Title is right or wrong
			System.out.println("Correct URL");
		} else {
			System.out.println("Wrong URL");
		}
		System.out.println(driver.getCurrentUrl());

		driver.quit();

	}

}
