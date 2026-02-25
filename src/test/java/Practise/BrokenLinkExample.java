package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinkExample {

    public static void main(String[] args)  {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");

        //capture all the link from webpage
        List<WebElement> link=driver.findElements(By.tagName("a"));
        System.out.println("Total number of links="+link.size());

        int count=0;

        for(WebElement linkElement:link){

            String hrefvalue=linkElement.getAttribute("href");
            if(hrefvalue==null || hrefvalue.isEmpty()){
                System.out.println("Href is empty so we unable to check the link is valid or not");
                continue;
            }

            //hit the url to sever
try {
    URL url = new URL(hrefvalue); // convert href value from string to url
    HttpURLConnection connection = (HttpURLConnection) url.openConnection(); //open connection to the server
    connection.connect(); //connect to the server and send the request

    if (connection.getResponseCode() >= 400) {
        System.out.println(hrefvalue + "=======broken link");
        count++;
    } else {
        System.out.println(hrefvalue + "=====Its not broken link");
    }
}catch (Exception e){

}
        }

        System.out.println("total number of broken links:"+count);
    }
}
