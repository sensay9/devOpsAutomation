package google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static google.base.baseClass.driver;

public class productPage {

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    private WebElement productTitle;

    public productPage() {
        PageFactory.initElements(driver, this);
    }

    public void validateProductTitleContainsText(String expectedText) {
        String actualText = productTitle.getText();
        Assert.assertTrue(actualText.contains(expectedText), "Product title does not contain the expected text");
    }
}
