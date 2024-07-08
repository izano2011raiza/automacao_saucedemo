package saucedemo.automacao.metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import saucedemo.automacao.drivers.Drivers;

public class MetodosDeTeste extends Drivers {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void validarUrl(String urlEsperada) {
		String urlCapturada = driver.getCurrentUrl();
		assertEquals(urlEsperada, urlCapturada);
	}

	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoCapturado);
	}
}
