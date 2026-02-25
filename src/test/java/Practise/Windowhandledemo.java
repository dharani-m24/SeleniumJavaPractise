package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Windowhandledemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/browser-windows");

        //store parent window

        String parentTab=driver.getWindowHandle();

        System.out.println("Parent window==="+parentTab);

        //click button to open child window
        driver.findElement(By.id("tabButton")).click();

        Thread.sleep(5000);
        //Get all tab id
       Set<String> allTabs=driver.getWindowHandles();

       // iterate and move to child window
       for(String tab:allTabs){

           if(!tab.equals(parentTab)){
               driver.switchTo().window(tab);

               System.out.println("siwtched to child window");

              String childtabText= driver.findElement(By.id("sampleHeading")).getText();

              if(childtabText.equalsIgnoreCase("This is a sample page")){
                  System.out.println("child tab verified sucessfully ");
              }else{
                  System.out.println("child tab not verified sucessfully ");
              }
           }
       }

       //switch back to parent tab

        driver.switchTo().window(parentTab);

        System.out.println("Switched to parent tab");

        if(driver.getTitle().equalsIgnoreCase("parentTab")){
            System.out.println("parent tab verified successfully");
        }else{
            System.out.println("parent tab verified successfully");
        }


    }
}
