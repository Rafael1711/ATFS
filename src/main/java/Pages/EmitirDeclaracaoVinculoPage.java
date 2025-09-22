package Pages;

import static Locators.Emitir_Declaracao_Vinculo_Locators.*;
import static Locators.Useful_Constants_Locators.*;

public class EmitirDeclaracaoVinculoPage extends UsefulConstants {
     LoginPage LoginPageObject = new LoginPage();

     // Fluxo: Emitir a declaração de vínculo
     public void EmitirDeclaracaoDeVinculo() throws InterruptedException {
          // 1) Realiza login no sistema
          LoginPageObject.fazerLogin();

          // 2) Acessa o menu "Ensino"
          ClicoNoElemento(ENSINO);
          Thread.sleep(500);

          // 3) Seleciona a opção "Emitir Declaração de Vínculo"
          ClicoNoElemento(EMITIR_DECLARACAO_VINCULO);
          Thread.sleep(2500); // espera tempo suficiente para gerar/download do arquivo
     }

     // Fluxo: Excluir a declaração de vínculo já baixada
     public void ExcluirDeclaracaoVinculo() {
          // 4) Verifica se o arquivo foi baixado e o exclui
          verificarEExcluirArquivo(NOME_DECLARACAO_VINCULO);
     }
}
