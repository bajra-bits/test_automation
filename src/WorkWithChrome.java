import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithChrome {
    public static void main(String[] args) {
      WebDriver driver = new ChromeDriver();
      driver.get("http://vemployee.d2hs.com/index.php");
      driver.manage().window().maximize();

      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(20,250)");

      WebElement trainee = driver.findElement(By.xpath("//*[@id=\"ajxloading\"]/div[13]/div/a[2]"));
      trainee.click();


      WebElement inputText = driver.findElement(By.xpath("//*[@id=\"empname\"]"));
      inputText.sendKeys("Rejan Bajracharya");
      inputText.sendKeys(Keys.ENTER);


//      WebElement acceptBtn = driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']"));
//        acceptBtn.click();
//
//        WebElement startBtn = driver.findElement(By.xpath("//*[@id=\"typing-test\"]"));
//        startBtn.click();
//
//
//        WebElement input = driver.findElement(By.xpath("//input[@id='inputfield']"));
//        input.sendKeys("hello world");


    }
}
