package Locators;

import org.openqa.selenium.By;

public interface Useful_Constants_Locators {
	static String TEXTO_ASSUNTO = "Manuntenção no SIGAA";
	static String NOME_USUARIO_TESTE = "Francisco Rafael Barbosa de Sousa"; // Meu nome é usado para enviar uma mensagem para mim mesmo e com cópia para a permutação de e-mail gerado
	static String DESTINATARIO_TESTE = "Yuri Dantas da Silva"; // Com esse nome será gerada a permutação dos e-mails
	static String TEXTO_TITULO_SUCESSO_ALTERAR_DADOS = "Dados Alterados com Sucesso";
	public static final By CAMPO_EMAIL = By.xpath("//input[@id='form:email']");
	static String URL_MENSAGEM_ENVIADA = "https://sigadmin.uern.br/cxpostal/envia_mensagem.jsf";
	public static final By ALTERAR_SENHA = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]");
	public static final By BOTAO_ALTERAR_DADOS = By.xpath("//input[@id='form:alterarDados']");
	public static final By TITULO_SUCESSO_ALTERAR_DADOS = By.xpath("//h1[contains(text(),'Dados Alterados com Sucesso')]");
	public static final By ENSINO = By.xpath("/span[contains(text(),'Ensino')]");
	public static final By BOTAO_SAIR = By.xpath("//a[contains(text(),'SAIR')]");
	public static final By BOTAO_FECHAR = By.xpath("//body/div[@id='container']/center[1]/a[1]/img[1]");
	public static final By BOTAO_IMPRIMIR= By.xpath("//a[contains(text(),'Imprimir')]");
	public static final By MENSAGEM = By.xpath("//a[contains(text(),'Mensagens')]");
	public static final By ENVIAR_MENSAGEM = By.xpath("//body/div[@id='container']/form[@id='form']/div[@id='mailbox']/div[@id='pastas']/ul[1]/li[4]/a[1]/img[1]");
	public static final By CAMPO_DESTINATARIO = By.xpath("//input[@id='form:usuarioAuto']");
	public static final By CAMPO_TEXTO_ASSUNTO = By.xpath("//input[@id='form:assunto']");
	public static final By BOTAO_ENVIAR_MENSAGEM = By.xpath("//input[@id='form:btnBotaoCancelar']");
	public static final By MENU_DISCENTE = By.xpath("//a[contains(text(),'Menu Discente')]");
}