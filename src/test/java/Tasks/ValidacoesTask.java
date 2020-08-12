package Tasks;

import AppObject.ValidacoesAppObject;
import org.openqa.selenium.WebDriver;

public class ValidacoesTask {
    private ValidacoesAppObject validacoes;

    public ValidacoesTask (WebDriver driver){
        this.validacoes = new ValidacoesAppObject(driver);
    }

    public boolean validaMensagemSucessoLogin(){
        return validacoes.getMensagemSucesso().getText().contains("Bem vindo");
    }

    public boolean validaMensagemSucessoCadastroUsuario(){
        return validacoes.getMensagemSucesso().getText().contains("Usuário inserido com sucesso");
    }

    public boolean validaMensagemErroLogin(){
        return validacoes.getMensagemErro().getText().contains("Problemas com o login do usuário");
    }

    public boolean validaMensagemErroCadastroUsuario(){
        return validacoes.getMensagemErro().getText().contains("Endereço de email já utilizado");
    }

}
