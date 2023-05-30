package HomeWork02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    //(only use XPATH), navigate to fb.com,click on create new account,fill up all the textboxes,close the popup
    //close the browser,    Note : in order for ur code to work
    //u have to put Thread.sleep(2000) after clicking on Create new account
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Ivana");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Milanovic");
        driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("exemple@gmail.com");
        driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")).sendKeys("exemple@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("Passexemple1");
        driver.findElement(By.xpath("//select[@name=\"birthday_month\"]")).sendKeys("May");
        driver.findElement(By.xpath("//select[@name=\"birthday_day\"]")).sendKeys("1");
        driver.findElement(By.xpath("//select[@name=\"birthday_year\"]")).sendKeys("1991");
        driver.findElement(By.xpath("//input[@value='1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@src=\"https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png\"]")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}