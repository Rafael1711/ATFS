# Projeto de Automação de Testes Funcionais no SIGAA/UERN

Este projeto teve como objetivo automatizar **testes funcionais** no **SIGAA** da **UERN** utilizando **Selenium** integrado com a linguagem **Java**.

O projeto foi desenvolvido como parte do **Trabalho de Conclusão de Curso (TCC)** para a obtenção do título de **Bacharel em Ciência da Computação**.  
Na data de sua conclusão, o SIGAA/UERN estava na versão **3.46.3**, e todos os scripts foram testados e funcionaram corretamente nesse ambiente.  
Com futuras atualizações do sistema, pode ser necessário realizar ajustes adicionais para que os scripts continuem funcionando.

---

## Requisitos

Para rodar o projeto, é necessário configurar os seguintes itens:

1. **Chrome WebDriver**  
   - Baixe o WebDriver compatível com a versão do seu Google Chrome.

2. **Java**  
   - O projeto foi desenvolvido com **Java 22**. Certifique-se de tê-lo instalado.

3. **Configurações do WebDriver**  
   - No arquivo `UsefulConstants.java`, ajuste o caminho do driver do navegador:  
     ```java
     System.setProperty("webdriver.chrome.driver", "C:\\Documents\\ATFS\\src\\Drive\\chromedriver.exe");
     ```  
     Substitua o caminho entre aspas pela localização do driver em sua máquina.

4. **Imagem de fundo**  
   - No arquivo `ChamadaDePaginas.java`, ajuste o caminho da imagem de fundo:  
     ```java
     ImageIcon imageIcon = new ImageIcon("C:\\Documents\\ATFS\\Img_Fundo\\sigaa.png");
     ```  
     Substitua o caminho entre aspas pela localização correta da imagem em sua máquina.

5. **Credenciais de login**  
   - No arquivo `Login_Locators.java`, insira seu usuário e senha do SIGAA.

6. **Verificação do histórico**  
   - No arquivo `Emitir_Historico_Locators.java`, ajuste o nome do histórico que será verificado, já que o arquivo é gerado com base na matrícula do usuário logado.

7. **Verificação da declaração de vínculo**  
   - No arquivo `Emitir_Declaracao_Vinculo_Locators.java`, ajuste o nome da declaração de vínculo que será verificada, de acordo com a matrícula do usuário logado.

---

## Contato

Em caso de dúvidas, entre em contato:  

- **Telefone:** (84) 99610-5756  
- **E-mail:** frbs1711@gmail.com
