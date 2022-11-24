package Pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage {
    private WebDriver driver;
    private By buttonItemFaqOne = By.id("accordion__heading-0");
    private By buttonItemFaqTwo = By.id("accordion__heading-1");
    private By buttonItemFaqThree = By.id("accordion__heading-2");
    private By buttonItemFaqFour = By.id("accordion__heading-3");
    private By buttonItemFaqFive = By.id("accordion__heading-4");
    private By buttonItemFaqSix = By.id("accordion__heading-5");
    private By buttonItemFaqSeven = By.id("accordion__heading-6");
    private By buttonItemFaqEight = By.id("accordion__heading-7");

    private By answerQuestionOne = By.id("accordion__panel-0");
    private By answerQuestionTwo = By.id("accordion__panel-1");
    private By answerQuestionThree = By.id("accordion__panel-2");
    private By answerQuestionFour = By.id("accordion__panel-3");
    private By answerQuestionFive = By.id("accordion__panel-4");
    private By answerQuestionSix = By.id("accordion__panel-5");
    private By answerQuestionSeven = By.id("accordion__panel-6");
    private By answerQuestionEight = By.id("accordion__panel-7");


    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickButtonItemFaqOne() {
        driver.findElement(buttonItemFaqOne).click();
    }
    public void clickButtonItemFaqTwo() {
        driver.findElement(buttonItemFaqTwo).click();
    }
    public void clickButtonItemFaqThree() {
        driver.findElement(buttonItemFaqThree).click();
    }
    public void clickButtonItemFaqFour() {
        driver.findElement(buttonItemFaqFour).click();
    }
    public void clickButtonItemFaqFive() {
        driver.findElement(buttonItemFaqFive).click();
    }
    public void clickButtonItemFaqSix() {
        driver.findElement(buttonItemFaqSix).click();
    }
    public void clickButtonItemFaqSeven() {
        driver.findElement(buttonItemFaqSeven).click();
    }
    public void clickButtonItemFaqEight() {
        driver.findElement(buttonItemFaqEight).click();
    }

    public String GetTextItemFaqOne () {
        return driver.findElement(answerQuestionOne).getText();
    }
    public String GetTextItemFaqTwo () {
        return driver.findElement(answerQuestionTwo).getText();
    }
    public String GetTextItemFaqThree () {
        return driver.findElement(answerQuestionThree).getText();
    }
    public String GetTextItemFaqFour () {
        return driver.findElement(answerQuestionFour).getText();
    }
    public String GetTextItemFaqFive () {
        return driver.findElement(answerQuestionFive).getText();
    }
    public String GetTextItemFaqSix () {
        return driver.findElement(answerQuestionSix).getText();
    }
    public String GetTextItemFaqSeven () {
        return driver.findElement(answerQuestionSeven).getText();
    }
    public String GetTextItemFaqEight () {
        return driver.findElement(answerQuestionEight).getText();
    }

    public void scrollItemFaqOne() {
        WebElement element = driver.findElement(buttonItemFaqOne);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void scrollItemFaqTwo() {
        WebElement element = driver.findElement(buttonItemFaqTwo);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void scrollItemFaqThree() {
        WebElement element = driver.findElement(buttonItemFaqThree);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void scrollItemFaqFour() {
        WebElement element = driver.findElement(buttonItemFaqFour);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void scrollItemFaqFive() {
        WebElement element = driver.findElement(buttonItemFaqFive);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void scrollItemFaqSix() {
        WebElement element = driver.findElement(buttonItemFaqSix);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void scrollItemFaqSeven() {
        WebElement element = driver.findElement(buttonItemFaqSeven);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void scrollItemFaqEight() {
        WebElement element = driver.findElement(buttonItemFaqEight);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitingAnswerQuestionOne() {
        WebElement dynamicElement = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(answerQuestionOne));
    }

    public void waitingAnswerQuestionTwo() {
        WebElement dynamicElement = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(answerQuestionTwo));
    }

    public void waitingAnswerQuestionThree() {
        WebElement dynamicElement = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(answerQuestionThree));
    }

    public void waitingAnswerQuestionFour() {
        WebElement dynamicElement = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(answerQuestionFour));
    }

    public void waitingAnswerQuestionFive() {
        WebElement dynamicElement = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(answerQuestionFive));
    }

    public void waitingAnswerQuestionSix() {
        WebElement dynamicElement = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(answerQuestionSix));
    }

    public void waitingAnswerQuestionSeven() {
        WebElement dynamicElement = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(answerQuestionSeven));
    }

    public void waitingAnswerQuestionEight() {
        WebElement dynamicElement = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(answerQuestionEight));
    }

}
