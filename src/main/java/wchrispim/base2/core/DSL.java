package wchrispim.base2.core;
import static wchrispim.base2.core.DriverFactory.getDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {
	
	/********* Login ************/
	
	public void escrever(By by, String texto){
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}

	public void escrever(String id_campo, String texto){
		escrever(By.id(id_campo), texto);
	}
		
	public void escreverSenha(String id_senha, String texto){
			escrever(By.id(id_senha), texto);
	}
	
	
	/********* Botao ************/
	
	public void clicarBotao(String cssSelector) {
		getDriver().findElement(By.cssSelector(cssSelector)).click();
	}
	
	/********* Textos ************/
	
	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public String obterTexto(String linkText) {
		return obterTexto(By.linkText(linkText));
	}
	
}