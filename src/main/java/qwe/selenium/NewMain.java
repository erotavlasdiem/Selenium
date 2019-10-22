/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qwe.selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Admin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Users\\Admin\\Videos\\DEVOPS\\Simplilearn\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

 /*
        
driver.navigate().to("http://softwaretestingbooks.com/");
 
String appTitle = driver.getTitle();
 
System.out.println("Application title is : "+appTitle);

 
driver.quit();
*/
        
        driver.manage().deleteAllCookies();
        driver.manage().window().fullscreen();
        driver.get("https://www.amazon.de/gp/bestsellers/?ref_=nav_cs_bestsellers");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma shoes");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.quit();

    }

}
