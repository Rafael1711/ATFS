package Pages;

import org.junit.Assert;

import static Locators.Useful_Constants_Locators.*;
import static Locators.Vazamento_De_Sessao_Email_Locators.*;

public class VazamentoDeSessaoEmailPage extends UsefulConstants {
     LoginPage LoginPageObject = new LoginPage();

     public void vazamentoSessao() {
          try {
               // 1) Fazer login
               LoginPageObject.fazerLogin();

               // 2) Abrir a tela de alterar senha
               ClicoNoElemento(MENU_DISCENTE);
               ClicoNoElemento(ALTERAR_SENHA);
               MudardePopup();

               // 3) Capturar a URL atual do popup
               String urlCapturada = Xerxes.getCurrentUrl();
               System.out.println("URL capturada do popup: " + urlCapturada);

               // 4) Fechar o modal
               ClicoNoElemento(BOTAO_FECHAR);

               // 5) Voltar para a janela principal e deslogar
               MudardePopup(); // retorna para janela original
               ClicarBotaoSair();

               // 6) Sem fechar o navegador: navegar até a URL capturada
               Xerxes.get(urlCapturada);

               // 7) Validar se o usuário ainda acessa indevidamente
               String valorDaPagina = EsperoEstarVisivel(USUARIO_ESPERADO).getText();
               Assert.assertTrue(valorDaPagina.contains("Francisco Rafael Barbosa de Sousa"));

               System.out.println("Teste: vazamentoSessao - SUCESSO");
          } catch (Exception e) {
               System.err.println("Erro no teste vazamentoSessao: " + e.getMessage());
               e.printStackTrace();
          }
     }
}
