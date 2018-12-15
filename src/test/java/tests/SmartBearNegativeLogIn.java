package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartBearNegativeLogIn {
    public static void main(String []args){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Administrator\\Desktop\\Selenium Dependencies\\Drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/ login.aspx");

        WebElement userName= driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");

        WebElement password= driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys(" ");

        WebElement logIn= driver.findElement(By.id("ctl00_MainContent_login_button"));
        logIn.click();

        WebElement errorMessage= driver.findElement(By.id("ctl00_MainContent_status"));
        if(errorMessage.getText().equals("Invalid Login or Password")){
            System.out.println("Error message verification PASSED");
        }else{
            System.out.println("Error message verification FAILLED");
        }
    }
 public static void negativealogInTester(WebDriver driver, String usernameValue, String passwordValue){
     WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
     WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
     WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
     username.clear();
     username.sendKeys(usernameValue);
     password.clear();
     password.sendKeys(passwordValue);
     loginBtn.click();

     WebElement errorMessage = driver.findElement(By.id("ctl00_MainContent_status"));
     if(errorMessage.getText().equals("Invalid Login or Password.")){
         System.out.println("Error message verification PASSED");
     }
     else{
         System.out.println("Error message verification FAILED");
     }
 }
}
