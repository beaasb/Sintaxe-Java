# Tipos de Variáveis

Meu resumo sobre a aula de [Tipos de Variáveis](https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/variaveis).

## Tipos de Dados

No Java, existem algumas palavras reservadas para a representação dos tipos de dados básicos que precisam ser manipulados para a construção de programas.

> [!NOTE]
> **Os oito tipos primitivos em Java são:**
> 
> *int, byte, short, long, float, double, boolean e char* – esses tipos não são considerados objetos, e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória. (Memory stack)

### Tipos Primitivos

| Tipo | Memória | Valor Mínimo | Valor Máximo |
| :---  | :---  | :---  | :--- | 
| byte | 1 byte | -128 | 127 |
| short | 2 bytes | -32.768 | 32.767 |
| int | 4 bytes | -2.147.483.648 | 2.147.483.647 |
| long | 8 bytes | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.807 |

***Os tipos primitivos que podem conter partes fracionárias podem ser representados por dois tipos:***

| Tipo | Memória | Mínimo | Máximo | Precisão |
| :---  | :---  | :---  | :---  | :---  | 
| float | 4 bytes | -3,4028E + 38 | 3,4028E + 38 | 6 – 7 dígitos |
| double | 8 bytes | -1,7976E + 308 | 1,7976E + 308 | 15 dígitos |

## Declaração de Variáveis

Seguindo as convenções em linguagem de programação, toda variável é composta por: tipo de dados + identificação + valor atribuído.

A estrutura padrão para se declarar uma variável sempre é:

`<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>`

Exemplos abaixo:
```java
int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. 
int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.
```

> [!WARNING]
> Existem algumas peculiaridades a trabalhar com alguns tipos específicos
> 
```java
public class TipoDados {
	public static void main(String[] args) {
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;
	}
}
```
> [!IMPORTANT]
> Observe que o tipo long precisa terminar com L, o tipo float precisa terminar com F e alguns cenários do dia-a-dia podem estimular uma alteração de tipos de dados convencional.

Muitas das vezes criamos uma variável, definimos um valor correspondente, manipulamos esta variável e temos consciência de seu valor na aplicação.

> [!IMPORTANT]
> Java é fortemente "tipado"

Veja o cenário abaixo:
```java
short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = numeroNormal;
```
![image](https://github.com/user-attachments/assets/9aab76e5-efcc-468b-bb0a-646136f20436)

## Constantes

Em Java, uma variável é um espaço na memória identificado por um nome, que pode armazenar valores de um tipo específico e ser modificado ao longo do programa. Diferente de JavaScript, **Java** exige a declaração do tipo da variável. Já as constantes, definidas com `final`, são valores que não podem ser alterados após a atribuição e, por convenção, seus nomes são escritos em CAIXA ALTA.
```java
// a variável pode ser alterada
double VALOR_DE_PI = 3.14;
VALOR_DE_PI = 10.75;
			
// com o 'final' o valor da variável não pode ser alterado
final double VALOR_DE_PI = 3.14;
VALOR_DE_PI = 10.75; //Esta linha vai apresentar erro de compilação!
```
![image](https://github.com/user-attachments/assets/63dbbf69-a355-40c2-94c6-c6d2701254a9)

