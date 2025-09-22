package Pages;

import static Locators.Emitir_Atestado_De_Matricula_Locators.*;
import static Locators.Useful_Constants_Locators.*;

public class EmitirAtestadoDeMatriculaPage extends UsefulConstants {
     LoginPage LoginPageObject = new LoginPage();

     // Fluxo: Emitir o atestado de matrícula
     public void EmitirAtestadoDeMatricula() throws InterruptedException {
          // 1) Realiza login no sistema
          LoginPageObject.fazerLogin();

          // 2) Acessa o menu "Ensino"
          ClicoNoElemento(ENSINO);
          Thread.sleep(500);

          // 3) Seleciona a opção "Emitir Atestado de Matrícula"
          ClicoNoElemento(EMITIR_ATESTADO_DE_MATRICULA);
          Thread.sleep(500);

          // 4) Clica no botão para imprimir o atestado
          ClicoNoElemento(BOTAO_IMPRIMIR);
          Thread.sleep(2500); // espera o arquivo ser gerado/download
     }

     // Fluxo: Excluir o atestado de matrícula já baixado
     public void ExcluirAtestadoDeMatricula() {
          // 5) Verifica se o arquivo foi baixado e o exclui
          verificarEExcluirArquivo(NOME_ATESTADO_DE_MATRICULA);
     }
}