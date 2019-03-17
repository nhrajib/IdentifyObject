import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\MySelProject\\Libraries\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		//Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
		driver.findElement(By.cssSelector("input[value='option1']")).click(); //Checkbox Checked
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());		
		driver.findElement(By.cssSelector("input[value='option1']")).click(); //Checkbox UnChecked
		Thread.sleep(2000);
		Assert.assertFalse(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		
		//How to get the Count of number of check boxes present in the page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
