package Locators;

import org.openqa.selenium.By;

public interface Emitir_Comprovante_De_Matricula_Locators {
	static String NOME_COMPROVANTE_DE_MATRICULA = "Sistema Integrado de Gestão de Atividades Acadêmicas.pdf";
	public static final By MATRICULA_ONLINE = By.xpath("//td[contains(text(),'Matrícula On-Line')]");
	public static final By VER_COMPROVANTE_DE_MATRICULA = By.xpath("//div[@id='cmSubMenuID3']/table/tbody/tr[7]/td[2]");
}