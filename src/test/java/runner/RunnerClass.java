package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="src/test/java",
glue = "stepdef"
)	
public class RunnerClass {

}

//int lastIndexOf = driver.findElements(By.id("#about")).lastIndexOf(0);
//System.out.println(lastIndexOf);

	//int recta;
	//driver.findElement(By.xpath("//a[@href='#about']")).click();
	//driver.findElement(By.xpath("//input[@type='text']")).clear();
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Services");
	//driver.findElement(By.cssSelector("input[id='s']")).sendKeys("Services");
	//driver.findElement(By.cssSelector("input[id='searchsubmit']")).click();
	//driver.findElement(By.id("searchsubmit")).click();
	//driver.findElement(By.linkText("ABOUT")).click();
	//driver.findElement(By.tagName("div")).getText();


	//Point point =driver.findElement(By.cssSelector("div[class='tp-bgimg defaultimg ']")).getLocation();
	//System.out.println("PositionX: "+point.x);
	//System.out.println("PositionY: "+point.y);
	//Rectangle recta1 = driver.findElement(By.cssSelector("a[href='#services']")).getRect();
	//System.out.println(recta1.getHeight());
	//System.out.println(recta1.getWidth());
	//System.out.println(recta1.getX());
	//System.out.println(recta1.getY());
//File scrnShot	=		driver.findElement(By.xpath("//a[@href='#about']")).getScreenshotAs(OutputType.FILE);
//System.out.println(scrnShot.getAbsolutePath());
//driver.findElement(By.xpath("//a[@href='#about']")).isDisplayed();
	//boolean searchIconPresence=driver.findElement(By.cssSelector("input[id='s']")).isEnabled();
	//boolean searchIconEnabled = driver.findElement(By.cssSelector("input[id='s']")).isSelected();
//}


	//System.out.println("22.......................");
	//driver.findElement(By.xpath("//span[@style='padding-left:5px;']")).click();
	//	driver.switchTo().alert().accept();
	//driver.manage().window();

	//Point point =driver.findElement(By.cssSelector("div[class='tp-bgimg defaultimg ']")).getLocation();

//System.out.println("PositionX: "+point.x);
//System.out.println("PositionY: "+point.y);

	
	//	}	
//public void click_on_the_search_button() {
	//driver.findElement(By.xpath("//input[@type='submit']")).click();