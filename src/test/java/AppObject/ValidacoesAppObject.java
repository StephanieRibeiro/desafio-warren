package AppObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidacoesAppObject {
    private WebDriver driver;

    public ValidacoesAppObject(WebDriver driver){
        this.driver= driver;
    }

    public WebElement getMensagemSucesso(){
        return this.driver.findElement(By.cssSelector("div[class='alert alert-success'] [role= 'alert']"));
    }

    public WebElement getMensagemErro(){
        return this.driver.findElement(By.cssSelector("div[class='alert alert-danger'] [role= 'alert']"));
    }
}
