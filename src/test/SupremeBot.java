package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class SupremeBot {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.supremenewyork.com/shop/all/accessories");

        WebElement magnets = driver.findElement(By.partialLinkText("Magnets"));
        magnets.click();

        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"add-remove-buttons\"]/input"));
        addToCart.click();

        WebElement checkout = driver.findElement(By.xpath("//*[@id=\"cart\"]/a[2]"));
        checkout.click();

    }
}
