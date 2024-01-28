
import POM.HomePage;
import POM.SearchPage;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class SearchTest {
    private HomePage homePage;
    private SearchPage searchPage;

    @Before
    public void setUp() {
        homePage = open("https://careers.justeattakeaway.com/global/en/home", HomePage.class);
        sleep(2000);

    }
    @Test

    public void SearchInput() {
        homePage.SendTest();
sleep(30000);
    }




}
