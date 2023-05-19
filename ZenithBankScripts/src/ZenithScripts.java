import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.util.log.Log;
import org.testng.annotations.*;
import io.appium.java_client.MobileElement;


public class ZenithScripts {
WebDriver driver;

@Test
public void ZenithSignIn() throws Exception
{
	
	try
	{
		
		DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setCapability("BROWSER_NAME", "Android");
		  caps.setCapability("VERSION", "7.0.0"); 
		  caps.setCapability("deviceName","emulator");
		  caps.setCapability("platformName","Android");
		 
		  caps.setCapability("unicodeKeyboard", true);
		  caps.setCapability("resetKeyboard", true);
		  caps.setCapability("appPackage", "com.zenithbank.app");
		  caps.setCapability("appActivity","com.zenithbank.app.MainActivity"); 
		   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		   System.out.println("App Launched");
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//android.widget.Button[@text='ALLOW']")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Log In']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		((RemoteWebDriver) driver).findElementsByClassName("android.widget.EditText").get(0);
		((RemoteWebDriver) driver).findElementByClassName("android.widget.EditText").sendKeys("2185245829");
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.EditText[@text='Password']").click();
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("141414");
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.TextView[@text='SIGN IN']").click();
		
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }
    catch(Exception e){

    e.printStackTrace();

    }
}

@Test
public void airTime() throws Exception
{
	
	try
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setCapability("BROWSER_NAME", "Android");
		  caps.setCapability("VERSION", "7.0.0"); 
		  caps.setCapability("deviceName","emulator");
		  caps.setCapability("platformName","Android");
		 
		  caps.setCapability("unicodeKeyboard", true);
		  caps.setCapability("resetKeyboard", true);
		  caps.setCapability("appPackage", "com.zenithbank.app");
		  caps.setCapability("appActivity","com.zenithbank.app.MainActivity"); 
		   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		   System.out.println("App Launched");
		  caps.setCapability("platformName","Android");
		 
		  caps.setCapability("unicodeKeyboard", true);
		  caps.setCapability("resetKeyboard", true);
		  caps.setCapability("appPackage", "com.zenithbank.app");
		  caps.setCapability("appActivity","com.zenithbank.app.MainActivity"); 
		   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		   System.out.println("App Launched");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//android.widget.Button[@text='ALLOW']")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Log In']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		((RemoteWebDriver) driver).findElementsByClassName("android.widget.EditText").get(0);
		((RemoteWebDriver) driver).findElementByClassName("android.widget.EditText").sendKeys("2185245829");
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.EditText[@text='Password']").click();
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("141414");
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.TextView[@text='SIGN IN']").click();
		
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     
     driver.findElement(By.xpath("//android.widget.TextView[@text='Airtime']")).click();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     
      
      driver.findElement(By.xpath("//android.widget.TextView[@text='Select Account']")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.findElement(By.xpath("//android.widget.TextView[@text='ENOMA ENOGHAYIN AGHAYEDO - 2185245829']")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.findElement(By.xpath("//android.widget.EditText[@text='Mobile Number']")).sendKeys("08094601288");
      
      TouchActions action = new TouchActions(driver);
      action.scroll(30, 100);
      action.perform();
      driver.findElement(By.xpath("//android.widget.EditText[@text='0.00']")).sendKeys("100");
      
      driver.findElement(By.xpath("//android.widget.TextView[@text='CONTINUE']")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
     driver.findElement(By.xpath("//android.widget.TextView[@text='1']")).click();
     driver.findElement(By.xpath("//android.widget.TextView[@text='2']")).click();
     driver.findElement(By.xpath("//android.widget.TextView[@text='3']")).click();
     driver.findElement(By.xpath("//android.widget.TextView[@text='4']")).click();
     
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
    }
    catch(Exception e){

    e.printStackTrace();

    }
}


@Test
public void ZenithBillers() throws Exception
{
	
	try
	{
	
		DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setCapability("BROWSER_NAME", "Android");
		  caps.setCapability("VERSION", "7.0.0"); 
		  caps.setCapability("deviceName","emulator");
		  caps.setCapability("platformName","Android");
		 
		  caps.setCapability("unicodeKeyboard", true);
		  caps.setCapability("resetKeyboard", true);
		  caps.setCapability("appPackage", "com.zenithbank.app");
		  caps.setCapability("appActivity","com.zenithbank.app.MainActivity"); 
		   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		   System.out.println("App Launched");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//android.widget.Button[@text='ALLOW']")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Log In']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		((RemoteWebDriver) driver).findElementsByClassName("android.widget.EditText").get(0);
		((RemoteWebDriver) driver).findElementByClassName("android.widget.EditText").sendKeys("2185245829");
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.EditText[@text='Password']").click();
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("141414");
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.TextView[@text='SIGN IN']").click();
		
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     // Click on Bills Tab
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Bills']")).click();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     // Click on Zenith Billers Tab
     // Select an Account
     driver.findElement(By.xpath("//android.widget.TextView[@text='Select Account']")).click();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.findElement(By.xpath("//android.widget.TextView[@text='ENOMA ENOGHAYIN AGHAYEDO - 2185245829']")).click();
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     
      driver.findElement(By.xpath("//android.widget.TextView[@text='Select Category']")).click();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     //  Select a Biller 
     driver.findElement(By.xpath("//android.widget.TextView[@text='Select a Biller']")).click();
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     driver.findElement(By.xpath("//android.widget.TextView[@text='DSTV']")).click();
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     
     driver.findElement(By.xpath("//android.widget.EditText[@text='Smart Card Number']")).sendKeys("10409056479");
     
     
     // Enter Smart Card Number, Channel Description & Amount
    List<WebElement>textFields = driver.findElements(By.xpath("//android.view.ViewGroup"));
  	textFields.get(0).sendKeys("10409056479");
  	textFields.get(1).sendKeys("Access");
  	textFields.get(2).sendKeys("2000");
  	// Click Continue Button
  	driver.findElement(By.xpath("//android.widget.TextView[@text='CONTINUE']")).click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    // Enter PIN
    driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm Transaction']")).getText();
    driver.findElement(By.xpath("//android.view.ViewGroup[@index='0']")).sendKeys("1");
    driver.findElement(By.xpath("//android.view.ViewGroup[@index='1']")).sendKeys("2");
    driver.findElement(By.xpath("//android.view.ViewGroup[@index='2']")).sendKeys("3");
    driver.findElement(By.xpath("//android.view.ViewGroup[@index='3']")).sendKeys("4");
      
	}
	catch(Exception e){

	    e.printStackTrace();

	    }
	}


@Test
public void ZenithQuickTellerMerchant() throws Exception
{
	
	try
	{
		

		DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setCapability("BROWSER_NAME", "Android");
		  caps.setCapability("VERSION", "7.0.0"); 
		  caps.setCapability("deviceName","emulator");
		  caps.setCapability("platformName","Android");
		 
		  caps.setCapability("unicodeKeyboard", true);
		  caps.setCapability("resetKeyboard", true);
		  caps.setCapability("appPackage", "com.zenithbank.app");
		  caps.setCapability("appActivity","com.zenithbank.app.MainActivity"); 
		   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		   System.out.println("App Launched");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//android.widget.Button[@text='ALLOW']")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Log In']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		((RemoteWebDriver) driver).findElementsByClassName("android.widget.EditText").get(0);
		((RemoteWebDriver) driver).findElementByClassName("android.widget.EditText").sendKeys("2185245829");
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.EditText[@text='Password']").click();
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("141414");
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.TextView[@text='SIGN IN']").click();
		
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//android.widget.TextView[@text='Overview']")).getText();
	     // Click on Bills Tab
	     driver.findElement(By.xpath("//android.view.ViewGroup[@index='3']")).click();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //  Verify Text Present "Select Biller Collection"
	     driver.findElement(By.xpath("//android.widget.TextView[@text='Select Biller Collection']")).getText();
	     // Click on Quick teller Merchant Tab
	     driver.findElement(By.xpath("//android.widget.TextView[@text='Quickteller Merchants']")).click();
         // Wait for 10 seconds
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     // Select Account
	     driver.findElement(By.xpath("//android.view.ViewGroup[@index='0']")).click();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//android.view.ViewGroup[@index='2']")).click();
	     //  Select Category
	     Select dropdown = new Select(driver.findElement(By.xpath("//android.view.ViewGroup[@index='0'"))); 
	     dropdown.selectByVisibleText("Cable Tv");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     //  Select a Biller
	     Select dropdown1 = new Select(driver.findElement(By.xpath("//android.view.ViewGroup[@text='Select Biller'"))); 
	     dropdown1.selectByVisibleText("DSTV Subscription");
	     // Select a Product
	     Select dropdown2 = new Select(driver.findElement(By.xpath("android.widget.TextView[@text='Select Product'"))); 
	     dropdown2.selectByVisibleText("Access - NGN2000");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     // Enter Smart Card Number, Email Address and Mobile Number
	    List<WebElement>textFields = driver.findElements(By.xpath("//android.view.ViewGroup"));
	   	textFields.get(0).sendKeys("10409056479");
	   	textFields.get(1).sendKeys("eaghayedo@gmail.com");
	   	textFields.get(2).sendKeys("08167475993");
	   	// Click on Continue Button
	   	driver.findElement(By.xpath("//android.widget.TextView[@text='CONTINUE']")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	     // Enter PIN
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm Transaction']")).getText();
	    driver.findElement(By.xpath("//android.view.ViewGroup[@index='0']")).sendKeys("1");
	    driver.findElement(By.xpath("//android.view.ViewGroup[@index='1']")).sendKeys("2");
	    driver.findElement(By.xpath("//android.view.ViewGroup[@index='2']")).sendKeys("3");
	    driver.findElement(By.xpath("//android.view.ViewGroup[@index='3']")).sendKeys("4");
	     
	          
	}
	catch(Exception e){

	    e.printStackTrace();

	    }
	}

@Test
public void ZenithTransferZenithAccount() throws Exception
{
	
	try
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setCapability("BROWSER_NAME", "Android");
		  caps.setCapability("VERSION", "7.0.0"); 
		  caps.setCapability("deviceName","emulator");
		  caps.setCapability("platformName","Android");
		 
		  caps.setCapability("unicodeKeyboard", true);
		  caps.setCapability("resetKeyboard", true);
		  caps.setCapability("appPackage", "com.zenithbank.app");
		  caps.setCapability("appActivity","com.zenithbank.app.MainActivity"); 
		   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		   System.out.println("App Launched");
	

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//android.widget.Button[@text='ALLOW']")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Log In']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		((RemoteWebDriver) driver).findElementsByClassName("android.widget.EditText").get(0);
		((RemoteWebDriver) driver).findElementByClassName("android.widget.EditText").sendKeys("2185245829");
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.EditText[@text='Password']").click();
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("141414");
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.TextView[@text='SIGN IN']").click();
		
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='5']")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     driver.findElement(By.xpath("//android.widget.TextView[@text='Overview']")).getText();
     
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='2']")).click();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     
     Select dropdown = new Select(driver.findElement(By.xpath("//android.widget.TextView[@index='0'"))); 
     dropdown.selectByVisibleText("Text");
     driver.findElement(By.xpath("//android.widget.TextView[@text='ZenithBank']")).click();
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='1']")).sendKeys("20189232345");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='1']")).sendKeys("100");
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='0']")).sendKeys("Loan");
     driver.findElement(By.xpath("//android.widget.TextView[@text='Save as Beneficiary']")).getText();
     
     driver.findElement(By.xpath("//android.widget.TextView[@text='Schedule Transfer']")).getText();
     driver.findElement(By.xpath("//android.widget.TextView[@text='CONTINUE']")).click();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
     driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm Transaction']")).getText();
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='0']")).sendKeys("1");
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='1']")).sendKeys("2");
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='2']")).sendKeys("3");
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='3']")).sendKeys("4");
       
	}
	
	catch(Exception e){

	    e.printStackTrace();

	    }
	}

