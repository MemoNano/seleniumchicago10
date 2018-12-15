package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SmartBearPlacedOrder {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/ login.aspx");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
        username.sendKeys("Tester");
        password.sendKeys("test");
        loginBtn.click();

        verifyOrder(driver,"Bob Feather");
    }
    public static void verifyOrder(WebDriver driver, String orderName){
        List<WebElement>names = driver.findElements(By.xpath("//table[@id='ctl00_mainContent_orderGrid']/tbody/tr/td[2]"));
for(WebElement name: names){
    System.out.println(name.getText());
    if(name.getText().equals(orderName)){
        System.out.println("Order name verification passed");
        break;
    }
}
        System.out.println("Order verifiation failed");

    }
}
