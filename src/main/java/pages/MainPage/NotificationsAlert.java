package pages.MainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class NotificationsAlert {

    private final WebDriver driver;
    private final WebDriverWait wait;
    private final pages.MainPage.Repository.MainPageRepository repo = new pages.MainPage.Repository.MainPageRepository();

    public NotificationsAlert(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void CloseNotificationsAlert() {
        wait.until(ExpectedConditions.elementToBeClickable(repo.NotificationsAlertField));
        driver.findElement(repo.DeclineNotificationsBtn).click();
        wait.until(ExpectedConditions.numberOfElementsToBe(repo.NotificationsAlertField, 0));
    }
}
