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

    //Creating list of locations of found jobs
    ArrayList<WebElement> Locations = new ArrayList<>();

    public ArrayList<WebElement> getLocations() {
        for (int i = 1; i <= 5; i++) {
            String xpath = "/html/body/div[2]/div[2]/div/div/div/div[2]/section[4]/div/div/div/div[2]/div[2]/ul/li[" + i + "]/div/p/span[2]/span";
            WebElement Location = getFocusedElement().findElement(By.xpath(xpath));
            Locations.add(Location);
        }
        return Locations;
    }

    //Creating method to check if elements are different
    public boolean checkLocations() {
        String CheckLocation = Locations.get(0).getText();
        boolean Result;
        for (int i = 1; i <= 5; i++) {
            if (CheckLocation == Locations.get(i).getText())
                Result = true;
            else Result = false;
            if (Result = true) break;
        }
        return true;
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

    //creating method for clicking checkbox
    public HomePage clickCheckBox() {
        Checkbox.click();
        return this;
    }

    //Checking that now Location = Netherlands
    public boolean checkLocationsNetherlands() {
        String CheckLocation = "Netherlands";
        for (int i = 1; i <= 5; i++) {
            if (CheckLocation == Locations.get(i).getText())
                return true;
        }
        return true;
    }
}




