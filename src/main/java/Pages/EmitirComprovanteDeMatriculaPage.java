package Pages;

import static Locators.Emitir_Comprovante_De_Matricula_Locators.*;
import static Locators.Useful_Constants_Locators.*;

public class EmitirComprovanteDeMatriculaPage extends UsefulConstants {
     LoginPage LoginPageObject = new LoginPage();

     // Fluxo: Emitir o comprovante de matrícula
     public void EmitirComprovanteDeMatricula() throws InterruptedException {
          // 1) Realiza login no sistema
          LoginPageObject.fazerLogin();

          // 2) Acessa o menu "Ensino"
          ClicoNoElemento(ENSINO);
          Thread.sleep(500);

          // 3) Seleciona a opção "Matrícula Online"
          ClicoNoElemento(MATRICULA_ONLINE);
          Thread.sleep(500);

          // 4) Clica em "Ver Comprovante de Matrícula"
          ClicoNoElemento(VER_COMPROVANTE_DE_MATRICULA);
          Thread.sleep(500);

          // 5) Clica no botão de imprimir para gerar o comprovante
          ClicoNoElemento(BOTAO_IMPRIMIR);
          Thread.sleep(2500); // espera o arquivo ser gerado/download
     }

     // Fluxo: Excluir o comprovante de matrícula já baixado
     public void ExcluirComprovanteDeMatricula() {
          // 6) Verifica se o arquivo foi baixado e o exclui
          verificarEExcluirArquivo(NOME_COMPROVANTE_DE_MATRICULA);
     }
}