package Pages;

import org.openqa.selenium.Keys;
import java.util.List;
import static Locators.Spam_De_Mensagem_Locators.*;
import static Locators.Useful_Constants_Locators.*;

public class SpamDeMensagemPage extends UsefulConstants {
    LoginPage LoginPageObject = new LoginPage();
    int i = 1;       // Contador de permutações de e-mails
    int count = 1;   // Contador de destinatários

    // Fluxo: Envio de mensagens em massa para testar spam
    public void SpamDeMensagem() throws InterruptedException {
        // 1) Gera todas as permutações possíveis de e-mails com base no nome do destinatário
        List<String> Lista_Emails = gerarEmails(DESTINATARIO_TESTE);

        // 2) Itera sobre cada e-mail gerado
        for (String email : Lista_Emails) {
            // 2.1) Faz login no sistema
            LoginPageObject.fazerLogin();

            // 2.2) Acessa a opção de alterar senha para atualizar o e-mail
            ClicoNoElemento(ALTERAR_SENHA);
            MudardePopup();

            // 2.3) Limpa o campo de e-mail e preenche com a permutação atual
            EsperoEstarVisivel(CAMPO_EMAIL).clear();
            Envio_O_Dado(CAMPO_EMAIL, email);

            // 2.4) Confirma alteração e valida o sucesso
            ClicoNoElemento(BOTAO_ALTERAR_DADOS);
            VerificoTitulo(TITULO_SUCESSO_ALTERAR_DADOS);
            ClicoNoElemento(BOTAO_FECHAR);

            // 2.5) Reinicia o navegador para garantir sessão limpa
            close();
            Thread.sleep(500);
            start();

            // 2.6) Faz login novamente após reiniciar o navegador
            LoginPageObject.fazerLogin();

            // 2.7) Acessa o menu de mensagens e inicia o envio
            ClicoNoElemento(MENSAGEM);
            ClicoNoElemento(ENVIAR_MENSAGEM);

            System.out.print("\n\n=================================================== " + i + "º Permutação de e-mail: " + email + " ===================================================\n\n");

            // 2.8) Insere 10 destinatários para a mensagem
            while (count <= 10) {
                Envio_O_Dado(CAMPO_DESTINATARIO, NOME_USUARIO_TESTE);
                Thread.sleep(1500);

                // Seleciona o destinatário sugerido pelo autocomplete
                EsperoEstarVisivel(CAMPO_DESTINATARIO).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
                Thread.sleep(500);

                // Adiciona destinatário à lista de envio
                ClicoNoElemento(ADD_DESTINATARIO);
                Thread.sleep(500);

                System.out.println(count + "º inserção do destinatário");
                count++;
            }

            System.out.print("===================================================");
            System.out.print("===================================================");
            System.out.print("\n\n");

            // 2.9) Preenche o assunto e o corpo da mensagem
            EsperoEstarVisivel(CAMPO_TEXTO_ASSUNTO).sendKeys(TEXT_ASSUNTO_SPAM, Keys.TAB, Keys.TAB, TEXT_MENSAGEM_SPAM);

            // 2.10) Envia a mensagem e valida a URL de sucesso
            ClicoNoElemento(BOTAO_ENVIAR_MENSAGEM);
            VerificoUrl(URL_MENSAGEM_ENVIADA);

            // 2.11) Faz logoff do usuário
            ClicarBotaoSair();

            // 2.12) Reseta contadores para a próxima permutação
            count = 1;
            i++;
        }
    }
}