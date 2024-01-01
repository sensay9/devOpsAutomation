package google.tests;

import google.base.baseClass;
import google.pages.homePage;
import google.pages.productPage;
import org.testng.Assert;
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

    @Test
    public void validateProductPageURL() {
        productPage product = new productPage();
        String currentURL = product.validateProductPageURL();
        Assert.assertEquals(currentURL, "https://www.saucedemo.com/v1/inventory.html",
                "Product page URL does not match expected URL");

    }




}


