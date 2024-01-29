
import POM.HomePage;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;

public class TestCase_1 {
    private HomePage homePage;
    @Before
    public void setUp() {
        homePage = open("https://careers.justeattakeaway.com/global/en/home", HomePage.class);
        sleep(30000);
    }
    @Test
    public void TestCase1() {
        homePage.SendTest();
        sleep(30000);
        homePage.getLocations();
        assert(homePage.checkLocations());
        homePage.ClickCountryAccordion();
        sleep(5000);
        homePage.clickCheckBox();
        sleep(30000);
        homePage.getLocations();
        assert(homePage.checkLocationsNetherlands());
    }
}


