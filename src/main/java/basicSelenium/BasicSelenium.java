package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasicSelenium {
    ChromeDriver driver;

    @BeforeEach
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();

        // implicit wait --> generico
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @AfterEach
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
/*
* los localizadores deben ser únicos
* id --> la mejor opcion
* xpath ---> sugerido id dinamico
* *
*
 */
    @Test
    public void testSomeThing() {

        // pasos
    }
}