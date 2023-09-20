import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.function.DoubleToIntFunction;

public class Weather {
    public static void main(String[] args) throws InterruptedException, Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://www.google.com");

            WebElement searchField = driver.findElement(By.xpath("//*[@jsname='yZiJbe']"));
            searchField.sendKeys("temperature near me");
            searchField.sendKeys(Keys.ENTER);

            WebElement translate = driver.findElement(By.xpath("//*[text()='Change to English']"));
            translate.click();

            WebElement currentTemp = driver.findElement(By.xpath("//*[@id='wob_tm']"));
            WebElement tempUnit = driver.findElement(By.xpath("//*[@aria-label='°Celsius']"));
            WebElement localTime = driver.findElement(By.xpath("//*[@id='wob_dts']"));
            WebElement location = driver.findElement(By.xpath("//*[@class='BBwThe']"));


            System.out.println(tempUnit);
            System.out.println("Location:" + location.getText());
            System.out.println("Current Time: " + localTime.getText());
            System.out.println("Temperature atm: " + currentTemp.getText() + tempUnit.getText());

//            Thread.sleep(500);
//            driver.close();
        } catch(Exception e) {
            System.out.println("Something went wrong!");
            System.out.println(e.getStackTrace());
        }



    }
}
