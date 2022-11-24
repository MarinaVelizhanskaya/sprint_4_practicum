package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPage {
    private WebDriver driver;
    private By orderButtonTopPage = By.xpath(".//button[text()='Заказать']");
    private By orderButtonDownPage = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");
    private By firstNameField = By.xpath(".//input[@placeholder='* Имя']");
    private By lastNameField = By.xpath(".//input[@placeholder='* Фамилия']");
    private By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private By metroStationField = By.xpath(".//input[@placeholder='* Станция метро']");
    private By telephoneField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By buttonForNextStep = By.xpath(".//button[text()='Далее']");
    private By dateOrderField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private By rentalPeriodField = By.xpath(".//div[text()='* Срок аренды']");
    private By colorBlackField = By.id("black");
    private By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private By buttonForOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By popUpConfirmOrder = By.xpath(".//div[text()='Хотите оформить заказ?']");
    private By buttonPopUpYes = By.xpath(".//button[text()='Да']");
    private By popUpSuccessfulOrder = By.xpath(".//div[text()='Заказ оформлен']");
    private By orderContent = By.xpath(".//div[text()='Для кого самокат']");

    public OrderPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickButtonOrderButtonTopPage() {
        driver.findElement(orderButtonTopPage).click();
    }

    public void clickButtonOrderButtonDownPage() {
        driver.findElement(orderButtonDownPage).click();
    }


    public void waitingOrderContent() {
        WebElement dynamicElement = (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(orderContent));
    }

    public void fillFirstNameField(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void fillLastNameField(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void fillAddressField(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void fillMetroStation() {
        driver.findElement(metroStationField).click();
        WebElement dynamicElement = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("select-search__select")));
        driver.findElement(By.className("select-search__option")).click();

    }

    public void fillTelephoneField(String telephone) {
        driver.findElement(telephoneField).sendKeys(telephone);
    }

    public void clickButtonForNextStep() {
        driver.findElement(buttonForNextStep).click();
    }

    public void fillDateOrderField(String data) {
        driver.findElement(dateOrderField).sendKeys(data);
    }

    public void fillRentalPeriodField() {
        driver.findElement(rentalPeriodField).click();
        driver.findElement(By.className("Dropdown-option")).click();
    }

    public void clickColorBlackField() {
        driver.findElement(colorBlackField).click();
    }

    public void fillCommentField(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }

    public void clickButtonForOrder() {
        driver.findElement(buttonForOrder).click();
    }

    public void waitingPopUpConfirmOrder() {
        WebElement dynamicElement = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(popUpConfirmOrder));
    }

    public void clickButtonPopUpYes() {
        driver.findElement(buttonPopUpYes).click();
    }

    public boolean checkPopUpSuccessfulOrder() {
        boolean isFindPopUp = driver.findElement(popUpSuccessfulOrder).isDisplayed();
        return isFindPopUp;
    }

    public void fillInfoAboutOrder(String firstName, String lastName, String address, String telephone, String data, String comment) {
        fillFirstNameField(firstName);
        fillLastNameField(lastName);
        fillAddressField(address);
        fillMetroStation();
        fillTelephoneField(telephone);
        clickButtonForNextStep();
        fillDateOrderField(data);
        fillRentalPeriodField();
        clickColorBlackField();
        fillCommentField(comment);
        clickButtonForOrder();
        waitingPopUpConfirmOrder();
        clickButtonPopUpYes();
    }
    public void scrollButtonDownPage() {
      WebElement element = driver.findElement(orderButtonDownPage);
     ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

    }

}
