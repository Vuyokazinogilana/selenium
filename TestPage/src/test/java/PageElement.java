import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageElement {

    WebDriver driver;
      private final WebDriverWait wait;

    public PageElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"ng-app\"]/body/div[10]/div/div/div/div/div[2]/div[4]/div[2]/div")
    public WebElement acceptDisclaimerButton;
    @FindBy(how = How.LINK_TEXT, using = "VIEW OUR FEATURED FUNDS")
    public WebElement viewFeatureFunds;
//    @FindBy(how = How.LINK_TEXT, using = "JPM UK Dynamic Fund")
 //   public WebElement fundHeader;
    @FindBy(how = How.XPATH, using = "//*[@id=\"1383537148456\"]/div/div[1]/div/div[1]/div[2]/div[2]/span/div/span/a/span/span[1]")
    public WebElement findOutMoreUKDFunds;
    @FindBy(how = How.XPATH, using = "//*[@id=\"searchbox\"]")
    public WebElement jumpToAFundSearch;
    @FindBy(how = How.CLASS_NAME, using = "row margin-horizontal-0")
    public WebElement fund1;
    @FindBy(how = How.XPATH, using = "//*[@id=\"card-component-fund-facts\"]/div/div[2]/div[2]")
    public WebElement isin;



    public String isinExists(){
       return wait.until(ExpectedConditions.visibilityOf(isin)).getText();
    }

    public void websiteTest() {
        acceptDisclaimerButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(viewFeatureFunds));
        viewFeatureFunds.click();
        wait.until(ExpectedConditions.elementToBeClickable(findOutMoreUKDFunds));
        findOutMoreUKDFunds.click();
        wait.until(ExpectedConditions.elementToBeClickable(jumpToAFundSearch));
        jumpToAFundSearch.sendKeys("GB0009698001");
        wait.until(ExpectedConditions.visibilityOf(fund1));
        fund1.click();
        wait.until(ExpectedConditions.visibilityOf(isin));


    }
}
