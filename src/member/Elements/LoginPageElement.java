package member.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElement {

    public LoginPageElement(WebDriver pWebDriver){
        PageFactory.initElements(pWebDriver, this);
    }

    @FindBy(xpath = ".//input[@name= \"dna_id1\"]")
    WebElement dnaid1;

    public void getDnaid1(int id){
        dnaid1.sendKeys(String.valueOf(id));
    }

    @FindBy(xpath = ".//input[@name='dna_id2']")
    WebElement dnaid2;

    public void getDnaid2(int id){
        dnaid2.sendKeys(String.valueOf(id));
    }

    @FindBy(xpath = ".//input[@id='customRadio1']")
    WebElement Athelte;

    public void clickAthelete(){
        Athelte.click();
    }

    @FindBy(xpath = ".//button[@type='submit']")
    WebElement Submit;

    public void clickSubmit(){
        Submit.click();
    }
}
