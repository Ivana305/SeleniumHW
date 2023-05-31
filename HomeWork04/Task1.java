package HomeWork04;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
       /*http://practice.syntaxtechs.net/javascript-alert-box-demo.php
click on the last alert
send keys and accept it  */
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement alert3= driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        alert3.click();

        Alert confirmAlert=driver.switchTo().alert();
        confirmAlert.sendKeys("Syntax");
        Thread.sleep(3000);
        confirmAlert.accept();
        




    }
}
