# Terminal e Argumentos

Meu resumo sobre a aula de [Terminal e Argumentos](https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/terminal-e-argumentos).

Nem sempre executamos nossos programas **Java pela IDE** — afinal, não faria sentido pedir que os clientes instalem o Eclipse ou VSCode só para rodar um sistema. Com a JVM configurada, é possível criar um executável e distribuir o programa para qualquer sistema operacional.
Neste caso, vamos aprender a executar um programa Java pelo terminal, como o **MS-DOS** ou o terminal do VSCode, criando uma classe chamada `MinhaClasse.java` com o seguinte código:
			
```java			
public class MinhaClasse{
	public static void main(String[] args) {
		System.out.println("Oi, fui executado pelo Terminal");
}
```
> [!TIP]
> Observe que nosso projeto Java criado por um IDE, ele terá uma pasta chamada **bin**. É nesta pasta que ficarão os arquivos **.class**, o nosso `bytecode`.

![image](https://github.com/user-attachments/assets/7331e8c5-a327-47f1-b9e3-5e261e88b7c5)

Mesmo usando uma IDE, nós sempre precisaremos identificar aonde se encontram as classes do nosso projeto, no meu caso está em: **C:\estudos\dio-trilha-java-basico\java-terminal**.

![image](https://github.com/user-attachments/assets/ba184e41-e12c-4ee1-84df-b4052f7503f1)

## Terminal

Vamos ilustrar como executar uma classe, depois de compilada, sem precisar usar a IDE.

- Abra o MS-DOS ou Power Shell

- Localize o diretório do seu projeto: **`cd C:\estudos\dio-trilha-java-basico\java-terminal`**

- Acesse a pasta **** bin: **`cd bin`**

- Agora digite o comando: **`java MinhaClasse`** (nome da sua classe sem a extensão **.class**)

  ![image](https://github.com/user-attachments/assets/8520b4d9-2578-466e-8dae-29d099740f9e)

## Argumentos

Ao executarmos uma classe que possui o método `main`, podemos passar argumentos por meio de um array de Strings (`String[] args`). Esses parâmetros são fornecidos diretamente na linha de comando, após o nome da classe a ser executada.

**Exemplo**:
```java			
java MinhaClasse argumento1 argumento2
```				
Dentro do código, esses valores podem ser acessados pelo array `args`, como em `args[0]`, `args[1]`, etc. Isso permite personalizar a execução do programa conforme os dados fornecidos.
```java	
public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
```
**Passando valores aos argumentos pelo VsCode**

![image](https://github.com/user-attachments/assets/031ccde8-e4d3-41a6-aaf0-cdfedf531138)
![image](https://github.com/user-attachments/assets/521f6d50-39df-4180-941a-f3a2a16cac39)

**Executando o programa agora no terminal**
```
cd C:\estudos\dio-trilha-java-basico\java-terminal
cd bin

java AboutMe GLEYSON SAMPAIO 28 1.58
```

## Scanner
```java
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");        
    }
}
```
![image](https://github.com/user-attachments/assets/35edae5b-b006-45b1-a9bb-e70c8f2dfa61)