@Test
public void ZenithTransferOthers() throws Exception
{
	
	try
	{
	
		DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setCapability("BROWSER_NAME", "Android");
		  caps.setCapability("VERSION", "7.0.0"); 
		  caps.setCapability("deviceName","emulator");
		  caps.setCapability("platformName","Android");
		 
		  caps.setCapability("unicodeKeyboard", true);
		  caps.setCapability("resetKeyboard", true);
		  caps.setCapability("appPackage", "com.zenithbank.app");
		  caps.setCapability("appActivity","com.zenithbank.app.MainActivity"); 
		   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		   System.out.println("App Launched");
	

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//android.widget.Button[@text='ALLOW']")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Log In']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		((RemoteWebDriver) driver).findElementsByClassName("android.widget.EditText").get(0);
		((RemoteWebDriver) driver).findElementByClassName("android.widget.EditText").sendKeys("2185245829");
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.EditText[@text='Password']").click();
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("141414");
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.TextView[@text='SIGN IN']").click();
		
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
     driver.findElement(By.xpath("//android.widget.TextView[@text='Overview']")).getText();
     
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='2']")).click();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='0']")).click();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='2']")).click();
     
     
     driver.findElement(By.xpath("//android.widget.TextView[@text='OtherBanks']")).click();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
     Select dropdown = new Select(driver.findElement(By.xpath("//android.view.ViewGroup[@index='0'"))); 
     dropdown.selectByVisibleText("FIDELITY BANK PLC");
     
    List<WebElement>textFields = driver.findElements(By.xpath("//android.view.ViewGroup"));
 	textFields.get(0).sendKeys("6170140013");
 	textFields.get(1).sendKeys("100");
 	textFields.get(2).sendKeys("Loan");
 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     driver.findElement(By.xpath("//android.widget.TextView[@text='Save as Beneficiary']")).getText();
     
     driver.findElement(By.xpath("//android.widget.TextView[@text='Schedule Transfer']")).getText();
     driver.findElement(By.xpath("//android.widget.TextView[@text='CONTINUE']")).click();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
     driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm Transaction']")).getText();
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='0']")).sendKeys("1");
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='1']")).sendKeys("2");
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='2']")).sendKeys("3");
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='3']")).sendKeys("4");
     
     
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
     
     
    WebElement element2 = (WebElement) driver.findElement(By.xpath("//android.view.ViewGroup[@index='1']"));
 	element2.sendKeys("6170140013");
       
	}
	
	catch(Exception e){

	    e.printStackTrace();

	    }
	}

