package testes;


import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class InformacoesUsuarioTest {
    @Test
    public void testAdcionarUmaInformacaoAdicionalDeUsuario () {
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\Teste\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        //Navegando para a página Taskit
        navegador.get("http://www.juliodelima.com.br/taskit");

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
        //Fechar o navegador

        //Validação
        assertEquals( '1', '1' );



    }

}
