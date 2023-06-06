package HomeWork5;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Task2 extends CommonMethods {/*   goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
click on get new user,   print the firstname of user*/

    public static void main(String[] args) {

        String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement btnNewUser= driver.findElement(By.xpath("//button[@id='save']"));
        btnNewUser.click();
        WebElement firstName= driver.findElement(By.cssSelector("div[id='First-Name'] p"));
        String text=firstName.getText();
        System.out.println(text);



        driver.close();




    }}
