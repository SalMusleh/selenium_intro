package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _07_Text_Attribute_CssValues_of_Web_Elements {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        WebElement googleSearchButton = driver.findElement(By.cssSelector("input[value='Google Search']"));

        System.out.println(googleSearchButton.getText());
        System.out.println(googleSearchButton.getAttribute("class"));
        System.out.println(googleSearchButton.getAttribute("name"));
        System.out.println(googleSearchButton.getAttribute("role"));

        System.out.println(googleSearchButton.getCssValue("color"));
        System.out.println(googleSearchButton.getCssValue("font-family"));
        System.out.println(googleSearchButton.getCssValue("font-size"));
        System.out.println(googleSearchButton.getCssValue("text-align"));

        Driver.quitDriver();
    }
}
