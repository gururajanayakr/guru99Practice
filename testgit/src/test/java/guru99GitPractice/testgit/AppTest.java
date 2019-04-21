package guru99GitPractice.testgit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class AppTest 
{
    WebDriver driver;
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
        driver = new FirefoxDriver();
        driver.get("http://localhost:8888/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.cssSelector("input[valign='absmiddle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.linkText("General Settings")).click();
    }
}
