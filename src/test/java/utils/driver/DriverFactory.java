package utils.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

class DriverFactory {

    // Get a new WebDriver Instance.
    // There are various implementations for this depending on browser. The required browser can be set as an environment variable.
    // Refer http://getgauge.io/documentation/user/current/managing_environments/README.html
    static WebDriver getDriver() {
        //WebDriverManager.edgedriver().setup();
        WebDriverManager.chromedriver().setup();
        //return new EdgeDriver();
        return new ChromeDriver();
    }
}
