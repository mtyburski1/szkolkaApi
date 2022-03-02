package pages.events;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import java.util.List;

public class EventsPage extends BasePage {
    public EventsPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".btn.btn-info")
    private List<WebElement> pickEventBtn;

    public EventsPage pickEventClick(int value){
        click(pickEventBtn.get(value));
        return this;
    }
}
