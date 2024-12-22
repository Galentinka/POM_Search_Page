package TestCases;

import Pages.LandingPage;
import Pages.ProductDetailsPage;
import Pages.ProductPage;
import TestBase.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchProductTest extends TestBase {

    public SearchProductTest() throws Exception {
        super();
    }

    public WebDriver driver;
    public LandingPage landingPage;
    public ProductPage productPage;
    public ProductDetailsPage productDetailsPage;

    @BeforeMethod
    public void setup() {
        driver = initializeBrowser(properties.getProperty("browser"));
        landingPage = new LandingPage(driver);
    }

    @Test
    public void verifySearchWithValidProduct() {
        productPage = landingPage.navigateDirectlyToProductPage(properties.getProperty("validProduct"));
        Assert.assertTrue(productPage.displayOfHPLaptop());
        productDetailsPage = productPage.clickOnHP();
        Assert.assertTrue(productDetailsPage.HPElementDetailedPageIsDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
