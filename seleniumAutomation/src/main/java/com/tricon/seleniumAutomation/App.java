package com.tricon.seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.WebElement;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        
        System.setProperty("webdriver.chrome.driver",
        		"C:\\Users\\mihir\\Desktop\\Tricon\\mWork\\Selenium\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        String baseUrl = "http://a.testaddressbook.com/";
        
        driver.manage().window().maximize();
        driver.get(baseUrl);
        
        driver.findElement(By.id("sign-in")).click();
        
        WebDriverWait wait1 = new WebDriverWait(driver, 100);
        //WebElement element1 = 
        wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("session_email")));
        
        driver.findElement(By.xpath("//a[@data-test='sign-up']")).click();
        
        WebDriverWait wait2 = new WebDriverWait(driver, 100);
        wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("user_email")));
        
        driver.findElement(By.name("user[email]")).sendKeys("mihir6@company.com");
        driver.findElement(By.id("user_password")).sendKeys("mihir");
        driver.findElement(By.xpath("//input[@value='Sign up']")).click();
        
        WebDriverWait wait3 = new WebDriverWait(driver, 100);
        wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Addresses')]")));
       
//        driver.findElement(By.name("session[email]")).sendKeys("mihir@comp.com");
//        driver.findElement(By.id("session_password")).sendKeys("mihir");
//        driver.findElement(By.xpath("//input[@value='Sign in']")).click();
        
        driver.findElement(By.xpath("//a[contains(text(),'Addresses')]")).click();
        
        WebDriverWait wait4 = new WebDriverWait(driver, 100);
        wait4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='row justify-content-center']")));
        
        driver.findElement(By.xpath("//a[@class='row justify-content-center']")).click();
        
        WebDriverWait wait5 = new WebDriverWait(driver, 100);
        wait5.until(ExpectedConditions.presenceOfElementLocated(By.id("address_first_name")));
        
        driver.findElement(By.id("address_first_name")).sendKeys("Mihir");
        driver.findElement(By.id("address_last_name")).sendKeys("Shah");
        driver.findElement(By.id("address_street_address")).sendKeys("M.G.Road");
        driver.findElement(By.id("address_secondary_address")).sendKeys("Kandivali");
        driver.findElement(By.id("address_city")).sendKeys("Mumbai");
        driver.findElement(By.id("address_state")).click();
        driver.findElement(By.xpath("//option[text()='Iowa']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("address_zip_code")).sendKeys("400001");
        driver.findElement(By.xpath("//input[@value='Create Address']")).click();
        
        WebDriverWait wait6 = new WebDriverWait(driver, 100);
        wait6.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-test='list']")));
        
        driver.findElement(By.xpath("//a[@data-test='list']")).click();
              
        //driver.close();
          
    }
}
