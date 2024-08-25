package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InfoTransferPage {

    WebDriver driver;
    WebDriverWait wait;

    By TextInfoTransfer = By.xpath("//p[text()='Transfer Rupiah']");


    public InfoTransferPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public String getTextInfoTransfer() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TextInfoTransfer));
        return driver.findElement(TextInfoTransfer).getText();
    }
}
