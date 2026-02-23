package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CalendarExample {

    void selectFuturedate(WebDriver driver,String year,String month,String date){

        while(true){
            //select year
            String currentYear=driver.findElement(By.className("ui-datepicker-year")).getText();
            //select Month
            String currentMonth=driver.findElement(By.className("ui-datepicker-month")).getText();

            if(currentYear.equalsIgnoreCase(year) && currentMonth.equalsIgnoreCase(month)){

                //target day

                driver.findElement(By.xpath("//a[text()='" + date + "']")).click();
                break;
            }

            //select next

            driver.findElement(By.xpath("//*[text()='Next']")).click();
        }
    }

    void selectPastdate(WebDriver driver,String year,String month,String date){

        while(true){
            //select year
            String currentYear=driver.findElement(By.className("ui-datepicker-year")).getText();
            //select Month
            String currentMonth=driver.findElement(By.className("ui-datepicker-month")).getText();

            if(currentYear.equalsIgnoreCase(year) && currentMonth.equalsIgnoreCase(month)){

                //target day

                driver.findElement(By.xpath("//a[text()='" + date + "']")).click();
                break;
            }

            //select prev

            driver.findElement(By.xpath("//*[text()='Prev']")).click();
        }
    }

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

        driver.findElement(By.id("first_date_picker")).click();

        String targetYear="2023";
        String targetMonth="March";
        String targetDate="3";

        CalendarExample cl=new CalendarExample();
       //cl.selectFuturedate(driver,targetYear,targetMonth,targetDate);

        cl.selectPastdate(driver,targetYear,targetMonth,targetDate);






    }
}
