import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class Weather extends Base{
    String url;
    WebElement currentTemp;
    WebElement tempUnit;
    WebElement localTime;
    WebElement location;

    public Weather(WebDriver driver, String url) {
        super(driver);
        this.url = url;
    }

    public void search(String searchText) {
        WebElement searchField = this.driver.findElement(By.xpath("//*[@jsname='yZiJbe']"));
        if(!searchField.getText().isEmpty()) {
            searchField.clear();
        }
        searchField.sendKeys(searchText);
        searchField.sendKeys(Keys.ENTER);
    }


    public void find(){
        try{
            this.search(this.url);
            List<WebElement> elemList = this.driver.findElements(By.xpath("//*[text()='Change to English']"));
            if(elemList.size() > 0) {
                elemList.get(0).click();
            }

            /* assign web elements */
            this.currentTemp = this.driver.findElement(By.xpath("//*[@id='wob_tm']"));
            this.tempUnit = this.driver.findElement(By.xpath("//*[@aria-label='°Celsius']"));
            this.localTime = this.driver.findElement(By.xpath("//*[@id='wob_dts']"));
            this.location = this.driver.findElement(By.xpath("//*[@class='BBwThe']"));

        }catch(Exception e) {
            System.out.println(e.getStackTrace());
        }

    }

    public void display() {
        System.out.println("Location:" + this.location.getText());
        System.out.println("Current Time: " + this.localTime.getText());
        System.out.println("Temperature atm: " + this.currentTemp.getText() + this.tempUnit.getText());
    }
}
