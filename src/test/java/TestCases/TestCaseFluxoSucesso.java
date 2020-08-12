package TestCases;

import Tasks.CriaNovoUsuarioTask;
import Tasks.LoginTask;
import Tasks.ValidacoesTask;
import Util.ScreenShot;
import com.aventstack.extentreports.Status;
import Util.Report;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseFluxoSucesso {
    private WebDriver driver;
    private LoginTask login;
    private CriaNovoUsuarioTask novoUsuario;
    private ValidacoesTask validacoes;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://seubarriga.wcaquino.me/login");
        driver.manage().window().maximize();

        login = new LoginTask(driver);
        novoUsuario = new CriaNovoUsuarioTask(driver);
        validacoes = new ValidacoesTask(driver);

    }

    @Test
    public void testFluxoCompletoSucesso(){
        login.vaiParaCadastroDeUsuario();
        novoUsuario.criaUsuario();
        validacoes.validaMensagemSucessoCadastroUsuario();
        Report.log(Status.INFO,"Usuário Criado", ScreenShot.capture(driver));
        novoUsuario.vaiParaLogin();
        login.realizaLogin();
        validacoes.validaMensagemSucessoLogin();
        Report.log(Status.INFO,"Login Realizado", ScreenShot.capture(driver));
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
