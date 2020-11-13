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
public class Assignment1a {

    // Main method
    public static void main(String[] args) {

// 2. Initiates variable WebDriver and makes a new instance for the Driver
        WebDriver driver = new FirefoxDriver();
        //or
        // Webdriver driver = null;
        // driver = new FirefoxDriver();


        // 3. Open the browser with URL: https://www.saucedemo.com/
        driver.get("https://google.com/");
        System.out.println("Browser is open, what's next?");

        // 4. Fill in username ‘standard_user’ and password ‘secret_sauce’


        // 5. Press login


        // 6. close the browser
        //driver.close();


    
    }
    
}
