package Pages;

import org.openqa.selenium.Keys;
import static Locators.Bug_Log_Off_Usuario_Locators.*;

public class BugLogOffUsuarioPage extends UsefulConstants {
    LoginPage LoginPageObject = new LoginPage();

    public void UserLogOff() {
        // 1) Fazer login
        LoginPageObject.fazerLogin();

        // 2) Acessar o menu de turmas anteriores
        ClicoNoElemento(TURMAS_ANTERIORES);

        // 3) Expandir a primeira turma
        ClicoNoElemento(FLECHA_DA_PRIMEIRA_TURMA);

        // 4) Clicar na aba de participantes
        ClicoNoElemento(PARTCIPANTES);

        // 5) Selecionar o participante "Yuri"
        ClicoNoElemento(SELECT_MENSAGEM_YURI);

        // 6) Limpar o campo de destinatário e inserir destinatário errado
        EsperoEstarVisivel(CAMPO_DESTINATARIO).clear();
        Envio_O_Dado(CAMPO_DESTINATARIO, DESTINATARIO_ERRADO);

        // 7) Preencher o assunto
        Envio_O_Dado(CAMPO_ASSUNTO, TEXT_ASSUNTO);

        // 8) Preencher a mensagem
        Envio_O_Dado(CAMPO_MENSAGEM, TEXT_MENSAGEM);

        // 9) Clicar no botão de enviar mensagem
        ClicoNoElemento(BOTAO_ENVIAR);

        // 10) Fechar o popup de envio
        ClicoNoElemento(FECHAR_POPUP);

        // 11) Capturar o alerta gerado ao voltar para a home e aceitá-lo
        String alertText = UsefulConstants.CapturoAlerta(HOME, true);

        // 12) Validar se o alerta foi exibido e exibir no log
        if (alertText != null) {
            System.out.println("Alerta capturado com o texto: " + alertText);
        }
    }
}