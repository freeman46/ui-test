import com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Configuration.*;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.*;

public class ExempleTest {

    @Test
    public void RunTest () {

        System.setProperty("webdriver.chrome.driver", "C://chromedriver/chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        Configuration.timeout = 6000;

        open("https://yandex.ru/");

        $(By.xpath("//div[text() = 'Маркет']")).click();
        sleep(3000);
        $(By.xpath("//span[text() = 'Каталог'")).click();




    }

}
