## MICROSSERVIÇOS ##

São uma abordagem de arquitetura na qual o software é composto de pequenos serviços independentes que se comunicam entre si e são organizados de acordo com seus dominos de negócio.(Como API/CRUD de cursos que era responsavel por cuidar da parte de curso, coo pagamento, cadastro de aluno..) 
- Com Microsserviços, separamos o projeto em partes, cada uma responsavel por uma função, basicamente, como pagamento, cadastro...
- São Autonomos cada serviço pode ser desenvolvido, escalado e implantado sem interfeir em outros serviços. Podendo subir aplicação sem interferis nos outros.
- Autonomos Não é necessár compartilhar nenhum código e a comunicação acontece por meio de chamadas as APIS(Consumindo API)(SINCRONAS) e passa a informação pra outro sistema que vai consumir essa aplicação, assim como o sistema passa a informação pra vc consumir.
Forma assíncrona faz n tratamentos e leva mais tempo para obter a resposta. não fazendo sentido pela demora, a nivel performance e usabilidade.
- Especialistas - Cada serviço é desenhado para resolver um problea especifico, se começar a ser necessário ter outras responsabilidades, é indicado que se crie um novo serviço.
- Resilientes - A independência do serviço aumenta a resiliêcia a falhas na arquitetura, se um deles tiver algum problema, só afetará alguma parte do fluxo.

## Boas Praticas ##
- Estabilidade - Um microsserviço considerado estável é aquele que durante o desenvolvimento, deploy, inclusão de novas tecnologias e desativação de outros serviços não resulta em instabilidade do ecossistemas de microsserviços que ele faz parte
- Confiabilidade Um microsserviço confiável é aquele que outros microsserviços daquele ecossistema podem confiar.
- Ter um ciclo de desenvlvimento padronizado(para se proteger de más práticas de desenvolvimento)
- Código é submetido a testes de unidade, integração, e2e, regras de coverage(o tanto que um teste é coberto por testes) etc.

- Teste de unidade é quando testamos pequenas partes do código, como uma camada, um método..

- Teste de integração com banco de dado, mensageria.

- Teste coverage ex "Solar exige 50% das classes cobertas por testes", não tendo, não passa(pipeline)
- Java - Jacoco coverage rule, bloqueia desde o build, quando roda o build da aplicação, não permite se não tiver cobertura minima. 

Teste e2e - teste de ponta ponta na aplicação, como da controller até as requisições no front.

- Microsserviços ser estável e confiavel, possuir seus clientes(serviços que o consomem) conhecidos.Conseguir identificar se é necessário disponibilizar mais maquina para ver se atende bem a performance da aplicação.

- Tolerância a falhas - Nunca deve existir uma parte do ecossistema de microsserviços que uma falha pode parar todo o fluxo. Também não deve haver qualquer parte individual dentro da arquitetura de um microsserviço que possa derrubar o microsserviço todo quando ele falhar. Come por exeplo receber um status 400, 500 ou até uma mensagem de erro ou estourar um exception, mas não deve parar aplicação por isso

- Microsserviços devem suportar falhas internas (do próprio microsserviço) e flhas externas (que acontecem em outras camadas e serviços externos).

- Tolerante a falhas quando é testado por meio de testes de carga e teste de caos.
- Carga - basicamente é quando a gente estressa o nosso serviço (como numa black-friday) aumentando os testes com a estimativa de aumento de vendas.

- Caos - derrubar coisas que seu sistema precisa, como banco, kafta, derrubar aplicação que seu serviço enviará requisição, para ver como o microsserviço reage em uma situação como essa. Se vai ter um sistema de tentativa, se vai tratar o erro ou se vai ficar sentado chorando.

- Tolerante a falhas - Quando existe um procedimento padrão para tratar incidentes dentro das equipes.

- Monitoramento - É possivel acompanhar o que esta acontecendo e o que já aconteceu com os seus microsserviços. Quando o logging reflete com precisão os estados passados do microsserviço

- Seus dashboards são fáceis de interpretar e possuem todas as métricas principais. Prometheus/Grafano/ 
- Possuir bons alertas
- Os logs não contêm informações sensíveis e só informações relevantes.

- Documentação
As pessoas que entram na equipe desse servico consegue ter acesso a esse histórico de informações, sabe coo reparar o ambiente, deseho da arquitetura, dentre outras informações essenciais para que possa iniciar o desenvolvimento? Uma equipe que quiser saber desse microsserviço vai conseguir entender o papel dele somente com a documentação?
- README -  são regras básicas como rodar o projeto etc. Atuali-se a documentação.
- Documentação de como funciona a regra de negócio usamos o readme quando não temos outra ferramenta de documentação.
- Diagrama da arquitetura - Arquitetra de contatos das pessoas responsáveis, guia de bordo de desenvolvimento. Como fazer para rodar, se roda outras coisas como doc compose, usar local stack, ou se apenas pela subri a classe main
collections - para evitar escrever HTTP//URL

- Qual o papel dele/em que parte esse microsserviço entra dentro daquele ecossistema.
Todas as pessoas da equipe devem saber do conteudo e pessoas de fora devem compreender.

- Segurança 
Algumas regras básicas quando falamos de segurança de aplicações:
- Usar autenticação via jwt com tempo de expiração curto. - colocar tempo razoavel para conseguir fazer aplicação.

- Fazer uso de APIs gateways

