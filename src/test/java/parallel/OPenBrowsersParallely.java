package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OPenBrowsersParallely {

    @Test
    public void openGoogle(){
        System.out.println("Open Google in Browser");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Test
    public void openBrave(){
        System.out.println("Open Brave in Browser");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.brave.com");
    }
}
