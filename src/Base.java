import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {
    WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElementByClassName(String identifier) {
        return this.driver.findElement(By.className(identifier));
    }

    public WebElement getElementById(String identifier) {
        return this.driver.findElement(By.id(identifier));
    }

    public WebElement getElementByXPath(String identifier) {
        return this.driver.findElement(By.xpath(identifier));
    }
}
