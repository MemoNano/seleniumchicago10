package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
    public static void main (String [] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("http://insagram.com//accounts/login/?source=auth_switcher");
        driver.manage().window().maximize();
        WebElement username= driver.findElement(By.name("username"));
        WebElement password= driver.findElement(By.name("password"));

        username.sendKeys("7736916103");
        password.sendKeys("778829500pap"+ Keys.ENTER);
        Thread.sleep(1000);

        WebElement notNow= driver.findElement(By.xpath("//button[@class='a00lW  Holwm']"));
        notNow.click();;
        WebElement profile = driver.findElement(By.linkText("Profile"));
        profile.click();
        Thread.sleep(1000);

        WebElement followers= driver.findElement(By.xpath("//a[@href='/explore/people']"));
        followers.click();
        Thread.sleep(1000);
        for(int j=0; j<100;j++) {
            for (int i = 0; i < 65; i++) {
                WebElement follow = driver.findElement(By.xpath("//button[@class=' 0mzm- sqdop  L3NKy    ']"));
                follow.click();
            }
            Thread.sleep(3000);
        }

    }
}
