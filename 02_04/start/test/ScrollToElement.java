import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/mdtapps/Google_Chrome_Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        Thread.sleep(2000 ); //slows the test down
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Nora Bazuin");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("05/20/2020");
        Thread.sleep(2000 ); //slows the test down

        driver.quit();
    }
}
