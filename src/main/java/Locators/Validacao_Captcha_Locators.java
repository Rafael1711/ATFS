package Locators;

import org.openqa.selenium.By;

public interface Validacao_Captcha_Locators {
	static String EMAIL_USUARIO = "franciscobarbosa@alu.uern.br";
	static String CAPCTHA_ERRADO = "123123";
	public static final By INTERFACE_RECUPERAR_LOGIN = By.xpath("//body/div[@id='container']/div[@id='conteudo']/div[3]/div[1]/center[1]/a[2]");
	public static final By INPUT_EMAIL = By.xpath("//tbody/tr[1]/td[2]/input[1]");
	public static final By INPUT_BOX_CAPTCHA = By.xpath("//tbody/tr[1]/td[1]/input[1]");
	public static final By BOTAO_RECUPERAR = By.xpath("//body/div[@id='container']/div[@id='conteudo']/form[@id='j_id_jsp_1501972786_1']/table[1]/tfoot[1]/tr[1]/td[1]/input[1]");
	public static final By TITULO_LOGIN_ENVIADO_SUCESSO = By.xpath("//li[contains(text(),'O login encontrado foi enviado para o seu e-mail!')]");
}