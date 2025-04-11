# Java Documentation

Meu resumo sobre a aula de [Java Docs](https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/documentacao).

Uma das grandes vantagens da linguagem Java é sua documentação oficial, completa e bem estruturada desde as primeiras versões. Ela permite que programadores explorem todos os recursos da linguagem organizados por **pacotes**, **classes** e **métodos**, mesmo sem precisar escrever uma linha de código.

Segundo o site oficial, dominar essa documentação é essencial para o crescimento na área. Por isso, **entender e saber consultar a documentação da linguagem e dos frameworks utilizados nos projetos** é considerado um requisito fundamental para quem deseja se tornar um desenvolvedor de nível avançado.

Abaixo, temos o link da documentação de uma das principais classes da linguagem Java:

👉 [Documentação da classe String – Oracle](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)

## Tags
A documentação das classes em Java fornece uma visão completa sobre o propósito, funcionamento e estrutura de cada classe, incluindo seus métodos, atributos, construtores e comportamentos esperados.

A **Java Documentation (JavaDoc)** utiliza *tags* específicas para organizar essas informações de forma padronizada, facilitando o entendimento por parte dos desenvolvedores. Através dessa documentação, é possível obter:

- **Descrição da classe**: o que ela faz e qual seu propósito.
- **Construtores**: como instanciar objetos da classe.
- **Métodos**: o que cada método faz, seus parâmetros e o valor retornado.
- **Atributos (ou campos)**: variáveis associadas à classe.
- **Exceções**: quais erros podem ser lançados e quando.
- **Relacionamentos**: heranças, interfaces implementadas e classes relacionadas.

Abaixo, uma tabela com algumas das principais tags utilizadas no JavaDoc:

| **Tag**         | **Descrição**                                                                 |
|------------------|--------------------------------------------------------------------------------|
| `@author`        | Informa o autor da classe ou método.                                           |
| `@version`       | Especifica a versão do código.                                                 |
| `@param`         | Descreve os parâmetros de entrada de um método.                               |
| `@return`        | Indica o valor retornado por um método.                                        |
| `@throws` / `@exception` | Indica quais exceções podem ser lançadas por um método.           |
| `@see`           | Aponta para classes ou métodos relacionados.                                  |
| `@since`         | Indica a versão da linguagem em que o recurso foi introduzido.                |
| `@deprecated`    | Indica que a classe ou método não deve mais ser usado.                        |

Com a prática, saber ler e interpretar essa documentação se torna uma ferramenta poderosa no desenvolvimento em Java.

## Tipos de comentários

| **One Line** | **Mult Line** | Documentation | 
| --- | --- | --- |
| `// Olá, eu sou um comentário em uma única linha` | /* Olá, <br/> * Eu sou um comentario <br/> * que posso ser mais detalhado <br/> * quando necessário <br/> */ | /** <br/> * Estas duas estrelinhas acima <br/> * é para identificar que você <br/> * pretende elaborar um comentário <br/> * a nível de documentação. <br/> * Que incrível !!! <br/> */

> [!WARNING]
> Um comentário não possui a finalidade de **amenizar** um algoritmo não estruturado conforme as convenções da linguagem.

```java
/*
 * Este método foi elaborado as pressas
 * por isso eu abrevei o nome das variáveis
 * mas olha, ele tem a finalidade somar ou  multiplicar
 * dois números
 */
public int somaMultiplica (int n, int x, String m){
    int r = 0; // r é igual ao resultado
    if (m == "M"){ // M= multiplicação
        r= n * x;
    }else{
        // se não soma mesmo
        r = n + x;
    }
    return r;
}
```

## JavaDoc
Javadoc é um gerador de documentação criado pela [Sun Microsystems](https://pt.wikipedia.org/wiki/Sun_Microsystems) para documentar a [API](https://pt.wikipedia.org/wiki/API) dos programas em [Java](https://pt.wikipedia.org/wiki/Linguagem_de_programa%C3%A7%C3%A3o_Java), a partir do [código-fonte](https://pt.wikipedia.org/wiki/C%C3%B3digo-fonte). O resultado é expresso em [HTML](https://pt.wikipedia.org/wiki/HTML). É constituído, basicamente, por algumas marcações muitos simples inseridas nos comentários do programa.

Este sistema é o padrão de documentação de classes em Java, e muitas dos [IDEs](https://pt.wikipedia.org/wiki/Ambiente_de_desenvolvimento_integrado) desta linguagem irão automaticamente gerar um Javadoc em [HTML](https://pt.wikipedia.org/wiki/HTML).

Criando nossa documentação no formato html para disponibilizar via web.
```java
// No terminal execute o comando abaixo
javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
```

[Resultado](https://github.com/beaasb/Sintaxe-Java/blob/main/java-doc/docs/index.html)

