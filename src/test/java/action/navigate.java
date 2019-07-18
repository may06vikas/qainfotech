package action;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;

public class navigate {
	public   navigate() {
		Action1 abc= new Action1(driver);
		this.driver= abc.driver;
	}
	public static WebDriver driver;
	
	public void enter_text_in_search_box() {
		driver.findElement(By.cssSelector("input[id='s']")).sendKeys("Services");
		
	}
	public void click_on_button()  {
		driver.findElement(By.cssSelector("input[id='searchsubmit']")).click();
		
		}
public void get_the_location() {
		
		Rectangle recta11 = driver.findElement(By.cssSelector("a[href='#services']")).getRect();
		System.out.println(recta11.getHeight());
		System.out.println(recta11.getWidth());
		System.out.println(recta11.getX());
		System.out.println(recta11.getY());
}
		


	public void back_to_homepage() {
	
		driver.navigate().back();
	}
	

	public void again_go_onto_forward_pages() {
		driver.navigate().forward();
	}
}