import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\MySelProject\\Libraries\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Thread.sleep(2000);		
		/*
		System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().sendKeys("Thank You!"); //set text on alert
		driver.switchTo().alert().accept(); //accept = ok, yes, done
		driver.switchTo().alert().dismiss(); //not accept
		 */		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();   //accept = OK, yes, done
		alert.sendKeys("Thank You!");   //set text on alert
		alert.dismiss();   //not accept
	}

}
