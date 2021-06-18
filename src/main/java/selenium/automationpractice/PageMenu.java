package selenium.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class PageMenu {

    @FindBy(xpath = "//*[contains(@title, 'Log in')]")
    WebElement btn_signin;

    @FindBy(xpath = "//a[@title='Women']")
    WebElement btn_women;

    @FindBy(xpath = "//li[@class='sfHover']//a[@title='Evening Dresses']")
    WebElement link_hover_evening_dresses;

    @FindBy(xpath = "//span[contains(@class, 'continue btn')]")
    WebElement btn_continue_shopping;

    @FindBy(xpath = "//a[@class = 'ajax_cart_block_remove_link']")
    WebElement btn_delete_product;

    @FindBy(xpath = "//a[contains(@title, 'shopping')]")
    WebElement btn_shopping_cart;

    public PageLogin clickSignIn(WebDriver driver) {
        btn_signin.click();
        return PageFactory.initElements(driver, PageLogin.class);
    }

}