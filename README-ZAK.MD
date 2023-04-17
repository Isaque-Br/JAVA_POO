## 🔖 Sobre


## 💻 Conteúdo programático

ORIENTAÇÃO A OBJETO

 ~ ABSTRAÇÃO
 Expor métodos que queremos que outra classe acesse e obrigar que a classe siga aqueles comportamentos especificos, ocultar o que não precisa ser exposto e criar comportamento padrão para que todas que usem as classes, tenham esse determinado comportamento 

 ~ Criando via interface. Como um molde, um esuqeleto.
Implementando, terá que utilizar os métodos obrigada/contrato. 
@Override subscreve (personaliza)o comportamento da interface(conta)método
_____________________________________________________
Estanciar o objeto é chama-lo na classe princial(main).
Atributos são caracteristicas e métodos são funções/comportamentos.
_____________________________________________________
~ Encapsulamento 
Private só na classe ou com getter/set
Public todas as classes que quiserem
Protected dentro do pacote.

Getter and Setter
- Get para pegar/acessar um valor
- Set para setar/modificar
______________________________________________________
~ Herança
Subclasse, herda métodos, atributos e comportamentos da classe principal/vulgo superclasse ou classe principal.
Parecido com Interface. Sendo interface sendo mais usado. + Clean. Situações que Subclsse são mais utilizado, pois na herança vc pode implementar o metodo e na interface vc nao pode implementar.

Herdando fazendo extends após o nome da classe. Herdando atributos, sendo obrigado a implementa-los, gerando um construtor com retorno super se referindo os atributos da classe principal.

Chamando o método em outra classe: 
@Override
public void(){          //autocomplete
    super.codar();
}
______________________________________________________
~ Construtores
São as caracteristicas para o objeto, pegando os atributos e transformando em um construtor.

public PessoaDesenvolvedora(String nome, String stack, Double salario);
______________________________________________________
 - Método void não tem retorno mas pode imprimir.
 ____________________________________________________


- Implements é só para interface, implementa os comportamentos do contrato
- extends só para herança, herdando, extendendo o comportamento de outra classe.
_____________________________________________________
~ Polimorfirsmo varias formas.

//polimorfismo -> mesma parte do programa de várias formas diferentes para necessidades diferentes
- Sobrecarga  variações do mesmo método com a lista de argumentos e retornos diferentes,
- Sobrecarga é o mesmo nome tipo de retorno e assinatura diferente, com sobrecarga personalizamos o tipo de retorno e também a assinatura(parametros)só que temos que usar o mesmo nome
- VANTAGEN reutilizar códgo

- Subescrita através da palavra extends
 como um botão que liga e desliga.
 Conseguimos ter a implementação diferente porém com  mesmo nome e tipo de retorno.
 - VANTAGEN NÃO ter duplicação de código
 ____________________________________________________

 ~ Ferramentas
 - GitHub
 Ao pressionar a tecla . do teclado dentro do repositorio, abre-se o projeto no Vs.coode
 