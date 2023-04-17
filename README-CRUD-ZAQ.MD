## CRUD ##
CRUD (Create, Read, Update, Delete) é um acrônimo para as maneiras de se operar em informação armazenada. É um mnemônico para as quatro operações básicas de armazenamento persistente. CRUD normalmente refere-se a operações executadas em um banco de dados ou base de dados, mas também pode aplicar-se para funções de alto nível de uma aplicação, como exclusões reversíveis, onde uma informação não é realmente deletada, mas é marcada como deletada através do estado.

- Create, Read, Update, Delete), é
A abreviação CRUD mapeada para o padrão ISO/SQL:

Create	INSERT
Read (Retrieve)	SELECT
Update	UPDATE
Delete (Destroy)	DELETE
__________________________________________________

~ API
API significa Application Programming Interface (Interface de Programação de Aplicação). No contexto de APIs, a palavra Aplicação refere-se a qualquer software com uma função distinta. A interface pode ser pensada como um contrato de serviço entre duas aplicações. Esse contrato define como as duas se comunicam usando solicitações e respostas. A documentação de suas respectivas APIs contém informações sobre como os desenvolvedores devem estruturar essas solicitações e respostas.

- A arquitetura da API geralmente é explicada em termos de cliente e servidor. A aplicação que envia a solicitação é chamada de cliente e a aplicação que envia a resposta é chamada de servidor. Então, no exemplo do clima, o banco de dados meteorológico do instituto é o servidor e o aplicativo móvel é o cliente. 

- APIs REST
Essas são as APIs mais populares e flexíveis encontradas na Web atualmente. O cliente envia solicitações ao servidor como dados. O servidor usa essa entrada do cliente para iniciar funções internas e retorna os dados de saída ao cliente. Vejamos as APIs REST em mais detalhes abaixo.

- REST significa Transferência Representacional de Estado. REST define um conjunto de funções como GET, PUT, DELETE e assim por diante, que os clientes podem usar para acessar os dados do servidor. Clientes e servidores trocam dados usando HTTP.

- A principal característica da API REST é a ausência de estado. A ausência de estado significa que os servidores não salvam dados do cliente entre as solicitações. As solicitações do cliente ao servidor são semelhantes aos URLs que você digita no navegador para visitar um site. A resposta do servidor corresponde a dados simples, sem a renderização gráfica típica de uma página da Web.
_____________________________________________________
# As APIs REST oferecem quatro principais benefícios:

1. Integração 
As APIs são usadas para integrar novas aplicações com sistemas de software existentes. Isso aumenta a velocidade de desenvolvimento porque cada funcionalidade não precisa ser escrita do zero. Você pode usar APIs para aproveitar o código existente.

2. Inovação 
Setores inteiros podem mudar com a chegada de uma nova aplicação. As empresas precisam responder rapidamente e oferecer suporte à rápida implantação de serviços inovadores. Elas podem fazer isso fazendo alterações no nível da API sem precisar reescrever todo o código.

3. Expansão
As APIs apresentam uma oportunidade única para as empresas atenderem às necessidades de seus clientes em diferentes plataformas. Por exemplo, a API de mapas permite a integração de informações de mapas por meio de sites, Android, iOS etc. Qualquer empresa pode fornecer acesso semelhante aos seus respectivos bancos de dados internos usando APIs gratuitas ou pagas.

4. Facilidade de manutenção
A API atua como um gateway entre dois sistemas. Cada sistema é obrigado a fazer alterações internas para que a API não seja afetada. Dessa forma, qualquer alteração futura de código feita por uma parte não afetará a outra parte.
___________________________________________
# Códigos de status de respostas HTTP
Os códigos de status das respostas HTTP indicam se uma requisição HTTP foi concluída corretamente. As respostas são agrupadas em cinco classes:

Respostas de informação ( 100- 199),
Respostas de sucesso ( 200- 299), CREATE, GET
Redirecionamentos ( 300- 399)
Erros do cliente ( 400- 499)
Erros do servidor ( 500- 599).
_______________________________________________
# CRIAR PROJETO Sping
- Site start spring io

Dependencias

- Spring Web, para construir aplicações, end-points,
Tem servidor Tomcat por padrão.

- Spring Data JPA, BASEADO NO HIBERNATE,
- H2Database banco de dados relacional em memória.

___________________________________________________
# Importantes
Saber sobre APIS
Testes unitarios jUnit
Segurança JWT