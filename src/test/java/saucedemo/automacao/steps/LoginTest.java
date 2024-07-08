package saucedemo.automacao.steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import saucedemo.automacao.metodos.MetodosDeTeste;
import saucedemo.automacao.peges.HomePage;
import saucedemo.automacao.runner.Executa;

public class LoginTest {
	
	String usuarioOK = "standard_user";
	String usuarioBloq = "locked_out_user";
	String senha = "secret_sauce";
	String urlLogada = "https://www.saucedemo.com/inventory.html";
	String msgErrorBloq = "Epic sadface: Sorry, this user has been locked out.";
	By errorBloq = By.xpath("//h3[@data-test='error']");
	
	HomePage home = new HomePage();
	MetodosDeTeste m = new MetodosDeTeste();	

	@Given("que esteja na tela de login")
	public void que_esteja_na_tela_de_login() {
		Executa.abrirNavegador();
	}

	@When("enviar os dados validos")
	public void enviar_os_dados_validos() {
		home.loginOk(usuarioOK, senha);

	}

	@Then("login com sucesso")
	public void login_com_sucesso() {
		m.validarUrl(urlLogada);
	}

	@When("enviar dados de usuario bloqueado")
	public void enviar_dados_de_usuario_bloqueado() {
		home.loginBloq(usuarioBloq, senha);
	}

	@Then("sistema exibe mensagem de usuario bloqueado")
	public void sistema_exibe_mensagem_de_usuario_bloqueado() {
		m.validarTexto(errorBloq, msgErrorBloq);
	}

}
