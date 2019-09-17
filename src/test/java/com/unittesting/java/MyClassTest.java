package com.unittesting.java;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class MyClassTest {
    private String driver_url ="C:\\Users\\domin\\Desktop\\chromedriver.exe";
    @Test
    public void storeSuccessful(){
        System.setProperty("webdriver.chrome.driver", driver_url);
        WebDriver driver = new ChromeDriver();
        driver.get("http://algirdaskuslys.000webhostapp.com/selenium/filmai.php");
        driver.findElement(By.name("pavadinimas")).sendKeys("Sekmingas pavadinimas");
        driver.findElement(By.name("zanras")).sendKeys("Sekmingas zanras");
        driver.findElement(By.name("rezisierius")).sendKeys("Sekmingas rezisierius");
        driver.findElement(By.name("insert")).click();
        boolean isPresent = driver.findElements(By.className("msg-good")).size() > 0;
        assertTrue(isPresent);
        driver.close();
    }
    @Test
    public void storeFailure(){
        System.setProperty("webdriver.chrome.driver", driver_url);
        WebDriver driver = new ChromeDriver();
        driver.get("http://algirdaskuslys.000webhostapp.com/selenium/filmai.php");
        driver.findElement(By.name("pavadinimas")).sendKeys("f");
        driver.findElement(By.name("zanras")).sendKeys("f");
        driver.findElement(By.name("rezisierius")).sendKeys("f");
        driver.findElement(By.name("insert")).click();
        boolean isPresent = driver.findElements(By.className("msg-good")).size() > 0;
        assertFalse(isPresent);
        driver.close();
    }
    @Test
    public void delete(){
        System.setProperty("webdriver.chrome.driver", driver_url);
        WebDriver driver = new ChromeDriver();
        driver.get("http://algirdaskuslys.000webhostapp.com/selenium/filmai.php");
        driver.findElement(By.name("id")).sendKeys("1");
        driver.findElement(By.name("delete")).click();
        boolean isPresent = driver.findElements(By.className("msg-good")).size() > 0;
        assertTrue(isPresent);
        driver.close();
    }
    @Test
    public void updateSuccessful(){
        System.setProperty("webdriver.chrome.driver",driver_url);
        WebDriver driver = new ChromeDriver();
        driver.get("http://algirdaskuslys.000webhostapp.com/selenium/filmai.php");
        driver.findElement(By.name("id")).sendKeys("1");
        driver.findElement(By.name("pavadinimas")).sendKeys("Updatintas pavadinimas");
        driver.findElement(By.name("zanras")).sendKeys("Updatintas zanras");
        driver.findElement(By.name("rezisierius")).sendKeys("Updatintas rezisierius");
        driver.findElement(By.name("update")).click();
        boolean isPresent = driver.findElements(By.className("msg-good")).size() > 0;
        assertTrue(isPresent);
        driver.close();
    }
    @Test
    public void updateFailure(){
        System.setProperty("webdriver.chrome.driver", driver_url);
        WebDriver driver = new ChromeDriver();
        driver.get("http://algirdaskuslys.000webhostapp.com/selenium/filmai.php");
        driver.findElement(By.name("id")).sendKeys("1");
        driver.findElement(By.name("pavadinimas")).sendKeys("f");
        driver.findElement(By.name("zanras")).sendKeys("f");
        driver.findElement(By.name("rezisierius")).sendKeys("f");
        driver.findElement(By.name("update")).click();
        boolean isPresent = driver.findElements(By.className("msg-good")).size() > 0;
        assertFalse(isPresent);
        driver.close();
    }
}