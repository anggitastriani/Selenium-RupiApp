package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class QRTerimaPage {

    WebDriver driver;
    WebDriverWait wait;

    By CreateNewQRButton = By.id("");
    By ShareQRButton = By.id("");
    By HistoryButton = By.xpath("//img[@alt='Riwayat']");
    By AddAmount = By.id("");

    public QRTerimaPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickShareQRButton() {
        wait.until(ExpectedConditions.elementToBeClickable(ShareQRButton));
        driver.findElement(ShareQRButton).click();
    }

    public void ClickCreateNewQRButton() {
        wait.until(ExpectedConditions.elementToBeClickable(CreateNewQRButton));
        driver.findElement(CreateNewQRButton).click();
    }

    public void ClickHistoryButton() {
        wait.until(ExpectedConditions.elementToBeClickable(HistoryButton));
        driver.findElement(HistoryButton).click();
    }

    public void ClicAddAmount() {
        wait.until(ExpectedConditions.elementToBeClickable(AddAmount));
        driver.findElement(AddAmount).click();
    }

}
