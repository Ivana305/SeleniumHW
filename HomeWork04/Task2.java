package HomeWork04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        /*goto https://chercher.tech/practice/frames   click on check box
then select baby cat from drop down,  then enter text in text box */

        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);

        driver.switchTo().frame("frame2");
        WebElement animals=driver.findElement(By.xpath("//select[@id='animals']"));
        Select select =new Select(animals);
        select.selectByVisibleText("Baby Cat");
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement textBox= driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Cat");

    }
}
