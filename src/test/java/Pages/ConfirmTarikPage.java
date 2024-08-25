package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfirmTarikPage {

    WebDriver driver;
    WebDriverWait wait;

    By ContinueButton = By.xpath("//button[contains(@class, 'MuiButton-containedPrimary') and contains(@class, 'css-15x888r')]");

    public ConfirmTarikPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
        driver.findElement(ContinueButton).click();
    }
}
