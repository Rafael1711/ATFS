# Projeto de Automação de Testes Funcionais no SIGAA/UERN

Esse projeto teve como objetivo automatizar testes funcionais no SIGAA da UERN, utilizando Selenium integrado coma linguagem Java.
O projeto foi realizado como parte do Trabalho de Conlcusão de Curso, para obter o título de Bacharelado em Ciência da Computação,
À data da conclusão, o SIGAA/UERN encontrava-se na versão 3.36.3, então todos os scripts aqui publicados funcionaram em sua completude nessa cenário. 
A medida em que o Sistema for sendo atualizado, há uma grande chance de configurações adicionais serem necessáarias para continuar o uso dos script automatizados.

## Requisitos

Antes de executar o projeto, é necessário ajustar algumas configurações:

1. **Baixar o ChromeWebDriver compatível com sua versão do Chrome**
2. **Ter o Java instalado na sua máquina**
    O projeto foi realizado com a versão 22
3. **Ajustar o caminho do WebDriver**  
   Ajuste o caminho do driver do navegador no arquivo UsefulConstants:
   System.setProperty("webdriver.chrome.driver", "C:\\Documents\\ATFS\\src\\Drive\\chromedriver.exe");
   Ajuste o caminho entre aspas de acordo com a localização da pasta do projeto na sua máquina
4. **Ajustar o caminho da imagem de fundo**
   Ajuste o caminho da imagem de fundo no arquivo ChamadaDePaginas: 
   ImageIcon imageIcon = new ImageIcon("C:\\Documents\\ATFS\\Img_Fundo\\sigaa.png");
   Ajuste o caminho entre aspas de acordo com a localização da pasta do projeto na sua máquina
5. **Informar seu usuário e senha no arquivo Login_Locators**
6. **Ajustar nome que é verificado na emissão do histórico**
   Ajuste o nome do histórico que é verificado no arquivo Emitir_Historico_Locators
   Isso é necessário pois o nome do arquivo do histórico é gerado de acordo com a matrícula do usuário logado
7. **Ajustar nome que é verificado na declaração de vínculo**
   Ajuste o nome da declaração de vínculo que é verificada no arquivo Emitir_Declaracao_Vinculo_Locators
   Isso é necessário pois o nome do arquivo da declaração de vínculo é gerada de acordo com a matrícula do usuário logado

## Dúvidas?
Entre em contato pelo telefone ou e-mail abaixo: 
Telefone: 84 9 9610 - 5756
E-mail: frbs1711@gmail.com
