package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class QRISPage {

    WebDriver driver;
    WebDriverWait wait;

    By QRlogo = By.xpath("//img[@alt='Qr Code']");

    public QRISPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickQRlogo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(QRlogo));

        // Scroll ke elemen TarikSetorMenu
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(QRlogo));

        // Tunggu hingga elemen dapat diklik
        wait.until(ExpectedConditions.elementToBeClickable(QRlogo));

        // Klik elemen TarikSetorMenu
        driver.findElement(QRlogo).click();
    }

}
