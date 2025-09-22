package Pages;

import org.junit.Assert;
import static Locators.Login_Locators.*;

public class LoginPage extends UsefulConstants {

     // Fluxo: Fazer login correto
     public void fazerLogin() {
          try {
               // 1) Preenche o campo de usuário com o valor correto
               Envio_O_Dado(INPUT_USUARIO, USUARIO_CERTO);

               // 2) Preenche o campo de senha com o valor correto
               Envio_O_Dado(INPUT_SENHA, SENHA_CERTA);

               // 3) Clica no botão "Entrar"
               ClicoNoElemento(BOTAO_ENTRAR);

               // 4) Verifica se a URL é a esperada após o login
               VerificoUrl(URL_LOG_ON);

               System.out.println("Teste: fazerLogin - SUCESSO");
          } catch (Exception e) {
               System.err.println("Erro no teste fazerLogin: " + e.getMessage());
               e.printStackTrace();
          }
     }

     // Fluxo: Testes de falha de login
     public void UsuarioErradoSenhaErrada() {
          try {
               Envio_O_Dado(INPUT_USUARIO, USUARIO_ERRADO);
               Envio_O_Dado(INPUT_SENHA, SENHA_ERRADA);
               ClicoNoElemento(BOTAO_ENTRAR);

               String valorDaPagina = EsperoEstarVisivel(TITULO_LOGIN_FALHA).getText();
               Assert.assertEquals(valorDaPagina, "Usuário e/ou senha inválidos");

               System.out.println("Teste: UsuarioErradoSenhaErrada - Título da página: " + valorDaPagina);

               // Limpa o campo usuário para o próximo teste
               Xerxes.findElement(INPUT_USUARIO).clear();
          } catch (Exception e) {
               System.err.println("Erro no teste UsuarioErradoSenhaErrada: " + e.getMessage());
               e.printStackTrace();
          }
     }

     public void UsuarioCertoSenhaErrada() {
          try {
               Envio_O_Dado(INPUT_USUARIO, USUARIO_CERTO);
               Envio_O_Dado(INPUT_SENHA, SENHA_ERRADA);
               ClicoNoElemento(BOTAO_ENTRAR);

               String valorDaPagina = EsperoEstarVisivel(TITULO_LOGIN_FALHA).getText();
               Assert.assertEquals(valorDaPagina, "Usuário e/ou senha inválidos");

               System.out.println("Teste: UsuarioCertoSenhaErrada - Título da página: " + valorDaPagina);
               Xerxes.findElement(INPUT_USUARIO).clear();
          } catch (Exception e) {
               System.err.println("Erro no teste UsuarioCertoSenhaErrada: " + e.getMessage());
               e.printStackTrace();
          }
     }

     public void UsuarioErradoSenhaCerta() {
          try {
               Envio_O_Dado(INPUT_USUARIO, USUARIO_ERRADO);
               Envio_O_Dado(INPUT_SENHA, SENHA_CERTA);
               ClicoNoElemento(BOTAO_ENTRAR);

               String valorDaPagina = EsperoEstarVisivel(TITULO_LOGIN_FALHA).getText();
               Assert.assertEquals(valorDaPagina, "Usuário e/ou senha inválidos");

               System.out.println("Teste: UsuarioErradoSenhaCerta - Título da página: " + valorDaPagina);
               Xerxes.findElement(INPUT_USUARIO).clear();
          } catch (Exception e) {
               System.err.println("Erro no teste UsuarioErradoSenhaCerta: " + e.getMessage());
               e.printStackTrace();
          }
     }

     public void UsuarioErrado() {
          try {
               Envio_O_Dado(INPUT_USUARIO, USUARIO_ERRADO);
               ClicoNoElemento(BOTAO_ENTRAR);

               String valorDaPagina = EsperoEstarVisivel(TITULO_LOGIN_FALHA).getText();
               Assert.assertEquals(valorDaPagina, "Usuário e/ou senha inválidos");

               System.out.println("Teste: UsuarioErrado - Título da página: " + valorDaPagina);
               Xerxes.findElement(INPUT_USUARIO).clear();
          } catch (Exception e) {
               System.err.println("Erro no teste UsuarioErrado: " + e.getMessage());
               e.printStackTrace();
          }
     }

     public void SenhaErrada() {
          try {
               Envio_O_Dado(INPUT_SENHA, SENHA_ERRADA);
               ClicoNoElemento(BOTAO_ENTRAR);

               String valorDaPagina = EsperoEstarVisivel(TITULO_LOGIN_FALHA).getText();
               Assert.assertEquals(valorDaPagina, "Usuário e/ou senha inválidos");

               System.out.println("Teste: SenhaErrada - Título da página: " + valorDaPagina);
          } catch (Exception e) {
               System.err.println("Erro no teste SenhaErrada: " + e.getMessage());
               e.printStackTrace();
          }
     }

     public void UsuarioCerto() {
          try {
               Envio_O_Dado(INPUT_USUARIO, USUARIO_CERTO);
               ClicoNoElemento(BOTAO_ENTRAR);

               String valorDaPagina = EsperoEstarVisivel(TITULO_LOGIN_FALHA).getText();
               Assert.assertEquals(valorDaPagina, "Usuário e/ou senha inválidos");

               System.out.println("Teste: UsuarioCerto - Título da página: " + valorDaPagina);
               Xerxes.findElement(INPUT_USUARIO).clear();
          } catch (Exception e) {
               System.err.println("Erro no teste UsuarioCerto: " + e.getMessage());
               e.printStackTrace();
          }
     }

     public void SenhaCerta() {
          try {
               Envio_O_Dado(INPUT_SENHA, SENHA_CERTA);
               ClicoNoElemento(BOTAO_ENTRAR);

               String valorDaPagina = EsperoEstarVisivel(TITULO_LOGIN_FALHA).getText();
               Assert.assertEquals(valorDaPagina, "Usuário e/ou senha inválidos");

               System.out.println("Teste: SenhaCerta - Título da página: " + valorDaPagina);
          } catch (Exception e) {
               System.err.println("Erro no teste SenhaCerta: " + e.getMessage());
               e.printStackTrace();
          }
     }

     // Fluxo: Executa todos os testes de falha de login 5 vezes
     public void FazerLoginFalha() {
          int i = 1;
          while (i <= 5) {
               System.out.println();
               System.out.println(i + "° bloco de execução:");

               // Testes de login incorreto
               UsuarioErradoSenhaErrada();
               UsuarioCertoSenhaErrada();
               UsuarioErradoSenhaCerta();
               UsuarioErrado();
               SenhaErrada();
               UsuarioCerto();
               SenhaCerta();

               i++;
          }
     }
}