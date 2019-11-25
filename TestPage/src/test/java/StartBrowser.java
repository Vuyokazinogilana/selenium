import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartBrowser {

    public static WebDriver startBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vuyo\\IdeaProjects\\TestPage\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" https://am.jpmorgan.com/gb/en/asset-management/gim/adv/home ");
        return driver;
    }
}
