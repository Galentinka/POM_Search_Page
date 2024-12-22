package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {

    public WebDriver driver;

    @FindBy(xpath = "//h1[text()='HP LP3065']")
    private WebElement HPElementDetailedPage;

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean HPElementDetailedPageIsDisplayed() {
        return HPElementDetailedPage.isDisplayed();
    }
}
