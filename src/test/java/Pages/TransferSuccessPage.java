package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransferSuccessPage {

    WebDriver driver;
    WebDriverWait wait;

    By TransferProofButton = By.xpath("//button[@type='button' and contains(@class, 'MuiButton-containedPrimary') and contains(@class, 'css-6k7xu9') and text()='Lihat Bukti Transfer']");
    By TransferSuccessPict = By.xpath("//img[@alt='Ilustrasi' and contains(@src, '/assets/complete%20ilustrasi-vkd_vzom.png')]");
    By TransferSuccessText = By.xpath("//h4[contains(text(), 'Transaksi Berhasil')]");


    public TransferSuccessPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickTransferProofButton() {
        wait.until(ExpectedConditions.elementToBeClickable(TransferProofButton));
        driver.findElement(TransferProofButton).click();
    }

    public boolean TransferSuccessPictDisplayed() {
        return driver.findElement(TransferSuccessPict).isDisplayed();
    }

    public String getTextTransferSuccess() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TransferSuccessText));
        return driver.findElement(TransferSuccessText).getText();
    }
}
