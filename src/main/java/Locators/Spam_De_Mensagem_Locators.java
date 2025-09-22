package Locators;

import org.openqa.selenium.By;

public interface Spam_De_Mensagem_Locators {
	static String TEXT_ASSUNTO_SPAM = "Manuntenção no SIGAA";
	static String TEXT_MENSAGEM_SPAM = "Informamos que o Sistema Integrado de Gestão de Atividades Acadêmicas - SIGAA está passando por manutenção técnica.\nDurante este período, algumas funcionalidades podem estar temporariamente indisponíveis.\nEstamos trabalhando para concluir os ajustes o mais rápido possível e retomar o pleno funcionamento do sistema.\n\nAtenciosamente, Equipe de Superintendência de Tecnologia e Comunicação - STI/UERN.";
	public static final By ADD_DESTINATARIO = By.xpath("//tbody/tr[1]/td[2]/a[1]/img[1]");
}
