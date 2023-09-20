import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Tomorrow extends Weather {
    public Tomorrow(WebDriver driver, String url) {
        super(driver, url);
    }

    @Override
    public void find(){
        try{
            this.search(this.url);
            this.currentTemp = this.driver.findElement(By.xpath("//*[@id='wob_tm']"));
            this.tempUnit = this.driver.findElement(By.xpath("//*[@aria-label='°Celsius']"));
            this.localTime = this.driver.findElement(By.xpath("//*[@id='wob_dts']"));
            this.location = this.driver.findElement(By.xpath("//*[@class='BBwThe']"));

        }catch(Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    @Override
    public void display() {
        System.out.println("Location:" + this.location.getText());
        System.out.println("Current Time: " + this.localTime.getText());
        System.out.println("Temperature atm: " + this.currentTemp.getText() + this.tempUnit.getText());
    }
}
