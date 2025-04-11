# Anatomia de Classes

Meu resumo sobre a aula de [Anatomia de Classes](https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/anatomia-das-classes).


- **99,9%** das nossas classes iniciarão com `public class`;
- Toda classe precisa de nome, exemplo `MinhaClasse`;
- O nome do arquivo deve ser idêntico ao nome da classe pública;
- Após o nome, definir o corpo `{ }` , onde iremos compor nossas classes com atributos e métodos.

<img align="center" alt="Exemplo de anatomia" height="200" width="500" src="https://felipe-aguiar.gitbook.io/~gitbook/image?url=https%3A%2F%2F2590158637-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252F2qZwrhEqcOsERZF1L25d%252Fuploads%252Fgit-blob-04c8f2a4b8867634496c5c0183c1553190605aa6%252Fimage%2520%2812%29%2520%281%29%2520%281%29%2520%281%29%2520%281%29.png%3Falt%3Dmedia&width=768&dpr=4&quality=100&sign=fa04a580&sv=2">

- É de suma importância que agora você consiga se localizar dentro do conjunto de chaves `{ }` existentes em sua classe.

- **Recomenda-se que somente uma classe possua o método** `main`, responsável por iniciar todo o nosso programa.

- O método `main` recebe seu nome `main`, sempre terá a visibilidade `public`, será difinido como `static`, não retornará nenhum valor com `void` e receberá um parâmetro do tipo array de caracteres `String[]`.

## Padrão de nomenclatura

- **Arquivo .java**: Todo arquivo .java deve começar com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra deve também ser maiúscula, exemplo:

`Calculadora.java`, `CalculadoraCientifica.java`

- **Nome da classe no arquivo**: A classe deve possuir o mesmo nome do arquivo.java, exemplo:

```java
// arquivo CalculadoraCientifica.java

public class CalculadoraCientifica {

}
```

- **Nome de variável**: sempre em letra minúscula, a não ser que seja composta > camelCase.

```java
// Ex de variável final:
    String Br = "Brasil"
    double PI = 3.14
    int ESTADOS_BRASILEIRO = 27
    int ANO_2000 = 2000
```
> [!IMPORTANT]
> **Para declarar uma variável nós podemos utilizar caracteres, números e símbolos, porém devemos seguir algumas regras da linguagem**.

- Deve conter apenas letras, _ (underline), $ ou os números de 0 a 9;
- Deve obrigatoriamente se iniciar por uma letra (preferencialmente), _ ou $, jamais com número;
- Deve iniciar com uma letra minúscula (boa prática – ver abaixo);
- Não pode conter espaços;
- Não podemos usar palavras-chave da linguagem;
- O nome deve ser único dentro de um escopo

```java
// Declação inválida de variáveis

int numero&um = 1; //Os únicos símbolos permitidos são _ e $
int 1numero = 1;    //Uma variável não pode começar com númerico
int numero um = 1; //Não pode ter espaço no nome da variável
int long = 1; //long faz parte das palavras reservadas da linguagem
 
// Declaração válida de veriáveis

int numero$um = 1;
int numero1 = 1;
int numeroum = 1;
int longo = 1;
```

- ***Declarar uma variável em Java segue sempre a seguinte estrutura***:

```java
// Estrutura

Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)

// Exemplo

int idade = 23;
double altura = 1.62;
Dog spike; //observe que aqui a variável spike não tem valor, é normal

// ex2
public class MinhaClasse {
				    
	public static void main (String [] args) {
				
		String meuNome = "Beatriz";				
		int anoFarbicacao = 2022;				
		boolean verdadeira = true;				
		anoFarbicacao = 2018;
	}
}
```

## Java Beans

A linguagem Java sugere, através de convenções, formas de escrita universal para nossas classes, atributos, métodos e pacotes.

### Variáveis

Mais cedo já aprendemos algumas regras de declaração de variáveis, mas agora iremos conhecer algumas sugestões de de nomenclatura:

- Uma variável deve ser clara, sem abreviações ou definição sem sentido;
- Uma variável é sempre no singular, **exceto quando se referir a um array ou coleção**.
- Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.

#### Não recomendado

```java
double salMedio = 1500.23  //variável abreviada, o que dificulta a compreensão
String emails = "aluno@escola.com" //confuso se a variável seria um array ou único e-mail
String myName = "JOSEPH" //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não 
```

#### Recomendado

```java
double salarioMedio=1500.23;
String email ="aluno@escola.com";
String [] emails = {"aluno@escola.com","professor@escola.com"}
String meuNome = "JOSEPH" 
```

### Métodos

Os métodos deverão ser nomeados como verbos, através de uma mistura de letras minúsculas e maiúsculas. Em princípio todas as letras que compõem o nome devem ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta a partir da segunda palavra.

```java
somar(int n1, int n2){}
abrirConexao(){}
concluirProcessamento() {}
findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada
calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade
```

```java
//EX
public class MinhaClasse {
				    
	public static void main (String [] args) {
				       
		String primeiroNome = "Beatriz";
		String segundoNome = "Bernardes";
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
			 System.out.println(nomeCompleto);
	}
	public static String nomeCompleto (String primeiroNome, String segundoNome){
				   
	return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
	}
}
```

#### Características dos métodos 

- São funções definidas em uma **classe**;
- Descrevem os comportamentos ou as ações que os objetos da classe podem executar;
- Podem manipular dados de objetos, executar operações e retornar resultados;
- São executados somente quando são chamados;
- Cada método tem seu nome;
- Você pode passar dados para um método por meio de parâmetros;

##### Como chamar um método 
- Use o nome do método seguido por *parênteses* para chamá-lo;
- Por exemplo, chamamos o método cumprimentar() dentro do método main();

##### Tipos de métodos
- Métodos sem retorno, identificados com a palavra-chave `void`; 
- Métodos `protected`, que podem ser chamados por todas as classes que compõe um `package`; 
- Métodos `friendly`, que podem ser usados dentro da classe que o contém, assim como dentro de qualquer classe que tenha sido derivada dessa classe;

