

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class sample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\downlod files\\Jars\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Actions actions=new Actions(driver);
		
		WebElement admin=driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
		WebElement UserManagement=driver.findElement(By.id("menu_admin_UserManagement"));
		WebElement viewSystemUsers=driver.findElement(By.id("menu_admin_viewSystemUsers"));
		actions.moveToElement(admin).build().perform();
		actions.moveToElement(UserManagement).build().perform();
		actions.moveToElement(viewSystemUsers).click().build().perform();
		
		String act_result=driver.getTitle();
		String exp_result="OrangeHRM";
		/*System.out.println(result);*/
		
		
		
		
		if(act_result.equals(exp_result))
		{
			System.out.println("Testcase Passed");
		}
		else
		{
			System.out.println("Testcase Failed");
		}
		
		
		
		
		/*driver.findElement(By.xpath("q")).sendKeys("cricbuzz"+Keys.ENTER);*/
		

	}

}
