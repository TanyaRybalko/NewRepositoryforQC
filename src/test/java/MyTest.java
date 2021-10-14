import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTest {

    @Test
    public void testFirst() throws InterruptedException {
        String driverPath = "C:/TanyaR/ChromeDriver/chromedriver.exe";
        String chromeDriver = "webdriver.chrome.driver";
        String CheckLine = "Check line";


        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();   // open browser


        // added notes
        driver.close();
        driver.quit();
    }



}