@Test
public void ZenithtransferOwnAccount() throws Exception
{
	
	try
	{
	
		DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setCapability("BROWSER_NAME", "Android");
		  caps.setCapability("VERSION", "7.0.0"); 
		  caps.setCapability("deviceName","emulator");
		  caps.setCapability("platformName","Android");
		 
		  caps.setCapability("unicodeKeyboard", true);
		  caps.setCapability("resetKeyboard", true);
		  caps.setCapability("appPackage", "com.zenithbank.app");
		  caps.setCapability("appActivity","com.zenithbank.app.MainActivity"); 
		   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		   System.out.println("App Launched");
	

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//android.widget.Button[@text='ALLOW']")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Log In']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		((RemoteWebDriver) driver).findElementsByClassName("android.widget.EditText").get(0);
		((RemoteWebDriver) driver).findElementByClassName("android.widget.EditText").sendKeys("2185245829");
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.EditText[@text='Password']").click();
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("141414");
		((RemoteWebDriver) driver).findElementByXPath("//android.widget.TextView[@text='SIGN IN']").click();
		
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     driver.findElement(By.xpath("//android.widget.TextView[@text='Overview']")).getText();
     
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='2']")).click();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     
     Select dropdown = new Select(driver.findElement(By.xpath("//android.widget.TextView[@index='0'"))); 
     dropdown.selectByVisibleText("Text");
     driver.findElement(By.xpath("//android.widget.TextView[@text='OwnAccount']")).click();
     Select dropdown1 = new Select(driver.findElement(By.xpath("//android.widget.TextView[@index='0'"))); 
     dropdown1.selectByVisibleText("Text");
     
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='1']")).sendKeys("100");
     driver.findElement(By.xpath("//android.view.ViewGroup[@index='0']")).sendKeys("Loan");
     
     driver.findElement(By.xpath("//android.widget.TextView[@text='Schedule Transfer']")).getText();
     driver.findElement(By.xpath("//android.widget.TextView[@text='CONTINUE']")).click();
     
    
	}
	
	catch(Exception e){

	    e.printStackTrace();

	    }
	}

@AfterTest
public void End() {
//driver.quit();
      }
}




