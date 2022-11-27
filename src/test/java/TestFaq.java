import Pages.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

public class TestFaq {
    private WebDriver driver;
    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver","/home/zaymer/WebDriver/bin/chromedriver");
    };

    @Test
    public void checkFaqOne() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objLoginPageOne = new MainPage(driver);
        objLoginPageOne.scrollItemFaqOne();
        objLoginPageOne.clickButtonItemFaqOne();
        objLoginPageOne.waitingAnswerQuestionOne();
        String actual = objLoginPageOne.GetTextItemFaqOne();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        assertEquals(expected, actual);

    }
   
   @Test
    public void checkFaqTwo() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objLoginPageTwo = new MainPage(driver);
        objLoginPageTwo.scrollItemFaqTwo();
        objLoginPageTwo.clickButtonItemFaqTwo();
        objLoginPageTwo.waitingAnswerQuestionTwo();
        String actual = objLoginPageTwo.GetTextItemFaqTwo();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        assertEquals(expected, actual);

    }
    

    @Test
    public void checkFaqThree() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objLoginPageThree = new MainPage(driver);
        objLoginPageThree.scrollItemFaqThree();
        objLoginPageThree.clickButtonItemFaqThree();
        objLoginPageThree.waitingAnswerQuestionThree();
        String actual = objLoginPageThree.GetTextItemFaqThree();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        assertEquals(expected, actual);

    }
   

    @Test
    public void checkFaqFour() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objLoginPageFour = new MainPage(driver);
        objLoginPageFour.scrollItemFaqFour();
        objLoginPageFour.clickButtonItemFaqFour();
        objLoginPageFour.waitingAnswerQuestionFour();
        String actual = objLoginPageFour.GetTextItemFaqFour();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        assertEquals(expected, actual);

    }
    

    @Test
    public void checkFaqFive() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objLoginPageFive = new MainPage(driver);
        objLoginPageFive.scrollItemFaqFive();
        objLoginPageFive.clickButtonItemFaqFive();
        objLoginPageFive.waitingAnswerQuestionFive();
        String actual = objLoginPageFive.GetTextItemFaqFive();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        assertEquals(expected, actual);

    }
    

    @Test
    public void checkFaqSix() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objLoginPageSix = new MainPage(driver);
        objLoginPageSix.scrollItemFaqSix();
        objLoginPageSix.clickButtonItemFaqSix();
        objLoginPageSix.waitingAnswerQuestionSix();
        String actual = objLoginPageSix.GetTextItemFaqSix();
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        assertEquals(expected, actual);

    }
    

    @Test
    public void checkFaqSeven() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objLoginPageSeven = new MainPage(driver);
        objLoginPageSeven.scrollItemFaqSeven();
        objLoginPageSeven.clickButtonItemFaqSeven();
        objLoginPageSeven.waitingAnswerQuestionSeven();
        String actual = objLoginPageSeven.GetTextItemFaqSeven();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        assertEquals(expected, actual);

    }
    

    @Test
    public void checkFaqEight() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objLoginPageEight = new MainPage(driver);
        objLoginPageEight.scrollItemFaqEight();
        objLoginPageEight.clickButtonItemFaqEight();
        objLoginPageEight.waitingAnswerQuestionEight();
        String actual = objLoginPageEight.GetTextItemFaqEight();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        assertEquals(expected, actual);

    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
