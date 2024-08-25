package Steps;

import Pages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class QR_01_Steps {
    WebDriver driver;
    LoginPage login;
    HomePage home;
    LoginSuccessPage sukses;
    VerCodePage vercode;
    InfoSaldoPemasukanPage infosaldopemasukan;
    InfoSaldoPengeluaranPage infosaldopengeluaran;
    InfoTransferPage infotransfer;
    QRTerimaPage qrterima;
    RiwayatTerimaPage riwayatterima;
    RiwayatPendingPage riwayatpending;
    FilterPage filter;
    DatePage date;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("The user on login")
    public void user_login() {
        driver.get("https://rupiapp.me/");
    }

    @When("The user log in with this username {string} password {string}")
    public void user_log_in(String username, String password) {
        login = new LoginPage(driver);
        login.InputUsername(username);
        login.InputPassword(password);
        login.ClickLoginButton();
    }

    @When("The user click oke button")
    public void user_log_in() {
        sukses = new LoginSuccessPage(driver);
        sukses.ClickOkButton();
    }

    @When("The user filling OTP")
    public void user_filling_0TP() {
        vercode = new VerCodePage(driver);
        vercode.InputCode1("1");
        vercode.InputCode2("2");
        vercode.InputCode3("3");
        vercode.InputCode4("4");
        vercode.InputCode5("5");
        vercode.InputCode6("6");
        vercode.ClickContinueButton();
    }

    @When("The user direct to the {string}")
    public void user_direct_to_the(String menu) {
        home = new HomePage(driver);
        home.CickQRTerimaMenu();
    }


    @When("The user click riwayat button")
    public void user_click_riwayat_button() {
        qrterima = new QRTerimaPage(driver);
        qrterima.ClickHistoryButton();
    }

    @When("The user click filter button")
    public void user_click_filter_button() {
        riwayatterima = new RiwayatTerimaPage(driver);
        riwayatterima.ClickFilterButton();
    }

    @When("The user choose date for filtering")
    public void user_choose_date_for_fitering() {
        filter = new FilterPage(driver);
        date = new DatePage(driver);
        filter.ClickStartDateButton();
        date.ClickStartDateChoose();
        filter.ClickEndDateButton();
        date.ClickEndDateChoose();
        filter.ClickTerapkanButton();
    }


    @When("The user click pending button")
    public void user_click_pending_button() {
        riwayatterima = new RiwayatTerimaPage(driver);
        riwayatterima.ClickPendingButton();
    }


    @Then("The Text Riwayat Should be Displayed")
    public void text_riwayat_should_be_displayed() {
        riwayatterima = new RiwayatTerimaPage(driver);
        Assert.assertTrue(riwayatterima.RiwayatTextDisplayed());
    }

    @Then("The Date Text Should be Displayed")
    public void date_text_should_be_displayed() {
        riwayatterima = new RiwayatTerimaPage(driver);
        Assert.assertTrue(filter.dateTextDisplayed());
    }

    @Then("The Text Information Should be Displayed")
    public void text_information_should_be_displayed() {
        riwayatpending = new RiwayatPendingPage(driver);
        Assert.assertTrue(riwayatpending.TextInformationDisplayed());
    }

    @Then("The Text QR Terima should be displayed")
    public void text_qr_terima_should_be_displayed() {
        riwayatpending = new RiwayatPendingPage(driver);
        Assert.assertEquals(riwayatpending.getQRText(),"Riwayat QR Terima Transfer");
    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


