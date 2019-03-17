import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\MySelProject\\Libraries\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		//driver.findElement(By.xpath("//input[@value='Cheese']")).click();//checked Cheese
		//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
	   int count =driver.findElements(By.xpath("//input[@name='group1']")).size();   
	   
	   for(int i=0;i<count;i++) {
		   //driver.findElements(By.xpath("//input[@name='group1']")).get(0).click();   //checked Milk
		   System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));  //print Values
		   
		   String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
		   if(text.equals("Cheese")) {
			   driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();   //checked Cheese
	          }
         }
    }
}