package Pages;

import org.openqa.selenium.Keys;
import java.util.List;
import static Locators.Capturando_Contas_Locators.*;
import static Locators.Useful_Constants_Locators.*;

public class CapturandoContasPage extends UsefulConstants {
    LoginPage LoginPageObject = new LoginPage();

    public void CapturarContas() throws InterruptedException {
        int i = 1;

        // 1) Gera todas as permutações possíveis de e-mails com base no nome do usuário de teste
        List<String> emails = gerarEmails(DESTINATARIO_TESTE);

        // 2) Para cada e-mail gerado, executar o fluxo de captura e envio de phishing
        for (String email : emails) {
            System.out.println(i + "º permutação: " + email);

            // 3) Fazer login no sistema
            LoginPageObject.fazerLogin();

            // 4) Acessar tela de alterar senha
            ClicoNoElemento(ALTERAR_SENHA);
            MudardePopup();

            // 5) Substituir o campo de e-mail pelo e-mail gerado
            EsperoEstarVisivel(CAMPO_EMAIL).clear();
            Envio_O_Dado(CAMPO_EMAIL, email);

            // 6) Salvar alteração e validar mensagem de sucesso
            ClicoNoElemento(BOTAO_ALTERAR_DADOS);
            VerificoTitulo(TITULO_SUCESSO_ALTERAR_DADOS);

            // 7) Fechar o popup de confirmação
            ClicoNoElemento(BOTAO_FECHAR);

            // 8) Fechar e reiniciar o navegador para simular nova sessão
            close();
            Thread.sleep(500);
            start();

            // 9) Fazer login novamente
            LoginPageObject.fazerLogin();

            // 10) Acessar a área de mensagens
            ClicoNoElemento(MENSAGEM);
            ClicoNoElemento(ENVIAR_MENSAGEM);

            // 11) Inserir destinatário e confirmar seleção no autocomplete
            EsperoEstarVisivel(CAMPO_DESTINATARIO).sendKeys(NOME_USUARIO_TESTE);
            Thread.sleep(1500);
            EsperoEstarVisivel(CAMPO_DESTINATARIO).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

            // 12) Inserir o assunto da mensagem
            Envio_O_Dado(CAMPO_TEXTO_ASSUNTO, TEXTO_ASSUNTO);

            // 13) Alterar o corpo para HTML
            ClicoNoElemento(OPCAO_HTML);
            MudardePopup();

            // 14) Inserir o texto de phishing no editor HTML
            Envio_O_Dado(POPUP_HTML, TEXTO_MENSAGEM_PHISHING);

            // 15) Confirmar atualização do HTML
            ClicoNoElemento(BOTAO_ATUALIZAR_HTML);
            MudardePopup();

            // 16) Enviar a mensagem
            ClicoNoElemento(BOTAO_ENVIAR_MENSAGEM);

            // 17) Validar se a URL corresponde à de mensagem enviada
            VerificoUrl(URL_MENSAGEM_ENVIADA);

            // 18) Sair do sistema
            ClicarBotaoSair();

            // 19) Incrementar contador de permutação
            i++;
        }
    }
}