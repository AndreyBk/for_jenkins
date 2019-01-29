package ru.mail.propre;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Selenium {
    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\BK\\JavaProjects\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get ("https://www.google.com");
        String _title=driver.getTitle();
//
//        driver.get ("https://www.mail.ru");
//
        driver.findElement(By.name("q")).sendKeys("Evgeny"+ Keys.ENTER);
  //      driver.findElement(By.name("q"));
        System.out.println("****");

        //        Assert.assertEquals("Google", _title);


        String _text=driver.findElement(By.className("LC20lb")).getText();
//
        System.out.println("Page 1 is: "+ _text);

        if (_text.equals("Евгений — Википедия")) System.out.println("Excellent! Test is passed");
        else System.out.println("Warning! Test failed! ");


///        Assert.assertEquals("Евгений — Википедия2", _text);
//
////        (new WebDriverWait(driver, 3)).until(new ExpectedCondition<Boolean>() {
////            public Boolean apply(WebDriver d) {
////               return d.getTitle().toLowerCase().startsWith("selenium");
////          }
////     });


////        driver.quit();

    }
}
