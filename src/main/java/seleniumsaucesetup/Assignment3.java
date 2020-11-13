/*
 * Dit is een format voor de voorbeeldopgaven van Selenium Sauce
 * Laatste aanpassingen zijn gedaan op 30-09-2020.
 * Auteur: Robbin Oort
 * Versie: 2.0
 */
package seleniumsaucesetup;

// 1. Imports the Selenium Webdriver & Firefox driver

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Defines the class
public class Assignment3 {

    // Main method
    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.saucedemo.com/");

        // *Define methods in new files - these can clean up your project a lot
        seleniumsauce.loginStandard.StandardUser(driver);
        //seleniumsauce.addItemToChart.AddBackpack(driver);

        driver.close();

    }
    
}
