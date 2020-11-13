/*
 * Dit is een format voor de voorbeeldopgaven van Selenium Sauce
 * Laatste aanpassingen zijn gedaan op 30-09-2020.
 * Auteur: Robbin Oort
 * Versie: 2.0
 */
package seleniumsaucesetup;

// 1. Imports the Selenium Webdriver & Firefox driver
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Defines the class
public class Assignment1b {

    // Main method
    public static void main(String[] args) {

        // 2. Initiates the driver
            WebDriver driver = new FirefoxDriver();
        
        // 9. Opens the browser with URL: https://www.saucedemo.com/ and logs in as standard user
            driver.get("https://www.google.com");

        //10. Verify if the title “Swag Labs” is displayed correctly
            //* tip: are you displaying the title or testing the title?
        if (driver.getTitle().equals("Qquest")){
           System.out.println("Yes");
        } else {
            System.out.println("No " + driver.getTitle() );
        }

        //11. Navigate to ‘Sauce Labs Backpack’
        

        //12. Verify if the price is correct
        //if (driver.findElement("Element definition"))
        //        .pickTheRightCommand().contains("value")){
        //
        //} else {
        //
        //}

        //13. Add the item to your cart
        

        //14. Verify if the item is added to cart
        

        //15. close the browser

    
    }
    
}
