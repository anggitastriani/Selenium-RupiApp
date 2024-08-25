package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    By TransferMenu = By.xpath("//img[@alt='Transfer Rupiah']");
    By MutasiMenu = By.xpath("//a[@aria-label='Tombol Menu Mutasi Rekening, ini akan membawa Anda ke halaman Mutasi Rekening']");
    By TarikSetorMenu = By.xpath("//div[text()='Tarik & Setor Tunai']");
    By QRTerimaMenu = By.xpath("//div[text()='QR Terima Transfer']");
    By QRISMenu = By.xpath("//a[@aria-label='Tombol Menu QRIS, ini akan membawa Anda ke halaman QRIS']");
    By InfoSaldoMenu = By.xpath("//button[@aria-label='Tombol Info Saldo, ini akan membawa Anda ke halaman Saldo']");
    By RekapMenu = By.id("");
    By LogoApp = By.xpath("//img[@alt='Logo Rupi App']");
    By LogoText = By.id("logoText");
    By CopyIcon = By.xpath("//button[@aria-label='Tombol Salin, ini akan menyalin nomor rekening pengguna']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public boolean LogoAppDisplayed() {
        return driver.findElement(LogoApp).isDisplayed();
    }

    public boolean LogoTextDisplayed() {
        return driver.findElement(LogoText).isDisplayed();
    }

    public void ClickTransferMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(TransferMenu));
        driver.findElement(TransferMenu).click();
    }

    public void ClickMutasiMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(MutasiMenu));
        driver.findElement(MutasiMenu).click();
    }

    public void CickQRTerimaMenu() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(QRTerimaMenu));

        // Scroll ke elemen TarikSetorMenu
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(QRTerimaMenu));

        // Tunggu hingga elemen dapat diklik
        wait.until(ExpectedConditions.elementToBeClickable(QRTerimaMenu));

        // Klik elemen TarikSetorMenu
        driver.findElement(QRTerimaMenu).click();
    }

    public void ClickTarikSetorMenu() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TarikSetorMenu));

        // Scroll ke elemen TarikSetorMenu
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(TarikSetorMenu));

        // Tunggu hingga elemen dapat diklik
        wait.until(ExpectedConditions.elementToBeClickable(TarikSetorMenu));

        // Klik elemen TarikSetorMenu
        driver.findElement(TarikSetorMenu).click();
    }

    public void ClickQRISMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(QRISMenu));
        driver.findElement(QRISMenu).click();
    }

    public void ClickInfoSaldoMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(InfoSaldoMenu));
        driver.findElement(InfoSaldoMenu).click();
    }

    public void ClickRekapMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(RekapMenu));
        driver.findElement(RekapMenu).click();
    }

    public void ClickCopyIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(CopyIcon));
        driver.findElement(CopyIcon).click();
    }
    public String getTextDashboard() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogoText));
        return driver.findElement(LogoText).getText();
    }
}
