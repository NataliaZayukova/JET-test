import POM.HomePage;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCase_1 {
    private HomePage homePageTestCase1;

    @Before
    //Step 1. Open https://careers.justeattakeaway.com/global/en/home
    public void setUp() {
        homePageTestCase1 = open("https://careers.justeattakeaway.com/global/en/home", HomePage.class);
        sleep(10000);
    }

    @Test
    public void TestCase1() {
        //Step 2. Search for the Job Title “Test”
        homePageTestCase1.SendTest();
        sleep(5000);
        //Step 3. Verify that the search contains results from multiple locations
        homePageTestCase1.getLocations();
        assertFalse(homePageTestCase1.checkLocations());
        //Step 4. Refine your search from the left panel to the Country “Netherlands”
        homePageTestCase1.ClickCountryAccordion();
        sleep(5000);
        homePageTestCase1.clickCheckBoxNetherlands();
        sleep(5000);
        //Step 5. Verify that now the search results’ location is the Netherlands only
        homePageTestCase1.getLocations();
        assertTrue(homePageTestCase1.checkLocationsNetherlands());
    }
}


