package wchrispim.base2.test;
import static wchrispim.base2.core.DriverFactory.getDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import wchrispim.base2.core.DSL;
import wchrispim.base2.core.DriverFactory;
import wchrispim.base2.core.BaseTest;


public class TesteMantis {
	
	private DSL dsl;

	@Before
	public void inicializa(){
		getDriver().get("https://mantis-prova.base2.com.br/login_page.php");
		dsl = new DSL();
	}
	
	
	@Test
	public void testMantis(){
		dsl.escrever("username", "wesley.chrispim");
		dsl.clicarBotao(".width-40");
		dsl.escreverSenha("password", "Senha@123");
		dsl.clicarBotao(".width-40");
		Assert.assertEquals("Criar Tarefa", dsl.obterTexto("Criar Tarefa"));
	}
	
	@After
	public void finaliza(){
		DriverFactory.killDriver();
	}

}
