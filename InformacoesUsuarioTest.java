package testes;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectableChannel;
import java.util.concurrent.TimeUnit;


public class InformacoesUsuarioTest{
    private WebDriver navegador;
    @Before
    public void setUp() {
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\Teste\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando para a página Taskit
        navegador.get("http://www.juliodelima.com.br/taskit");

    }
    @Test
    public void testAdcionarUmaInformacaoAdicionalDeUsuario () {


        //Clicar no link com texto "Sign In"
        navegador.findElement(By.linkText("Sign in")).click();

        // Identificando o formulario de "Login"
        WebElement formularioSignInBox =navegador.findElement(By.id("signinbox"));

        //Digitar no campo com nome "Login" o texto "julio0001"
        formularioSignInBox.findElement(By.name("login")).sendKeys("julio0001");

        //Digitar no campo com nome "Password" o texto "123456"
        formularioSignInBox.findElement(By.name("password")).sendKeys("123456");


        //Clicar no link com texto "Sign In"
        navegador.findElement(By.linkText("SIGN IN")).click();


        //Validar que dentro do elemento com class "me" está o textp "Hi, Julio"
        WebElement me =navegador.findElement(By.className("me"));
        String textoNoElementoMe = me.getText();
        assertEquals("Hi, Julio", textoNoElementoMe);

        //Clicar em um link que possua a clsss "me"
        navegador.findElement(By.className("me")).click();

        //Clicar em um link que possua o texto "MORE DATA ABOUT YOU"
        navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();

        //Clicar no botão através do seu xpath //button[@data-target="addmoredata"]
        navegador.findElement(By.xpath("//button[@data-target=\"addmoredata\"]")).click();

        //Identificar o pop-up onde esta o formulário  de id addmoredata
        WebElement popupAddMoreData = navegador.findElement(By.id("addmoredata"));

        //Na combo de nome "type" escolher a opção Phone
        WebElement campoType =popupAddMoreData.findElement(By.name("type"));
        new Select(campoType).selectByVisibleText("Phone");

        //No campo de nome "contact" digitar "+5511985850101"
        popupAddMoreData.findElement(By.name("contact")).sendKeys("+5511985850101");

        //Clicar no link de texto "SAVE" que está no popup
        popupAddMoreData.findElement(By.linkText("SAVE")).click();

        //Na mensagem de id "toast-container" validar que o texto é "You contact has been added!"
        WebElement mensagemPop = navegador.findElement(By.id("toast-container"));
        String mensagem =mensagemPop.getText();
        assertEquals("Your contact has been added!", mensagem);



        //Validação
        assertEquals( '1', '1' );



    }
    @After
    public void tearDown(){
        //Fechar o navegador
        navegador.quit();


    }
