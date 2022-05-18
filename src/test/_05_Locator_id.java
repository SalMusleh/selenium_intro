package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _05_Locator_id {
    /*
    Go to https://www.techglobalschool.com

    Validate the company signature
        Logo must be displayed in the header section
        Company name must be displayed in the header section
        Company quote must be displayed in the header section
     */

    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        WebElement logo = driver.findElement(By.id("img_comp-kuiqjide2"));

        if(logo.isDisplayed()) System.out.println("The logo validation PASSED");
        else System.out.println("Logo validation FAILED!!!");

        WebElement name = driver.findElement(By.id("comp-kuiqjidf"));

        if(name.isDisplayed()) System.out.println("The name validation PASSED");
        else System.out.println("Name validation FAILED!!!");

        WebElement quote = driver.findElement(By.id("comp-kuiqjidf1"));

        if(quote.isDisplayed()) System.out.println("The quote validation PASSED");
        else System.out.println("Quote validation FAILED!!!");

        Driver.quitDriver();
    }
}
