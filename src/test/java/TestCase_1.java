
import POM.HomePage;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCase_1 {
    private HomePage homePage;
    @Before
    public void setUp() {
        homePage = open("https://careers.justeattakeaway.com/global/en/home", HomePage.class);
        sleep(10000);
    }
    @Test
    public void TestCase1() {
        homePage.SendTest();
        sleep(10000);
        homePage.getLocations();
        assertFalse (homePage.checkLocations());
        homePage.ClickCountryAccordion();
        sleep(5000);
        homePage.clickCheckBox();
        sleep(10000);
        homePage.getLocations();
       assertTrue(homePage.checkLocations2());
    }
}


