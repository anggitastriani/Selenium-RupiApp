package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TarikSuccessPage {

    WebDriver driver;
    WebDriverWait wait;

    By ShareButton = By.id("");
    By Text =  By.xpath("//h6[contains(@class, 'MuiTypography-root') and contains(@class, 'MuiTypography-h6') and contains(@class, 'css-2xgtc5')]");
    By NewTokenButton = By.xpath("//button[@type='button' and contains(@class, 'MuiButton-containedPrimary') and contains(@class, 'css-olfkle') and @aria-label='button make new token']");


    public TarikSuccessPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public boolean TextDisplayed() {
        return driver.findElement(Text).isDisplayed();
    }

    public void ClickShareButton() {
        wait.until(ExpectedConditions.elementToBeClickable(ShareButton));
        driver.findElement(ShareButton).click();
    }

    public void ClickNewTokenButton() {
        wait.until(ExpectedConditions.elementToBeClickable(NewTokenButton));
        driver.findElement(NewTokenButton).click();
    }
}
