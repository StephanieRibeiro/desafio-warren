package Tasks;

import AppObject.LoginAppObject;
import org.openqa.selenium.WebDriver;

public class LoginTask {
    private LoginAppObject loginAppObject;

    public LoginTask (WebDriver driver){
        this.loginAppObject = new LoginAppObject(driver);
    }

    public void realizaLogin(){
        loginAppObject.getLoginField().sendKeys("maria@email.com");
        loginAppObject.getPasswordField().sendKeys("senha123");
        loginAppObject.getEntrarButton().click();
    }

    public void vaiParaCadastroDeUsuario(){
        loginAppObject.getCadastrarNovoUsuarioMenu().click();
    }
}
