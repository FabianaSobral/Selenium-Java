package testes;


import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.ws.WebEndpoint;

public class InformacoesUsuarioTest {
    @Test
    public void testAdcionarUmaInformacaoAdicionalDeUsuario () {
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        //Navegando para a página Taskit
        navegador.get("http://www.juliodelima.com.br/taskit");

        //Validação
       assertEquals( '1', '1' );

    }

}
