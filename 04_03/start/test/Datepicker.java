import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/mdtapps/Google_Chrome_Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

    WebElement dateField = driver.findElement(By.id("datepicker"));
    dateField.sendKeys("06/03/2020");
        Thread.sleep(2000 ); //slows the test down
    dateField.sendKeys(Keys.RETURN);

        driver.quit();
    }
}