package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Enservio {
	 private static WebDriver driver = null;

	public static void main(String[] args) {
	
		driver = new FirefoxDriver();
	    driver.get("https://apps3test.enservio.com/myaccess/?carrier=Enservio/#/user/login");
	    driver.manage().window().maximize();
	    
	    //signUp("autcoding17@yopmail.com","Testpsw@123", "Testpsw@123");
	
	    login("autcoding17@yopmail.com","Testpsw@123");
	    driver.close();// close the window in focus
	}
	
	
	public static void signUp(String sUsrName, String sPsw, String sPswConfirm){
		   
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.findElement(By.linkText("NEW USER")).click();	 		
		driver.findElement(By.xpath("//*[@id='chkSP']/LABEL[1]/INPUT[1]")).click();//show password
		driver.findElement(By.id("email")).sendKeys(sUsrName);//Type Username
		driver.findElement(By.id("uPassword")).sendKeys(sPsw);//Type Password
		driver.findElement(By.id("uConfirmPassword")).sendKeys(sPswConfirm);//Type conformed password
		driver.findElement(By.id("agree")).click(); // check agree checkbox
 		driver.findElement(By.xpath("/HTML/BODY/DIV[2]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/IAP-SUBMIT-BUTTON[1]/BUTTON[1]")).click();//SignUp 		
 		
	}

	public static void login(String sUsrName, String sPsw){
		
        String loiginurl = "https://apps3test.enservio.com/myaccess/?carrier=Enservio/#/user/login";
        
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/HTML/BODY/DIV[2]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]")).sendKeys(sUsrName);//Type Username
		driver.findElement(By.xpath("/HTML/BODY/DIV[2]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]")).sendKeys(sPsw);//Type password
		driver.findElement(By.xpath("/HTML/BODY/DIV[2]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/IAP-SUBMIT-BUTTON[1]/BUTTON[1]")).click();//Click Next
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		
 		String actualUrl = driver.getCurrentUrl();
 			
		if (actualUrl.equals(loiginurl)){
			System.out.println("Verification Successful - The correct Url is opened.");
		}else{
			System.out.println("Verification Failed - An incorrect Url is opened.");
			System.out.println("Actual URL is : " + actualUrl);
			System.out.println("Expected URL is : " + loiginurl);
		}

		
		
	}

	
	
	

}
