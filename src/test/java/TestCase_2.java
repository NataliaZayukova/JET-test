import POM.HomePage;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCase_2 {
    private HomePage homePageTestCase2;
    @Before
    //Step 1. Open https://careers.justeattakeaway.com/global/en/home
    public void setUp() {
        homePageTestCase2 = open("https://careers.justeattakeaway.com/global/en/home", HomePage.class);
        sleep(10000);
    }
    @Test
    public void TestCase2() {
homePageTestCase2.ClickOnSearchForJobTitle();
        sleep(3000);
        homePageTestCase2.ClickOnSalesCategory();
        sleep(10000);
        homePageTestCase2.Scroll();
        sleep(3000);
        assertTrue(homePageTestCase2.CheckSalesCategoryIsChosen());
assertTrue(homePageTestCase2.CompareNumbersOfSalesJobs());
homePageTestCase2.ClickCountryAccordion();
        sleep(10000);
homePageTestCase2.ClickOnGermanyFilter();
assertTrue(homePageTestCase2.CompareNumbersOfGermanyJobs());
    }
}
