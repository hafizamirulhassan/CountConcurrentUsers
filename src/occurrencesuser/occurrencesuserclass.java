package occurrencesuser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class occurrencesuserclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.topuniversities.com/student-info/careers-advice/management-vs-marketing-choosing-career-thats-right-you");
		
		WebElement body = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[1]/div/div/div/div[1]/div/div"));
		String bodyText = body.getText();

		// count occurrences of the string
		int count = 0;

		// search for the String within the text
		while (bodyText.contains("and")){

		    // when match is found, increment the count
		    count++;

		    // continue searching from where you left off
		    bodyText = bodyText.substring(bodyText.indexOf("and") + "and".length());
		}
		System.out.println(count);
		driver.quit();
		
	}

}
