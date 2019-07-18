package action;



import org.openqa.selenium.Point;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;

public class manage {
	public  manage() {
		Action1 abc= new Action1(driver);
		this.driver= abc.driver;
	}
	public static WebDriver driver;
	public void navigate_to_homepage() {
		driver.navigate().back();
	}
	public void create_cookies() 
	{
		Cookie name = new Cookie("mycookie", "123456789123");
		driver.manage().addCookie(name);
		Set<Cookie> cookiesList =  driver.manage().getCookies();
		for(Cookie getcookies :cookiesList) {
		    System.out.println(getcookies );
		}
	}
	public void Full_Screen() {
		driver.manage().window().fullscreen();
		System.out.println(driver.manage().window().getSize());
	}
	public void get_the_coordinates(){
		Point point =driver.findElement(By.cssSelector("div[class='tp-bgimg defaultimg ']")).getLocation();
		System.out.println("PositionX: "+point.x);
		System.out.println("PositionY: "+point.y);
	}
	public void refresh_the_webpage() {
		driver.navigate().refresh();
	}
	
public void close_the_window() {
	driver.close();
}
	
	
	
	
	
	}


