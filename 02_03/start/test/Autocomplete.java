import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/mdtapps/Google_Chrome_Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

         driver.get("https://formy-project.herokuapp.com/autocomplete");

         WebElement autocomplete = driver.findElement(By.id("autocomplete"));
         autocomplete.sendKeys("8780 canyon ferry, helena, mt");
         Thread.sleep(2000 ); //slows the test down

        WebElement autocompleteResults = driver.findElement(By.className("pac-item"));
                 autocompleteResults.click();

        driver.quit();
    }
}
