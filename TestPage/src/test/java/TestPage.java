import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TestPage {

    PageElement user;

    @Test
    @Description("View Featured Funds")
    public void viewFeaturedFunds(){
        WebDriver driver = StartBrowser.startBrowser();
        user = PageFactory.initElements(driver, PageElement.class);
        user.websiteTest();
        Assert.assertEquals(user.isinExists(); "ISIN GB0009698001");
    }
}
