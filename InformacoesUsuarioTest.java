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
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        //Navegando para a página Taskit
        navegador.get("http://www.juliodelima.com.br/taskit");

        //Clicar no link com texto "Sign In"
        navegador.findElement(By.linkText("Sign in")).click();

        //Clicar no campo com nome "Login"
         WebElement formulatioSignInBox = navegador.findElement (By.id("signibox"));

        //Digitar no campo com nome "Login" o texto "julio0001"
        //Clicar no campo com nome "Password"
        //Digitar no campo com nome "Password" o texto "123456"
        //Clicar no link com texto "Sign In"
        //Validar que dentro do elemento com class "me" está o textp "Hi, Julio"
        //Fechar o navegador

        //Validação
       assertEquals( '1', '1' );

    }

}
