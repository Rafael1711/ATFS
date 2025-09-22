package Pages;

import org.junit.Assert;
import static Locators.Validacao_Captcha_Locators.*;

public class ValidacaoCaptchaPage extends UsefulConstants {

     // Teste 1: Recuperar login sem informar captcha
     public void recuperarLoginSemInformarCaptcha() {
          try {
               // 1) Acessa a tela de recuperação de login
               ClicoNoElemento(INTERFACE_RECUPERAR_LOGIN);

               // 2) Insere o e-mail do usuário
               Envio_O_Dado(INPUT_EMAIL, EMAIL_USUARIO);

               // 3) Clica no botão recuperar
               ClicoNoElemento(BOTAO_RECUPERAR);

               // 4) Valida se a mensagem de sucesso apareceu na tela
               String valorDaPagina = EsperoEstarVisivel(TITULO_LOGIN_ENVIADO_SUCESSO).getText();
               Assert.assertTrue(valorDaPagina.contains("O login encontrado foi enviado para o seu e-mail!"));

               System.out.println("Teste: recuperarLoginSemInformarCaptcha - SUCESSO");
          } catch (Exception e) {
               System.err.println("Erro no teste recuperarLoginSemInformarCaptcha: " + e.getMessage());
               e.printStackTrace();
          }
     }

     // Teste 2: Recuperar login informando captcha incorreto
     public void recuperarLoginInformandoCaptcha() {
          try {
               // 1) Acessa a tela de recuperação de login
               ClicoNoElemento(INTERFACE_RECUPERAR_LOGIN);

               // 2) Insere o e-mail do usuário
               Envio_O_Dado(INPUT_EMAIL, EMAIL_USUARIO);

               // 3) Insere captcha incorreto
               Envio_O_Dado(INPUT_BOX_CAPTCHA, CAPCTHA_ERRADO);

               // 4) Clica no botão recuperar
               ClicoNoElemento(BOTAO_RECUPERAR);

               // 5) Valida se a mensagem de sucesso apareceu na tela
               String valorDaPagina = EsperoEstarVisivel(TITULO_LOGIN_ENVIADO_SUCESSO).getText();
               Assert.assertTrue(valorDaPagina.contains("O login encontrado foi enviado para o seu e-mail!"));

               System.out.println("Teste: recuperarLoginInformandoCaptcha - SUCESSO");
          } catch (Exception e) {
               System.err.println("Erro no teste recuperarLoginInformandoCaptcha: " + e.getMessage());
               e.printStackTrace();
          }
     }

     // Método que executa ambos os testes de validação de captcha
     public void ValidacaoCaptcha() {
          // 1) Executa recuperação sem informar captcha
          recuperarLoginSemInformarCaptcha();

          // 2) Reinicia o navegador para iniciar uma nova sessão limpa
          close(); // Fecha o navegador
          start(); // Abre o navegador novamente

          // 3) Executa recuperação informando captcha incorreto
          recuperarLoginInformandoCaptcha();
     }
}