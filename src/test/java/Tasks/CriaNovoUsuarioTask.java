package Tasks;

import AppObject.NovoUsuarioAppObject;
import org.openqa.selenium.WebDriver;

public class CriaNovoUsuarioTask {
    private NovoUsuarioAppObject novoUsuarioAppObject;

    public CriaNovoUsuarioTask (WebDriver driver){
        this.novoUsuarioAppObject = new NovoUsuarioAppObject(driver);
    }
    public void criaUsuario (){
        novoUsuarioAppObject.getNomeField().sendKeys("Maria");
        novoUsuarioAppObject.getEmailField().sendKeys("maria@email.com");
        novoUsuarioAppObject.getPasswordField().sendKeys("senha123");
        novoUsuarioAppObject.getCadastrarButton().click();
    }

    public void vaiParaLogin(){
        novoUsuarioAppObject.getReturnLoginMenu().click();
    }
}
