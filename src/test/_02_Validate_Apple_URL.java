package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {
    /*
    TEST CASE
    1. Go to "https://www.apple.com/"
    2. Validate the URL of the page is displayed as "https://www.apple.com/"

    NOTE:
    driver.getCurrentUrl(); // this line returns the URL of the current page as a String
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/salmusleh/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.apple.com/");
        System.out.println("The URL of the page is = " + driver.getCurrentUrl());

        if (driver.getCurrentUrl().equals("https://www.apple.com/")) System.out.println("URL validation Pass");
        else System.out.println("URL validation Fail");

        driver.quit();
    }
}
