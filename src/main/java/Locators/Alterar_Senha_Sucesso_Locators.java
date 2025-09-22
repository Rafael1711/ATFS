package Locators;

import org.openqa.selenium.By;

public interface Alterar_Senha_Sucesso_Locators {
	public static final By CLICO_EM_ALTERAR_SENHA = By.xpath("//a[@id='form:alterarSenha']");
	public static final By CAMPO_SENHA_ATUAL = By.xpath("//input[@id='form:senhaAtual']");
	public static final By CAMPO_NOVA_SENHA = By.xpath("//input[@id='form:novaSenha']");
	public static final By CAMPO_REPETIR_NOVA_SENHA = By.xpath("//input[@id='form:repetnNovaSenha']");
}