package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SmartBare {
    public static void main (String []args){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Administrator\\Desktop\\Selenium Dependencies\\Drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/ login.aspx");
        driver.manage().window().maximize();
        if(driver.getTitle().equals("Web Orders Login")){
            System.out.println("Title verification is passed");
        }else{
            System.out.println("Error title is not same");
        }
        WebElement userName= driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        userName.click();
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        password.click();
        WebElement logIn= driver.findElement(By.id("ctl00_MainContent_login_button"));
        logIn.click();
        String newTitle=driver.getTitle();
        if(newTitle.equals("Web Orders")){
            System.out.println("New Title verification passed");
        }else{
            System.out.println("New title verification failed");
        }
        if(driver.getCurrentUrl().equals("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/")){
            System.out.println("url is same");
         }else{
            System.out.println("Error not same url");
        }
        driver.findElement(By.linkText("Order")).click();
        WebElement product= driver.findElement(By.id(""));
        Select products= new Select(driver.findElement(By.id("")));
    }
}
/**
 */
