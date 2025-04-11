# Operadores

Meu resumo sobre a aula de [Operadores](https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/operadores).

| Operador | Comparação |
| --- | --- |
| == | Igual |
| != | Diferente |
| < | Menor |
| > | Maior |
| <= | Menor Igual |
| >= | Maior Igual |

Os símbolos especiais possuem significados próprios na linguagem de programação e estão ligados a operações específicas.  
Em um curso de programação, aprendemos que um programa é um conjunto de instruções lógicas que geram um resultado. Desde as primeiras linhas de código, é comum lidar com a entrada de dados do usuário, processá-los com alguma lógica e, por fim, exibir o resultado.

## Atribuição `(=)`

O operador de atribuição é usado para definir ou atualizar o valor de uma variável. Em Java, uma variável é declarada especificando seu tipo, nome e, opcionalmente, um valor inicial, utilizando o operador de atribuição `(=)`.

```java
String nome = "Beatriz";
int idade = 25;
double pesa = 64;
char sexo = 'F';
boolean doadorOrgao = true;
Date dataNascimento = new Date();
```
	
## Aritméticos `(+, -, *, /)`

O operador aritmético é usado para realizar cálculos entre valores numéricos, podendo compor expressões matemáticas simples ou mais complexas.

```java
double soma = 10.5 + 15.7;
int subtracao = 113 - 27;
int multiplicacao = 20 * 7;
int divisao = 15 / 3;
int modulo = 18 % 3;
double resultado = (10 * 7) + (20 / 4);
```
		
> [!NOTE]
>O operador de adição (+), quando utilizado em variáveis do tipo string, realizará a 'concatenação de textos'

```java
String nomeCompleto = "LINGUAGEM" + " " + "JAVA"; 
System.out.println(nomeCompleto); // LINGUAGEM JAVA
String concatenacao  = "?";
concatenacao = 1+1+1+"1";
System.out.println(concatenacao); // 31
concatenacao = 1+"1"+1+1;
System.out.println(concatenacao); // 1111
concatenacao = 1+"1"+1+"1";
System.out.println(concatenacao); // 1111
concatenacao = "1"+1+1+1;
System.out.println(concatenacao); // 1111
concatenacao = "1"+(1+1+1);
System.out.println(concatenacao); // 13
```
	            
## Unários
Esses operadores são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

- `(+)` **Operador unário de valor positivo** - números são positivos sem esse operador explicitamente;
```java
int numero = 5;
numero = numero * -1;
System.out.println(numero); // imprime 5
```	
- `(-)` **Operador unário de valor negativo** - nega um número ou expressão aritmética;
```java		
numero = - numero;
System.out.println(numero); // imprime -5
```		
- `(++)` **Operador unário de incremento de valor** - incrementa o valor em 1 unidade;
```java		
numero = numero + 2;
System.out.println(numero); // imprime 7
numero++;
System.out.println(numero); // imprime 6 ou
System.out.println(++numero);
```
- `(--)` **Operador unário de decremento de valor** - decrementa o valor em 1 unidade;
```java	
numero = numero - 2;
System.out.println(numero); // imprime 3
numero--;
System.out.println(numero); // imprime 4  ou
System.out.println(--numero);
```
- `(!)` **Operador unário lógico de negação** - nega o valor de uma expressão booleana;
```java	
boolean variavel = true;
System.out.println(!variavel); // imprime false
System.out.println(variavel); // imprime true > a variável ainda é verdadeira
variavel = !variavel;
System.out.println(variavel); // imprime false
```

> [!CAUTION]
> Muito cuidado com ordem de precedência dos operadores unários!

## Ternários `(?, :)` 
Como se fosse uma condição IF normal, mas de uma forma em que toda sua estrutura seja escrita em uma única linha

Sintaxe
`<expressão condicional>` **`?`** `<caso condição for true>` **`:`** `<caso condição for false>`
```java
int a, b;
a = 5;
b = 6;            
/*             
//ex de condicional com if/else
String resultado = "";
if (a==b)
  resultado = "verdadeiro";
else
  resultado = "falso";
*/
String resultado = a==b ? "verdadeiro" : "falso";
System.out.println(resultado); // falso
```
> [!TIP]
> O operador ternário é aplicado para qualquer tipo de valor.

## Relacionais `(==, !=, >, >=, <, <=)`

Os operadores relacionais comparam duas variáveis ou expressões, verificando relações como igualdade, diferença, maior ou menor valor. O resultado dessas comparações é sempre um valor booleano: verdadeiro `(true)` ou falso `(false)`.
```java
int numero1 = 1;
int numero2 = 2;
boolean simNao = numero1 == numero2;
	
System.out.println("numero1 é igual ao numero2? " + simNao);
	
if(numero1 > numero2)
System.out.println("a condição é falsa"); // essa mensagem não aparece pois é falsa dentro da condição
	        
if(numero1 < numero2)
System.out.println("a condição é verdadeira");
	
simNao = numero1 != numero2;
System.out.println("numero1 é diferente ao numero2? " + simNao);
simNao = numero1 > numero2;
System.out.println("numero1 é maior que o numero2? " + simNao);
	
String nomeUm = "Beatriz";
String nomeDois = "Beatriz";
System.out.println(nomeUm == nomeDois); // true
	
String nomeUm = "Beatriz";
String nomeDois = new String("Beatriz");
System.out.println(nomeUm == nomeDois); // false
```

> [!TIP]
> O correto com **string/objeto** é utilizar o `.equals()`, pois ele analisa o conteúdo
```java		
String nomeUm = "Beatriz";
String nomeDois = new String("Beatriz");
System.out.println(nomeUm.equals(nomeDois)); // true
```
	
## Lógicos `(&&, ||)`

Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.
```java
boolean condicao1 = true;
boolean condicao2 = false;
	    
if(condicao1 && condicao2){                                // && > E
  System.out.println("as duas condições são verdadeiras"); // não imprime nada
}
if(condicao1 || condicao2){                             // || > OU
  System.out.println("uma das condições é verdadeira"); // imprime
}
	        System.out.println("fim");
```

