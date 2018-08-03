import org.apache.xpath.SourceTree;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by mdrahman on 8/2/18.
 * Spring 2018
 */
public class One {

    @Test
    public void runTest(){

        System.setProperty("webdriver.chrome.driver", "/Users/mdrahman/Downloads/Selenium/Chrome/chromedriver");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");

        System.out.println("Facebook is opened !");


    }
}
