package POM;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
//creating SearchForJobTitle element
    @FindBy(how = How.NAME , using = "phsKeywords")
    private SelenideElement SearchForJobTitle;
 //creating method to send text "Test" to Search field
    public HomePage SendTest() {
        SearchForJobTitle.sendKeys("Test");
        SearchForJobTitle.sendKeys(Keys.RETURN );

        return this;
    }



    }


