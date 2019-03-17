import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpression {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\MySelProject\\Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys("myusername");
        driver.findElement(By.cssSelector("input#password")).sendKeys("mypasswd");
        driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
        
        /*driver.findElement(By.xpath("//div[@jsname='RNNXgb']/div/div/div/input")).sendKeys("selenium");*/
	}
}

