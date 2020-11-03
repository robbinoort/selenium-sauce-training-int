/*
 * This is a format for the assignments for the Selenium workshop of Qquest 2020.
 * Last edits made on 03-11-2020.
 * Writer: Robbin Oort
 * Version: 2.0
 */
package seleniumsaucesetup;

// 1. Imports for Selenium driver and Firefox driver

// Defines the class
public class Opdracht1a {

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
