package TestCases;

import Tasks.CriaNovoUsuarioTask;
import Tasks.LoginTask;
import Tasks.ValidacoesTask;
import Util.Report;
import Util.ScreenShot;
import com.aventstack.extentreports.Status;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseNovoUsuario {
    private WebDriver driver;
    private CriaNovoUsuarioTask novoUsuario;
    private ValidacoesTask validacoes;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://seubarriga.wcaquino.me/cadastro");
        driver.manage().window().maximize();

        novoUsuario = new CriaNovoUsuarioTask(driver);
        validacoes = new ValidacoesTask(driver);

    }

    @Test
    public void testCadastroUsuario(){
        novoUsuario.criaUsuario();
        validacoes.validaMensagemSucessoCadastroUsuario();
        Report.log(Status.INFO,"Usuário Criado", ScreenShot.capture(driver));
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
