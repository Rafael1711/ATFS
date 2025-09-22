package Locators;

import org.openqa.selenium.By;

public interface Emitir_Relatorio_De_Avaliacao_Institucional_Locators {
	static String NOME_RELATORIO_DE_AVALIACAO_INSTITUCIONAL = "Sistema Integrado de Gestão de Atividades Acadêmicas.pdf";
	public static final By AVALIACAO_INSTITUCIONAL = By.xpath("//div[@id='cmSubMenuID1']/table/tbody/tr[10]/td[2]");
	public static final By CONSULTAR_RESULTADO_DAS_AVALIACOES = By.xpath("//div[@id='cmSubMenuID2']/table/tbody/tr[4]/td[2]");
	public static final By MENU_SELECT_DEPARTAMENTO = By.xpath("//select[@id='form:escolha_relatorio']");
	public static final By MENU_SELECT_PERIODO = By.xpath("//select[@id='form:anoPeriodo']");
	public static final By BOTAO_GERAR_RELATORIO = By.xpath("//input[@id='form:botaoRelatorio']");
}