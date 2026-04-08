import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {
    private WebDriver driver;

    private String baseUrl = "https://purdra.by";
    private String enterBtnLocator = "//a[@href='#modalSign'] [@class='login']";
    private String inputEmailLocator = "//input[@type='email'] [@name='emailSign']";
    private String inputPasswordLocator = "//input[@type='password'] [@name='passwordSign']";
    private String buttonSubmitLocator = "//div[@class='col-md-8 col-sm-10 col-xs-9']/button[@type='submit'] [@class='btn btn-pink']";
    private String errorMessageLocator = "//form[@id='formSign']/div[@class='form-group form-group-error']/label[@class='error']";

    public Page getUrl(){
        driver.get(baseUrl);
        return this;
    }

    public Page clickEnterBtn(){
        WebElement enterBtn = driver.findElement(By.xpath(enterBtnLocator));
        enterBtn.click();
        return this;
    }

    public Page inputEmail(String inputKeys){
        WebElement inputEmail = driver.findElement(By.xpath(inputEmailLocator));
        inputEmail.sendKeys(inputKeys);
        return this;
    }

    public Page inputPassword(String inputKeys){
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordLocator));
        inputPassword.sendKeys(inputKeys);
        return this;
    }

    public Page buttonSubmit() {
        WebElement buttonSubmit = driver.findElement(By.xpath(buttonSubmitLocator));
        buttonSubmit.click();
        return this;
    }

    public String getErrorMessage(){
        WebElement errorMessage = driver.findElement(By.xpath(errorMessageLocator));
        return errorMessage.getText();
    }


    public Page(WebDriver driver) {
        this.driver = driver;
    }
}
