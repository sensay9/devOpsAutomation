package google.tests;

import google.base.baseClass;
import google.pages.homePage;
import google.pages.productPage;
import org.testng.annotations.Test;

public class HomeTest extends baseClass {

    @Test
    public void loginAndValidateElement() {
        homePage home = new homePage(driver);

        // Perform login
        home.validateUserLogin();
    }

    @Test
    public void validateProductTitle() {
        productPage product = new productPage();
        product.validateProductTitleContainsText("Sauce Labs Backpack");
    }

}


