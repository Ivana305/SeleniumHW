package HomeWork03;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    /*goto facebook.com  click on create account  and select the your  date of birth using select class*/
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("https://www.facebook.com/", "chrome");
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(3000);
        WebElement day=driver.findElement(By.xpath("//select[@id='month']"));
        Select selectDay=new Select(day);
        selectDay.selectByIndex(3);

        WebElement month= driver.findElement(By.xpath("//select[@id='day']"));
        Select selectMonth=new Select(month);
        selectMonth.selectByValue("25");

        WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
        Select selectYear=new Select(year);
        selectYear.selectByValue("1990");

    }
}
