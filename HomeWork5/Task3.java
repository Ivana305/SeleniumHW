package HomeWork5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task3 {      /*   develop a function in common methods to select from dropdown(single select)*/

    public static void dropdownSelector(WebDriver driver, By dropdownLocator, String optionText) {
        Select dropdown = new Select(driver.findElement(dropdownLocator));
        dropdown.selectByVisibleText(optionText);


        
    }
}
