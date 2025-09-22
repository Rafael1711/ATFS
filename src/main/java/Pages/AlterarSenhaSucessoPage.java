package Pages;

import java.util.Set;
import static Locators.Alterar_Senha_Sucesso_Locators.*;
import static Locators.Useful_Constants_Locators.*;
import static Locators.Login_Locators.SENHA_CERTA;

public class AlterarSenhaSucessoPage extends UsefulConstants {
    LoginPage LoginPageObject = new LoginPage();

    public void AlterarSenha() {
        // 1) Fazer login
        LoginPageObject.fazerLogin();

        // 2) Abrir a tela de alterar senha
        ClicoNoElemento(ALTERAR_SENHA);

        // 3) Guardar a janela original
        String originalWindow = Xerxes.getWindowHandle();
        Set<String> allWindows = Xerxes.getWindowHandles();

        // 4) Trocar para o popup de alterar senha
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                Xerxes.switchTo().window(windowHandle);
                break;
            }
        }

        // 5) Clicar em "Alterar senha" dentro do popup
        EsperoEstarVisivel(CLICO_EM_ALTERAR_SENHA).click();

        // 6) Preencher os campos de senha
        Envio_O_Dado(CAMPO_SENHA_ATUAL, SENHA_CERTA);
        Envio_O_Dado(CAMPO_NOVA_SENHA, SENHA_CERTA);
        Envio_O_Dado(CAMPO_REPETIR_NOVA_SENHA, SENHA_CERTA);

        // 7) Confirmar a alteração
        ClicoNoElemento(BOTAO_ALTERAR_DADOS);

        // 8) Validar se a mensagem de sucesso foi exibida
        VerificoTitulo(TITULO_SUCESSO_ALTERAR_DADOS);

        // 9) Fechar o popup
        ClicoNoElemento(BOTAO_FECHAR);

        // 10) Encerrar o navegador
        UsefulConstants.close();
    }
}