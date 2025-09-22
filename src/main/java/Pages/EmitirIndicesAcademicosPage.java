package Pages;

import static Locators.Emitir_Indices_Academicos_Locators.*;
import static Locators.Useful_Constants_Locators.*;

public class EmitirIndicesAcademicosPage extends UsefulConstants {
     LoginPage LoginPageObject = new LoginPage();

     // Fluxo: Emitir índices acadêmicos
     public void EmitirIndicesAcademicos() throws InterruptedException {
          // 1) Realiza login no sistema
          LoginPageObject.fazerLogin();

          // 2) Acessa o menu "Ensino"
          ClicoNoElemento(ENSINO);
          Thread.sleep(500);

          // 3) Seleciona a opção "Emitir Índices Acadêmicos"
          ClicoNoElemento(EMITIR_INDICES_ACADEMICOS);
          Thread.sleep(500);

          // 4) Clica no botão de imprimir para gerar o documento
          ClicoNoElemento(BOTAO_IMPRIMIR);
          Thread.sleep(2500); // espera o download/geração do PDF
     }

     // Fluxo: Excluir os índices acadêmicos já baixados
     public void ExcluirIndicesAcademicos() {
          // 5) Verifica se o arquivo foi baixado e o exclui
          verificarEExcluirArquivo(NOME_INDICES_ACADEMICOS);
     }
}