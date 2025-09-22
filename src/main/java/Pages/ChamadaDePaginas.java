package Pages;

import javax.swing.*;
import java.awt.*;
import static Pages.UsefulConstants.*;

public class ChamadaDePaginas {
    public static void main(String[] args) throws InterruptedException {
        String opcao;

        do {
            // Painel customizado para imagem de fundo
            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Documents\\ATFS\\Img_Fundo\\sigaa.png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

                    // Sobreposição semi-transparente
                    Color overlayColor = new Color(20, 39, 67, 213);
                    g.setColor(overlayColor);
                    g.fillRect(0, 0, getWidth(), getHeight());
                }
            };

            panel.setLayout(new BorderLayout());

            JLabel label = new JLabel(
                    "<html>" +
                            "<div style='text-align: center; font-size: 18px; font-weight: bold;'>AUTOMAÇÃO DE TESTES FUNCIONAIS NO SIGAA/UERN, V3.46.3:</div>" +
                            "<div style='text-align: center; font-size: 18px; font-weight: bold;'>UMA ABORDAGEM COM SELENIUM E JAVA</div>" +
                            "<br>" +
                            "<div style='text-align: center; font-size: 15px; font-weight: bold;'>Escolha um teste a ser realizado:</div>" +
                            "<br>" +
                            "<table style='width: 100%; text-align: center; font-size: 14px;'>" +
                            "   <tr>" +
                            "       <td style='padding: 10px;'>1 - Fazer Login</td>" +
                            "       <td style='padding: 10px;'>2 - Bug Log-Off Usuário</td>" +
                            "       <td style='padding: 10px;'>3 - Phishing de Contas</td>" +
                            "   </tr>" +
                            "   <tr>" +
                            "       <td style='padding: 10px;'>4 - Emitir Histórico</td>" +
                            "       <td style='padding: 10px;'>5 - Declaração De Vínculo</td>" +
                            "       <td style='padding: 10px;'>6 - Atestado De Matrícula</td>" +
                            "   </tr>" +
                            "   <tr>" +
                            "       <td style='padding: 10px;'>7 - Relatório De Notas</td>" +
                            "       <td style='padding: 10px;'>8 - Índices Acadêmicos</td>" +
                            "       <td style='padding: 10px;'>9 - Alterar Senha</td>" +
                            "   </tr>" +
                            "   <tr>" +
                            "       <td style='padding: 10px;'>10 - Comprovante De Matrícula</td>" +
                            "       <td style='padding: 10px;'>11 - Relatório De Avaliação Institucional</td>" +
                            "       <td style='padding: 10px;'>12 - Spam de Mensagens</td>" +
                            "   </tr>" +
                            "   <tr>" +
                            "       <td style='padding: 10px;'>13 - Validação do captcha no login</td>" +
                            "       <td style='padding: 10px;'>14 - Vazamento de sessão do e-mail</td>" +
                            "   </tr>" +
                            "</table>" +
                            "<br>" +
                            "<div style='text-align: center; font-size: 15px;'>Informe sua opção:</div>" +
                            "</html>",

                    JLabel.CENTER
            );

            label.setForeground(Color.WHITE);
            label.setFont(new Font("Verdana", Font.BOLD, 20));
            panel.add(label, BorderLayout.CENTER);

            opcao = JOptionPane.showInputDialog(null, panel, null, JOptionPane.PLAIN_MESSAGE);

            if (opcao == null) {
                break;
            }

