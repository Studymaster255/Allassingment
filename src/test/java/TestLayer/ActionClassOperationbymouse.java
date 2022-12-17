package TestLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class ActionClassOperationbymouse {
static File f;
static String d;
static File dist;
	public static void main(String[] args) throws IOException, InterruptedException {
		String userdir=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",userdir+"//AllDriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		//DragandDrop
		Actions act=new Actions(driver);
//		WebElement src=driver.findElement(By.id("box2"));
//		WebElement dist=driver.findElement(By.id("box102"));
//		act.dragAndDrop(src, dist).build().perform();
//		System.out.println(src.getCssValue("background-color"));
//		System.out.println(dist.getCssValue("background-color"));
	//	TakesScreenshot ts=(TakesScreenshot) driver;
		
		//	while(true)
		//{
		for(int i=1;i<=7;i++)
		{
			WebElement src=driver.findElement(By.id("box"+i));
			WebElement dest=driver.findElement(By.id("box10"+i));
			act.dragAndDrop(src, dest).build().perform();
		}
//		f=ts.getScreenshotAs(OutputType.FILE);
//		d=userdir+"//Screenshot//"+System.currentTimeMillis()+".png";
//		dist=new File(d);
//		FileUtils.copyFile(f,dist);
		for(int i=1;i<=7;i++)
		{
			WebElement src=driver.findElement(By.id("box"+i));
			WebElement dest=driver.findElement(By.id("dropContent"));
			act.dragAndDrop(src, dest).build().perform();
		}
//		f=ts.getScreenshotAs(OutputType.FILE);
//		d=userdir+"//Screenshot//"+System.currentTimeMillis()+".png";
//		dist=new File(d);
//		FileUtils.copyFile(f,dist);
		
		WebElement src=driver.findElement(By.id("box1"));
		act.clickAndHold(src).build().perform();
		Thread.sleep(10000);
		act.release(src).build().perform();
		
		
		
	}

}
