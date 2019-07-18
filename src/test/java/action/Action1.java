package action;

import java.awt.Dimension;
import java.io.File;

import org.openqa.selenium.Rectangle;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Action1 {

	public static WebDriver driver;
	public void setup() {
		System.setProperty("webdriver.chrome.driver","/home/qainfotech/Desktop/sample/chromedriver");
		driver= new ChromeDriver();
	//	driver.manage().window().fullscreen();
		System.out.println(driver.manage().window().getSize());
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	//	public Action1(WebDriver driver) {
	//	this.driver	=	driver;
	//	
	//}
	public  Action1() {
		setup();
		//	this.driver	=		t.driver;
	}
	public Action1(WebDriver driver) {

	}
	public void open_the_Website() {
		driver.get("https://qainfotech.com/");
		//driver.navigate().to("https://qainfotech.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	public void verify_the_TextonWebPage() {
		System.out.println("32............");
		String expText = "About Us";
		String actText = driver.findElement(By.xpath("//div[@id='about']")).getText();
		System.out.println("33..........");
		if (actText.contains(expText)) {
			Assert.assertEquals(actText, expText,"1 Expected text " + expText + "' present in the web page.");
			System.out.println(expText);
			System.out.println("35........");}
		else{
			System.out.println("22........");
			Assert.fail("Error");
			System.out.println("11.................................");}
		
	}
	
	
	public void how_many_liks_are_avaliable()  {
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		for(WebElement link:allLinks){
		
		System.out.println(link.getText() + " - " + link.getAttribute("href"));
//driver.manage().hashCode();
		}
		
		
		
			
	}
	public void click_on_the_link() {
		List<WebElement> Id= driver.findElements(By.id("div']")).subList(0,10);
		System.out.println("3.............");
		System.out.println("----->"+Id.size()); 
		System.out.println("4...................");
		
	}
}






