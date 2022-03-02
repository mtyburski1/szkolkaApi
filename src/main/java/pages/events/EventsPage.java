package pages.events;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

import java.util.List;

public class EventsPage extends BasePage {
    public EventsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".event-actions a")
    private List<WebElement> pickEventBtn;

    @FindBy(xpath = "/html/body/div[4]/div/div[1]/div[2]/div[1]")
    private WebElement eventTileText;

    @FindBy(css = ".event-ticket-buttons input")
    private List<WebElement> ticketQuantity;

    @FindBy(css = ".btn.btn-primary")
    private List<WebElement> addToCartBtn;

    @FindBy(css = ".event-ticket-title")
    private List<WebElement> ticketNameText;

    public String getTicketNameText(int which){
        return ticketNameText.get(which).getText();
    }

    public EventsPage setTicketQuantity(int which, int value) {
        ticketQuantity.get(which).clear();
        sendKeys(ticketQuantity.get(which), String.valueOf(value));
        addToCartBtn.get(which).click();
        return this;
    }

    public String getEventTitleText() {
        wait.until(ExpectedConditions.elementToBeClickable(eventTileText));
        return eventTileText.getText();
    }

    public EventsPage pickEventClick(int value) throws InterruptedException {
        Thread.sleep(1000);
        click(pickEventBtn.get(value));
        return this;
    }
}
