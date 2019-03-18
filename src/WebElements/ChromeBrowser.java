package WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\MySelProject\\Libraries\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	/*
	driver.get("https://www.facebook.com/");	
	//driver.findElement(By.id("email")).sendKeys("uftlab@gmail.com");
	driver.findElement(By.cssSelector("input[class='inputtext']")).sendKeys("myemail");
	driver.findElement(By.id("pass")).sendKeys("almuft12");
	
	driver.findElement(By.linkText("Forgot account?")).click();
	
	//driver.findElement(By.name("email")).sendKeys("uftlab@gmail.com");
	//driver.findElement(By.id("u_0_2")).click();
	*/
	
	driver.get("https://www.salesforce.com/");
	driver.findElement(By.xpath("/html/body/header/div[2]/div[3]/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a")).click();
	//driver.findElement(By.id("username")).sendKeys("uftlab@gmail.com");
	driver.findElement(By.cssSelector("input#username")).sendKeys("uftlab");
	driver.findElement(By.name("pw")).sendKeys("12345");
	//driver.findElement(By.xpath("//*[@id=\'Login\']")).click(); //by xPath
	driver.findElement(By.cssSelector("#Login")).click(); //by CSS Selector
	
	System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	
	}

}
