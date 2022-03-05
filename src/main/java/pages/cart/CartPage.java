package pages.cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import java.util.List;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/a")
    private WebElement cartBuyBtn;

    @FindBy(css = ".form-control")
    private List<WebElement> quantity;

    @FindBy(css = ".col-md-3.col-xs-5 span")
    private List<WebElement> ticketNameInCart;

    public String getTicketNameInCart(int which) {
        return ticketNameInCart.get(which).getText();
    }

    public CartPage getQuanitty() {
        for (WebElement webElement : quantity) {
            System.out.println(webElement.getAttribute("value"));
        }
        return this;
    }
}
