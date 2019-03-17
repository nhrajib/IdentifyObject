import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\MySelProject\\Libraries\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		//driver.findElement(By.id("hp-widget__sfrom")).clear();
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mum");
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		
		WebElement source = driver.findElement(By.id("hp-widget__sfrom"));
		WebElement destination = driver.findElement(By.id("hp-widget__sTo"));
		
		source.clear();
		source.sendKeys("mum");
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		
		destination.clear();
		destination.sendKeys("del");
		Thread.sleep(2000);
		//Destination.sendKeys(Keys.ARROW_DOWN);
		//Destination.sendKeys(Keys.ENTER);		
		int i=0;
		for(i=0;i<5;i++) {
			destination.sendKeys(Keys.ARROW_DOWN);
	    }
		destination.sendKeys(Keys.ENTER);
}
}