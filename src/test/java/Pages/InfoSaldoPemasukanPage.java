package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InfoSaldoPemasukanPage {

    WebDriver driver;
    WebDriverWait wait;

    By CopyIcon = By.xpath("//button[@aria-label='Tombol Salin, ini akan menyalin nomor rekening pengguna']");
    By EyeIcon = By.xpath("//*[@data-testid='VisibilityIcon']");
    By TransferRupiah = By.xpath("//span[contains(@class, 'MuiTouchRipple-root') and contains(@class, 'css-w0pj6f')]");
    By QRTerima = By.id("");
    By SetorTunai = By.id("");
    By MonthInformation = By.xpath("//div[text()='Juli 2024']");
    By Pengeluaran = By.xpath("//div[text()='Pengeluaran']");
    By LihatMutasiButton = By.id("");
    By HiddenBalance = By.xpath("//span[text()='*****']");
    By ChangeMonth = By.xpath("//button[contains(@class, 'MuiButtonBase-root') and contains(@class, 'MuiIconButton-root') and contains(@class, 'MuiIconButton-sizeSmall') and contains(@class, 'css-1yipi07')]");


    public InfoSaldoPemasukanPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickCopyIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(CopyIcon));
        driver.findElement(CopyIcon).click();
    }

    public void ClickEyeIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(EyeIcon));
        driver.findElement(EyeIcon).click();
    }

    public void ClickTransferRupiah() {
        // Wait until the element is clickable
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(TransferRupiah));

        // Scroll the element into view using JavaScript
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        // Click the element
        element.click();
    }

    public void ClickQRTerima() {
        wait.until(ExpectedConditions.elementToBeClickable(QRTerima));
        driver.findElement(QRTerima).click();
    }

    public void ClickSetorTunai() {
        wait.until(ExpectedConditions.elementToBeClickable(SetorTunai));
        driver.findElement(SetorTunai).click();
    }

    public String getMonthInformation() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(MonthInformation));
        return driver.findElement(MonthInformation).getText();
    }

    public void ClickPengeluaran() {
        wait.until(ExpectedConditions.elementToBeClickable(Pengeluaran));
        driver.findElement(Pengeluaran).click();
    }

    public void ClickLihatMutasiButton() {
        wait.until(ExpectedConditions.elementToBeClickable(LihatMutasiButton));
        driver.findElement(LihatMutasiButton).click();
    }

    public boolean HiddenBalanceDisplayed() {
        return driver.findElement(HiddenBalance).isDisplayed();
    }

    public void ClickChangeMonth() {
        wait.until(ExpectedConditions.elementToBeClickable(ChangeMonth));
        driver.findElement(ChangeMonth).click();
    }
}
