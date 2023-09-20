import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        Today today = new Today(driver, "Today's weather");
        today.find();
        today.display();

        Tomorrow tomorrow = new Tomorrow(driver, "Tomorrow weather");
        tomorrow.find();
        tomorrow.display();


    }
}
