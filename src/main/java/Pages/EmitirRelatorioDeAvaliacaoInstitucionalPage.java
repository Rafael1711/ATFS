package Pages;

import org.openqa.selenium.Keys;
import static Locators.Emitir_Relatorio_De_Avaliacao_Institucional_Locators.*;
import static Locators.Useful_Constants_Locators.*;

public class EmitirRelatorioDeAvaliacaoInstitucionalPage extends UsefulConstants {
     LoginPage LoginPageObject = new LoginPage();

     // Fluxo: Emitir relatório de avaliação institucional
     public void EmitirRelatorioDeAvaliacaoInstitucional() throws InterruptedException {
          // 1) Realiza login no sistema
          LoginPageObject.fazerLogin();

          // 2) Acessa o menu "Ensino"
          ClicoNoElemento(ENSINO);
          Thread.sleep(500);

          // 3) Seleciona a opção "Avaliação Institucional"
          ClicoNoElemento(AVALIACAO_INSTITUCIONAL);
          Thread.sleep(500);

          // 4) Consulta o resultado das avaliações
          ClicoNoElemento(CONSULTAR_RESULTADO_DAS_AVALIACOES);
          Thread.sleep(500);

          // 5) Seleciona o departamento (simulando navegação no select com setas)
          ClicoNoElemento(MENU_SELECT_DEPARTAMENTO);
          Thread.sleep(500);
          for(int i = 1; i <= 10; i++){
               EsperoEstarVisivel(MENU_SELECT_DEPARTAMENTO).sendKeys(Keys.ARROW_DOWN);
          }
          EsperoEstarVisivel(MENU_SELECT_DEPARTAMENTO).sendKeys(Keys.ENTER);
          Thread.sleep(500);

          // 6) Seleciona o período (simulando navegação no select com setas)
          ClicoNoElemento(MENU_SELECT_PERIODO);
          Thread.sleep(500);
          for(int i = 1; i <= 10; i++){
               EsperoEstarVisivel(MENU_SELECT_PERIODO).sendKeys(Keys.ARROW_DOWN);
          }
          EsperoEstarVisivel(MENU_SELECT_PERIODO).sendKeys(Keys.ENTER);
          Thread.sleep(500);

          // 7) Clicar em gerar relatório
          ClicoNoElemento(BOTAO_GERAR_RELATORIO);
          Thread.sleep(500);

          // 8) Clicar em imprimir para gerar o arquivo PDF
          ClicoNoElemento(BOTAO_IMPRIMIR);
     }

     // Fluxo: Excluir o relatório de avaliação institucional já baixado
     public void ExcluirRelatorioDeAvaliacaoInstitucional() {
          // 9) Verifica se o arquivo foi baixado e o exclui
          verificarEExcluirArquivo(NOME_RELATORIO_DE_AVALIACAO_INSTITUCIONAL);
     }
}