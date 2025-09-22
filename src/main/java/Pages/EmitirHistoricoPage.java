package Pages;

import static Locators.Emitir_Historico_Locators.*;
import static Locators.Useful_Constants_Locators.*;

public class EmitirHistoricoPage extends UsefulConstants {
     LoginPage LoginPageObject = new LoginPage();

     // Fluxo: Emitir histórico
     public void EmitirHistorico() throws InterruptedException {
          // 1) Realiza login no sistema
          LoginPageObject.fazerLogin();

          // 2) Acessa o menu "Ensino"
          ClicoNoElemento(ENSINO);
          Thread.sleep(500);

          // 3) Seleciona a opção "Emitir Histórico"
          ClicoNoElemento(EMITIR_HISTORICO);
          Thread.sleep(2500); // espera a geração/download do documento
     }

     // Fluxo: Excluir histórico já baixado
     public void ExcluirHistorico() {
          // 4) Verifica se o arquivo foi baixado e o exclui
          verificarEExcluirArquivo(NOME_HISTORICO);
     }
}