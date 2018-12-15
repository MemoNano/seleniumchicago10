package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Amazon {
    /**
     * @param args
     * @throws InterruptedException Branch name RS2535
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://Amazon.com");
        driver.manage().window().maximize();
        WebElement drDown = driver.findElement(By.id("searchDropdownBox"));
        drDown.click();
        Select dropDown = new Select(driver.findElement(By.id("searchDropdownBox")));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        String allDep = driver.findElement(By.linkText("All Departments")).getText();
        if (allDep.contains("All Departments")) {
            System.out.println("Default value verification PASSED");
        } else {
            System.out.println("Default value is FAILED");
        }

    }
}
