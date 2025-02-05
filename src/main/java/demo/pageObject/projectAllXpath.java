package demo.pageObject;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.guide.ClickableWindow;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class projectAllXpath extends userHomePage {
    public projectAllXpath(WebDriver driver) {
        projectAllXpath.driver = driver;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    //*****************************************************************************************************************
    private static WebDriver driver;
    //***********************Login Page*************************************************************************************
    @FindBy(how = How.XPATH, using = "//input[@id='username']")
    public static WebElement Username;
    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    public static WebElement Password;
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue')]")
    public static WebElement Sing_In;
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Log In')]")
    public static WebElement Log_In;
    @FindBy(how = How.XPATH, using = "//*[@id='captcha'][@type='text']")
    public static WebElement CaptchaTextBox;
    @FindBy(how = How.XPATH, using = " //*[@class='ca0df71c7']/button[@type='submit']")
    public static WebElement Continue;

    //***********************Create Product Page****************************************************************************
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[2]/div[1]/div[1]/div/p[1]")
    public static List<WebElement> MyShopsList;
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[2]/div[1]/div[1]/div[2]")
    public static WebElement MyShops;
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[3]/button[1]")
    public static WebElement CreateNewProduct;
    @FindBy(how = How.XPATH, using = "//*[text()='Create product']")
    public static WebElement CreateProductNew;
    @FindBy(how = How.XPATH, using = "//*[text()='Create show']")
    public static WebElement CreateShow;
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/form[1]/div[1]/div[1]/button[1]/span[1]")
    public static WebElement AddCoverPhoto;
    @FindBy(how = How.XPATH, using = "/html/body/div[9]/div[4]/div/div/div[1]/button[2]/span/*[1]")
    public static WebElement CoverPhotoSave;
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/form[1]/div[2]/div[1]/input[1]")
    public static WebElement EnterProductName;
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/form[1]/div[2]/div[2]/div[1]/input[1]")
    public static WebElement SelectCategory;
    @FindBy(how = How.XPATH, using = "//*[@role='dialog']/div[2]/div")
    public static List<WebElement> allCategory;
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/form[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    public static WebElement Price;
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/form[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")
    public static WebElement Weight;
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/form[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/select[1]")
    public static WebElement WeightEstimate;
    @FindBy(how = How.XPATH, using = "//*[@id='react-aria-0-15']/option")
    public static List<WebElement> WeightAllEstimate;
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/form[1]/div[3]/div[3]/div[1]/div[1]/div[4]/div[1]/input[1]")
    public static WebElement Quantity_in_stock;
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Publish product')]")
    public static WebElement PublishProduct;
    //*******************************Product Page***************************************************************************************
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/input[1]")
    public static WebElement searchProduct;
    //***************************Shows Page******************************************************************************************************
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]")
    public static WebElement ShowsTab;
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
    public static WebElement ShowsName;
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Create show link')]")
    public static WebElement CreateShowLink;
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/button[1]")
    public static WebElement AddSelectProduct;
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[7]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    public static WebElement ProductSearch;
    @FindBy(how = How.XPATH, using = "//div[@role='grid']/div[1]/div")
    public static List<WebElement> ListofProduct;
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/div[1]/main[1]/div[2]/div[1]/div[2]/*[1]")
    public static WebElement copyURL;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Sign in to add to cart')]")
    public static WebElement Signintoaddtocart;
    //***********************************************************************************************************************************
    public static void enterValue(WebElement element, String value) {
        element.sendKeys(value);
    }

    public static void clickOn(WebElement submitButton) throws InterruptedException {
        submitButton.click();
        Thread.sleep(2000);
    }

    public void checkElementVisibility(WebElement element, long timeinMillisecond) {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    public static void iterateWebElementListAndSelectValue(List<WebElement> webElementList, String elementValue) {
        for (int i = 0; i <= webElementList.size() - 1; i++) {
            if (webElementList.get(i).getText().contains(elementValue)) {
                webElementList.get(i).click();
                break;
            }
        }
    }

    public static void clickOnAfterElementIsVisible(WebElement element) {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        element.click();
    }

    public void moveToElementAndCLikOn(WebElement paymentMode) {
        actions.moveToElement(paymentMode).click().perform();
    }

    public static List<String> getDropDownValue(List<WebElement> allOptions) {

        List<String> allOptionText = new ArrayList<String>();
        for (WebElement we : allOptions) {
            String selectvalue = we.getText();
            System.out.println("we: " + selectvalue);
            allOptionText.add(selectvalue);

        }
        System.out.println("allOptionText: " + allOptionText);
        return allOptionText;
    }

    public static int getRandom(int max) {
        return (int) (Math.random() * max);
    }
    public static int getRandombill(int max) {
        return (int) (Math.random() * max);
    }

    public void gotoTab(WebDriver driver, int tabIndex) throws InterruptedException {
        List<String> winHandles = new ArrayList<>(driver.getWindowHandles());
        Thread.sleep(500);
        driver.switchTo().window(winHandles.get(tabIndex));
    }

}