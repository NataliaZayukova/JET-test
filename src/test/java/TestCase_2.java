import POM.HomePage;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
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
        //Step 2. Click on “Search for Job Title”
        homePageTestCase2.ClickOnSearchForJobTitle();
        sleep(3000);
        //Step.3 Select “Sales” among Job Categories
        homePageTestCase2.ClickOnSalesCategory();
        sleep(10000);
        //Step 4. Scroll to “Refine your search”
        homePageTestCase2.Scroll();
        sleep(3000);
        //Step 5. Verify Category “Sales” is selected
        assertTrue(homePageTestCase2.CheckSalesCategoryIsChosen());
        //Step 6. Verify the search results number is matching
        assertTrue(homePageTestCase2.CompareNumbersOfSalesJobs());
        //Step 7. Refine your search from the left panel to the Country “Germany”
        homePageTestCase2.ClickCountryAccordion();
        sleep(10000);
        homePageTestCase2.ClickOnGermanyFilter();
        //Step 8. Verify the number of the search results is matching
        assertTrue(homePageTestCase2.CompareNumbersOfGermanyJobs());
        sleep(3000);
        //Step 9. Verify that category is “Sales” on all results
        assertTrue(homePageTestCase2.checkSalesInAllResults());
    }
}
