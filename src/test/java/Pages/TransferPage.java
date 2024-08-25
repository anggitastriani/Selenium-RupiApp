package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransferPage {

    WebDriver driver;
    WebDriverWait wait;

    By AddAccountButton = By.id("tambah-rekening-baru");
    By StarIcon = By.xpath("//svg[@data-testid='StarRoundedIcon']");
    By ExistingAccount = By.id("");
    By noFavoriteTransactionText = By.xpath("//span[text()='Tidak ada transaksi favorit.']");


    public TransferPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickAddAccountButton() {
        wait.until(ExpectedConditions.elementToBeClickable(AddAccountButton));
        driver.findElement(AddAccountButton).click();
    }

    public void ClickStarIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(StarIcon));
        driver.findElement(StarIcon).click();
    }

    public void ClickExistingAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(ExistingAccount));
        driver.findElement(ExistingAccount).click();
    }

    public boolean noFavoriteTransactionTextNotDisplayed() {
        return driver.findElement(noFavoriteTransactionText).isDisplayed();
    }
}
