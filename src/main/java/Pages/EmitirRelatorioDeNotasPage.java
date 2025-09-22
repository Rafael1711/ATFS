package Pages;

import static Locators.Emitir_Relatorio_De_Notas_Locators.*;
import static Locators.Useful_Constants_Locators.*;

public class EmitirRelatorioDeNotasPage extends UsefulConstants {
     LoginPage LoginPageObject = new LoginPage();

     // Fluxo: Emitir relatório de notas
     public void EmitirRelatorioDeNotas() throws InterruptedException {
          // 1) Realiza login no sistema
          LoginPageObject.fazerLogin();

          // 2) Acessa o menu "Ensino"
          ClicoNoElemento(ENSINO);
          Thread.sleep(500);

          // 3) Seleciona a opção "Consultar Minhas Notas"
          ClicoNoElemento(CONSULTAR_MINHAS_NOTAS);
          Thread.sleep(500);

          // 4) Clica no botão de imprimir para gerar o relatório
          ClicoNoElemento(BOTAO_IMPRIMIR);
          Thread.sleep(2500); // espera o download/geração do PDF
     }

     // Fluxo: Excluir relatório de notas já baixado
     public void ExcluirRelatorioDeNotas() {
          // 5) Verifica se o arquivo foi baixado e o exclui
          verificarEExcluirArquivo(NOME_RELATORIO_DE_NOTAS);
     }
}
