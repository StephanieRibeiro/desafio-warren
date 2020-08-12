package AppObject;

import org.openqa.selenium.*;

public class LoginAppObject {
    private WebDriver driver;

    public LoginAppObject(WebDriver driver){
        this.driver= driver;
    }

    public WebElement getLoginField(){
        return this.driver.findElement(By.id("email"));
    }

    public WebElement getPasswordField(){
        return this.driver.findElement(By.id("senha"));
    }

    public WebElement getEntrarButton(){
        return this.driver.findElement(By.cssSelector("input[type='submit']"));
    }
    public WebElement getCadastrarNovoUsuarioMenu(){
        return this.driver.findElement(By.cssSelector("ul#navbar navbar-nav li:nth-of-type(2)"));
    }

}
