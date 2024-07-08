package saucedemo.automacao.runner;

import org.openqa.selenium.edge.EdgeDriver;

import saucedemo.automacao.drivers.Drivers;

public class Executa extends Drivers {

	public static void abrirNavegador() {
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	public static void fecharNavegador() {
		driver.quit();
	}

}
