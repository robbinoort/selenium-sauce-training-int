//Template file for methods
package seleniumsauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Defines the class
public class loginStandard {
    
    // Defines the method that runs the test
    public static void StandardUser(WebDriver driver) {
        
        // String with variables defining username and password
        String username = "DEFAULT";
        String password = "DEFAULT";
        
        // 6. Zoekt en vult de username en wachtwoord in
        driver.findElement(By.?("UnField")).sendKeys(username);
        driver.findElement(By.?("PwField")).sendKeys(password);
        
        // 7. Drukt op de login button
        driver.findElement(By.?("findthebutton")).click();

        System.out.println("  ");
        System.out.println("Logged in as ___ user");
        System.out.println("_______________________________");

    }
    
}

// * Can you use this to your advantage?