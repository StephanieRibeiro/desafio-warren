package AppObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NovoUsuarioAppObject {
    private WebDriver driver;

    public NovoUsuarioAppObject (WebDriver driver){
        this.driver = driver;
    }

    public WebElement getNomeField(){
        return this.driver.findElement(By.id("nome"));
    }

    public WebElement getEmailField(){
        return this.driver.findElement(By.id("email"));
    }

    public WebElement getPasswordField(){
        return this.driver.findElement(By.id("senha"));
    }

    public WebElement getCadastrarButton(){
        return this.driver.findElement(By.cssSelector("input[type='submit']"));
    }

    public WebElement getReturnLoginMenu(){
        return this.driver.findElement(By.cssSelector("ul#navbar navbar-nav li:nth-of-type(1)"));
    }
}
