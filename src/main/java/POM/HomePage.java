package POM;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.getFocusedElement;

public class HomePage {
    //creating SearchForJobTitle element
    @FindBy(how = How.NAME, using = "phsKeywords")
    private SelenideElement SearchForJobTitle;

    //creating method to send text "Test" to Search field
    public HomePage SendTest() {
        SearchForJobTitle.sendKeys("Test");
        SearchForJobTitle.sendKeys(Keys.RETURN);
        return this;
    }

    //Creating list of locations of found jobs without Country specified
    ArrayList<WebElement> Locations = new ArrayList<>();

    public ArrayList<WebElement> getLocations() {
        for (int i = 1; i <= 5; i++) {
            String xpath = "/html/body/div[2]/div[2]/div/div/div/div[2]/section[4]/div/div/div/div[2]/div[2]/ul/li[" + i + "]/div/p/span[2]/span";
            WebElement Location = getFocusedElement().findElement(By.xpath(xpath));
            Locations.add(Location);
        }
        return Locations;
    }

    //Creating method to check if elements are equal to each other
    public boolean checkLocations() {
        boolean CheckEqual = Locations.stream().allMatch(s -> s == Locations.get(0));
        return CheckEqual;
    }

    //creating CountryAccordion element
    @FindBy(how = How.ID, using = "CountryAccordion")
    private SelenideElement CountryAccordion;

    //creating method for expanding Country list
    public HomePage ClickCountryAccordion() {
        CountryAccordion.click();
        return this;
    }

    //Creating checkbox Netherlands
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div/div/div/div[1]/section[1]/div/div/div/div[3]/div[2]/div[2]/div/div[2]/ul/li[2]/label/span[2]")
    private SelenideElement Checkbox;

    //Creating method for clicking checkbox Netherlands
    public HomePage clickCheckBoxNetherlands() {
        Checkbox.click();
        return this;
    }

    //Creating list of locations of found jobs with Country=Netherlands specified
    ArrayList<WebElement> Locations2 = new ArrayList<>();

    public ArrayList<WebElement> getLocations2() {
        for (int i = 1; i <= 5; i++) {
            String xpath = "/html/body/div[2]/div[2]/div/div/div/div[2]/section[4]/div/div/div/div[2]/div[2]/ul/li[" + i + "]/div/p/span[2]/span";
            WebElement Location = getFocusedElement().findElement(By.xpath(xpath));
            Locations2.add(Location);
        }
        return Locations2;
    }

    //Creating method to check that Location = Netherlands in all found jobs
    public boolean checkLocationsNetherlands() {
        boolean Check2 = Locations2.stream().allMatch(s -> Locations2.contains("Netherlands"));
        return Check2;
    }

    //creating method to click SearchForJobTitle element
    public HomePage ClickOnSearchForJobTitle() {
        SearchForJobTitle.click();
        return this;
    }

    //Creating Sales Category element
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/section[2]/div/div/div/div/div/div/div/section/div/form/div[2]/div/div[1]/div/div[1]/div/ul[1]/li[1]/a/span[1]")
    private SelenideElement SalesCategory;

    //Creating method to click on Sales category
    public HomePage ClickOnSalesCategory() {
        SalesCategory.click();
        return this;
    }

    //Creating variable with Sales jobs number in Search
    @FindBy(how = How.XPATH, using = "//*[@id=\"CategoryBody\"]/div/div[2]/ul/li[9]/label/span[3]/span")
    public SelenideElement NumberSalesInSearch;

    //Creating "Refine your search" element
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div/div/div/div[1]/section/div/div/div/div[2]/div/h2/ppc-content")
    private SelenideElement RefineYourSearch;

    //Scroll to "Refine your search" element
    public HomePage Scroll() {
        RefineYourSearch.scrollTo();
        return this;
    }

    //Creating Sales element in filters
    @FindBy(how = How.XPATH, using = "//*[@id=\"acc-skip-content\"]/div[2]/div/div/div/div[2]/section/div/div/div/div[1]/ul/li[1]/span")
    public SelenideElement Salesinfilter;

    //Creating method to check that Sales parameter in filtes is presented
    public boolean CheckSalesCategoryIsChosen() {
        Salesinfilter.exists();
return true;
    }
    //Creating number of Sales job in results of search element
    @FindBy(how = How.XPATH, using = "//*[@id=\"acc-skip-content\"]/div[2]/div/div/div/div[2]/section/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div[1]/span[1]")
    public SelenideElement NumberJobsInResult;
//Creating method to compare numbers in Search and in Result
    public boolean CompareNumbersOfSalesJobs()
    {NumberSalesInSearch.equals(NumberJobsInResult);
        return true;
    }
//Creating Germany element
@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div/div/div/div[1]/section/div/div/div/div[3]/div[2]/div[2]/div/div[2]/ul/li[8]/label/span[2]")
public SelenideElement Germanyfilter;
    //Creating method to click on Germany filter
    public HomePage ClickOnGermanyFilter() {
        Germanyfilter.click();
        return this;
    }

    //Creating number of Germany jobs in filter
    @FindBy(how = How.XPATH, using = "//*[@id=\"CountryBody\"]/div/div[2]/ul/li[8]/label/span[3]/span")
    public SelenideElement NumberGermanyJobsInFilter;
    //Creating method to compare numbers in Search and in Result
    public boolean CompareNumbersOfGermanyJobs()
    {NumberGermanyJobsInFilter.equals(NumberJobsInResult);
        return true;
    }
    //Creating list of locations of found jobs matching "Sales" and "Germany" request
    ArrayList<WebElement> Locations3 = new ArrayList<>();

    public ArrayList<WebElement> getLocations3() {
        for (int i = 1; i <= 10; i++) {
            String xpath = "/html/body/div[2]/div[2]/div/div/div/div[2]/section/div/div/div/div[2]/div[2]/ul/li[" + i + "]/div[1]/p/span[3]/span";
            WebElement Location = getFocusedElement().findElement(By.xpath(xpath));
            Locations3.add(Location);
        }
        return Locations3;
    }
// creating method to verify that there is "Sales" on all results
public boolean checkSalesInAllResults() {
    boolean Check3 = Locations3.stream().allMatch(s -> Locations3.equals("Sales"));
    return Check3;
}
}




