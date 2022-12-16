package TestLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContextClick {
	public static void main(String[] args) throws InterruptedException {
		String userdir=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",userdir+"//AllDriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.get("https://demoqa.com/buttons");
//		WebElement rc =driver.findElement(By.id("rightClickBtn"));
//		act.contextClick(rc).build().perform();
//		String a=driver.findElement(By.id("rightClickMessage")).getText();
//		System.out.println(a);
	//	Thread.sleep(3000);
//		WebElement dc =driver.findElement(By.id("doubleClickBtn"));
//		act.doubleClick(dc).build().perform();
//		String b=driver.findElement(By.id("doubleClickMessage")).getText();
//		System.out.println(b);
//		Thread.sleep(3000);
		WebElement sc =driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]"));
		act.click(sc).build().perform();
		String c=driver.findElement(By.xpath("//p[text()='You have done a dynamic click']")).getText();
		System.out.println(c);
		
		
		
	}

}
