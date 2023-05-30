package HomeWork03;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        /*goto: http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
        select, tuesday, thursday and friday one by one */

        openBrowserAndLaunchApplication("  http://practice.syntaxtechs.net/basic-select-dropdown-demo.php", "chrome");
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='select-demo']"));

        Select obj=new Select(dropDown);
        obj.selectByValue("Tuesday");
        Thread.sleep(2000);
        obj.selectByValue("Thursday");
        Thread.sleep(2000);
        obj.selectByValue("Friday");
        Thread.sleep(2000);
        closeBrowser();
    }
}