            switch (opcao) {
                case "1":
                    try {
                        start();
                        LoginPage loginPage = new LoginPage();
                        loginPage.fazerLogin();
                        UsefulConstants.ClicarBotaoSair();
                        loginPage.FazerLoginFalha();
                    } catch (Exception e) {
                        System.err.println("Erro no teste Fazer Login: " + e.getMessage());
                        e.printStackTrace();

                    } finally {
                        close();
                    }
                    break;

                case "2":
                    try {
                        start();
                        BugLogOffUsuarioPage bugLogOff = new BugLogOffUsuarioPage();
                        bugLogOff.UserLogOff();
                    } catch (Exception e) {
                        System.err.println("Erro no teste Bug Log-Off Usuário: " + e.getMessage());
                        e.printStackTrace();
                    } finally {
                        close();
                    }
                    break;

                case "3":
                    try {
                        start();
                        CapturandoContasPage capturandoContas = new CapturandoContasPage();
                        capturandoContas.CapturarContas();
                    } catch (Exception e) {
                        System.err.println("Erro no teste Capturar Contas: " + e.getMessage());
                        e.printStackTrace();
                    } finally {
                        close();
                    }
                    break;

                case "4":
                    try {
                        start();
                        EmitirHistoricoPage historico = new EmitirHistoricoPage();
                        historico.EmitirHistorico();
                        historico.ExcluirHistorico();
                    } catch (Exception e) {
                        System.err.println("Erro no teste Emitir Histórico: " + e.getMessage());
                        e.printStackTrace();
                    } finally {
                        close();
                    }
                    break;

                case "5":
                    try {
                        start();
                        EmitirDeclaracaoVinculoPage declaracao = new EmitirDeclaracaoVinculoPage();
                        declaracao.EmitirDeclaracaoDeVinculo();
                        declaracao.ExcluirDeclaracaoVinculo();
                    } catch (Exception e) {
                        System.err.println("Erro no teste Declaração de Vínculo: " + e.getMessage());
                        e.printStackTrace();
                    } finally {
                        close();
                    }
                    break;

                case "6":
                    try {
                        start();
                        EmitirAtestadoDeMatriculaPage atestado = new EmitirAtestadoDeMatriculaPage();
                        atestado.EmitirAtestadoDeMatricula();
                        atestado.ExcluirAtestadoDeMatricula();
                    } catch (Exception e) {
                        System.err.println("Erro no teste Atestado de Matrícula: " + e.getMessage());
                        e.printStackTrace();
                    } finally {
                        close();
                    }
                    break;

                case "7":
                    try {
                        start();
                        EmitirRelatorioDeNotasPage relatorioNotas = new EmitirRelatorioDeNotasPage();
                        relatorioNotas.EmitirRelatorioDeNotas();
                        relatorioNotas.ExcluirRelatorioDeNotas();
                    } catch (Exception e) {
                        System.err.println("Erro no teste Relatório de Notas: " + e.getMessage());
                        e.printStackTrace();
                    } finally {
                        close();
                    }
                    break;

                case "8":
                    try {
                        start();
                        EmitirIndicesAcademicosPage indices = new EmitirIndicesAcademicosPage();
                        indices.EmitirIndicesAcademicos();
                        indices.ExcluirIndicesAcademicos();
                    } catch (Exception e) {
                        System.err.println("Erro no teste Índices Acadêmicos: " + e.getMessage());
                        e.printStackTrace();
                    } finally {
                        close();
                    }
                    break;

                case "9":
                    try {
                        start();
                        AlterarSenhaSucessoPage alterarSenha = new AlterarSenhaSucessoPage();
                        alterarSenha.AlterarSenha();
                    } catch (Exception e) {
                        System.err.println("Erro no teste Alterar Senha: " + e.getMessage());
                        e.printStackTrace();
                    } finally {
                        close();
                    }
                    break;

                case "10":
                    try {
                        start();
                        EmitirComprovanteDeMatriculaPage comprovante = new EmitirComprovanteDeMatriculaPage();
                        comprovante.EmitirComprovanteDeMatricula();
                        comprovante.ExcluirComprovanteDeMatricula();
                    } catch (Exception e) {
                        System.err.println("Erro no teste Comprovante de Matrícula: " + e.getMessage());
                        e.printStackTrace();
                    } finally {
                        close();
                    }
                    break;

                case "11":
                    try {
                        start();
                        EmitirRelatorioDeAvaliacaoInstitucionalPage avaliacao = new EmitirRelatorioDeAvaliacaoInstitucionalPage();
                        avaliacao.EmitirRelatorioDeAvaliacaoInstitucional();
                        avaliacao.ExcluirRelatorioDeAvaliacaoInstitucional();
                    } catch (Exception e) {
                        System.err.println("Erro no teste Relatório de Avaliação Institucional: " + e.getMessage());
                        e.printStackTrace();
                    } finally {
                        close();
                    }
                    break;

                case "12":
                    try {
                        start();
                        SpamDeMensagemPage spam = new SpamDeMensagemPage();
                        spam.SpamDeMensagem();
                    } catch (Exception e) {
                        System.err.println("Erro no teste Spam de Mensagens: " + e.getMessage());
                        e.printStackTrace();
                    } finally {
                        close();
                    }
                    break;

                case "13":
                    try {
                        start();
                        ValidacaoCaptchaPage captcha = new ValidacaoCaptchaPage();
                        captcha.ValidacaoCaptcha();
                    } catch (Exception e) {
                        System.err.println("Erro no teste Validação do captcha: " + e.getMessage());
                        e.printStackTrace();
                    } finally {
                        close();
                    }
                    break;

                case "14":
                    try {
                        start();
                        VazamentoDeSessaoEmailPage vazamento = new VazamentoDeSessaoEmailPage();
                        vazamento.vazamentoSessao();
                    } catch (Exception e) {
                        System.err.println("Erro no teste Vazamento de Sessão E-mail: " + e.getMessage());
                        e.printStackTrace();
                    } finally {
                        close();
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opção inválida! Por favor, tente novamente.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE
                    );
                    break;
            }
        } while (true);
    }
}