package TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardevent {

	public static void main(String[] args) throws InterruptedException {
		String userdir=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",userdir+"//AllDriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/reg/");
		Actions act=new Actions(driver);
//		WebElement wb=driver.findElement(By.xpath("//input[@name='firstname']"));
//		act.click(wb).sendKeys("Amit").build().perform();
//		act.click(wb).sendKeys(Keys.TAB,"patil").build().perform();
//		act.click(wb).sendKeys(Keys.TAB,Keys.TAB,"9874561230").build().perform();
//		act.click(wb).sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,"password789456").build().perform();
//		act.click(wb).sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"20").build().perform();
//		act.click(wb).sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"Jan").build().perform();
//		act.click(wb).sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"1990").build().perform();
//		act.click(wb).sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.SPACE).build().perform();
		driver.get("https://www.google.com");
		WebElement wbg=driver.findElement(By.xpath("//input[@name='q']"));
		//act.moveToElement(wbg).
		//act.moveToElement(wbg).sendKeys("selenium").build().perform();
		act.keyDown(Keys.SHIFT).sendKeys("selenium",Keys.ENTER).keyUp(Keys.SHIFT).build().perform();
//		act.sendKeys("selenium").build().perform();
//		act.moveToElement(wbg).doubleClick().build().perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.END).build().perform();
		//act.sendKeys(wb,"Admin").sendKeys(Keys.TAB,"admin123").sendKeys(Keys.ENTER).build().perform();	
		WebElement page10=driver.findElement(By.xpath("//a[@aria-label='Page 10']"));
		Thread.sleep(3000);
		act.moveToElement(page10).click().build().perform();
		//act.contextClick().build().perform();
		
		//act.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_LEFT).build().perform();
		//act.sendKeys(Keys.ZENKAKU_HANKAKU).build().perform();
	}

}
