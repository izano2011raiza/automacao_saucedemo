package saucedemo.automacao.peges;

import org.openqa.selenium.By;

import saucedemo.automacao.drivers.Drivers;
import saucedemo.automacao.metodos.MetodosDeTeste;

public class HomePage extends Drivers {

	By userName = By.id("user-name");
	By password = By.id("password");
	By btnLogin = By.id("login-button");

	MetodosDeTeste m = new MetodosDeTeste();

	public void loginOk(String usuario, String senha) {
		m.escrever(userName, usuario);
		m.escrever(password, senha);
		m.clicar(btnLogin);
	}

	public void loginBloq(String usuario, String senha) {
		m.escrever(userName, usuario);
		m.escrever(password, senha);
		m.clicar(btnLogin);
	}
}
