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
            boolean CheckEqual = Locations.stream().allMatch(s->s== Locations.get(0));
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
        boolean Check2 = Locations2.stream().allMatch(s->Locations2.contains("Netherlands"));
        return Check2;
    }
}




