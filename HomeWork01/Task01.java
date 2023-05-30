package HomeWork01;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 extends CommonMethods {
    //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    //fill out the form
    //close the browser
    //Note: use name or id as locators
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().

                window().

                maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).

                sendKeys("Ana");
        driver.findElement(By.id("customer.lastName")).

                sendKeys("Smith");
        driver.findElement(By.id("customer.address.street")).

                sendKeys("Main street");
        driver.findElement(By.id("customer.address.city")).

                sendKeys("Miami");
        driver.findElement(By.id("customer.address.state")).

                sendKeys("Florida");
        driver.findElement(By.id("customer.address.zipCode")).

                sendKeys("33139");
        driver.findElement(By.id("customer.phoneNumber")).

                sendKeys("123-456-789");
        driver.findElement(By.id("customer.ssn")).

                sendKeys("987-654-3210");
        driver.findElement(By.id("customer.username")).

                sendKeys("user11111");
        driver.findElement(By.id("customer.password")).

                sendKeys("paSS11111");
        driver.findElement(By.id("repeatedPassword")).

                sendKeys("paSS11111");
        Thread.sleep(3000);

        driver.close();


    }

}
