package member.Tests;

import member.Elements.LoginPageElement;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class Setup {
    public WebDriver driver;
    public String MemberUrl = "https://idensilchina-devmember.ekbana.info/";
    public Properties propObj = new Properties();



    Random random = new Random();
    public int x = random.nextInt(900)+ 100;
    int id = x;



    public void readConstantValues() throws IOException {
        FileReader readConfig= new FileReader("src/config.properties");
        propObj.load(readConfig);

        //MemberUrl = propObj.getProperty("Member_Url");


    }

    public void checkOs(){
        String  operatingSystem = System.getProperty("os.name").toLowerCase();
        System.out.println("current os is :" + operatingSystem);

        if(operatingSystem.contains("windows")){
            System.getProperty("webdriver.chrome.driver", "/WebDrivers/chromedriver2.40.exe");
        }else{
            System.setProperty("webdriver.chrome.driver", "WebDrivers/chromedriver");
        }
    }

    public void LoginFunction() throws InterruptedException {
        LoginPageElement logObj = new LoginPageElement(driver);
        logObj.getDnaid1(id);
        System.out.println("current value of x is:" + id);
        logObj.getDnaid2(id);
        Thread.sleep(2000);
        //clicking athlete
        //for javascript execution
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('customRadio1').click();");
        Thread.sleep(4000);
        logObj.clickSubmit();
    }

    @BeforeMethod
    public void setupAndTearDown() throws InterruptedException {
        checkOs();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(MemberUrl);
        //calling login function
        LoginFunction();

    }
}
