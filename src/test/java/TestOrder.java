import Pages.OrderPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(Parameterized.class)
public class TestOrder {
    private WebDriver driver;
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String telephone;
    private final String data;
    private final String comment;

    public TestOrder(String firstName, String lastName, String address, String telephone, String data, String comment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.telephone = telephone;
        this.data = data;
        this.comment = comment;
    }
    @Parameterized.Parameters
    public static Object[][] getField() {
        return new Object[][] {
                {"Иван", "Иванов", "Москва", "89139856396", "24.01.2023" +"\n", "Тестовый комментарий"},
                {"Мария", "Петрова", "Московская облать", "89231748888", "25.12.2022" +"\n", "Заказ нужен срочно"},
        };
    }

    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver","/home/zaymer/WebDriver/bin/chromedriver");
    };

    @Test
    public void orderTopPage() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.clickButtonOrderButtonTopPage();
        objOrderPage.waitingOrderContent();
        objOrderPage.fillInfoAboutOrder(firstName, lastName, address, telephone, data, comment);
        Assert.assertTrue(objOrderPage.checkPopUpSuccessfulOrder());
    }

    @After
    public void teardown() {
        driver.quit();
    }

    @Test
    public void orderDownPage() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        OrderPage objOrderPageDown = new OrderPage(driver);
        objOrderPageDown.scrollButtonDownPage();
        objOrderPageDown.clickButtonOrderButtonDownPage();
        objOrderPageDown.waitingOrderContent();
        objOrderPageDown.fillInfoAboutOrder(firstName, lastName, address, telephone, data, comment);
        Assert.assertTrue(objOrderPageDown.checkPopUpSuccessfulOrder());
    }

    @After
    public void teardownPage() {
       driver.quit();
    }

}
