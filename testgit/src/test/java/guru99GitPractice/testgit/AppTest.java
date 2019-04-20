package guru99GitPractice.testgit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    WebDriver driver;
    @Test
    public void shouldAnswerWithTrue()
    {
        driver = new FirefoxDriver();
        driver.get("http://localhost:8888");
    }
}
