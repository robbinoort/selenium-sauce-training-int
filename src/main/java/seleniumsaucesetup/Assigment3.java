//Assigment 3 is to show another workflow
// *tip: methods can make overviews easier

package seleniumsauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSauce {
    
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.saucedemo.com/");
        
    // *Define methods in new files - these can clean up your project a lot
        loginStandard.StandardUser(driver);
        addItemToChart.AddBackpack(driver);

        driver.close();