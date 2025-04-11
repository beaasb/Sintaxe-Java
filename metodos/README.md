# Métodos
> Todas as ações das aplicações são consideradas métodos.

Meu resumo sobre a aula de [Métodos](https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/metodos).

Uma classe é composta por atributos e métodos. Os atributos, geralmente, são variáveis que armazenam diferentes tipos de dados. Já os métodos são funções ou sub-rotinas que definem os comportamentos da classe e operam sobre seus atributos.

Esses critérios não são obrigatórios, mas são altamente recomendados, pois seguir convenções de nomenclatura torna o código mais legível e facilita o trabalho colaborativo entre programadores.
Para métodos, as convenções são:

- O nome deve ser um verbo, indicando uma ação.
- Deve seguir o padrão *camelCase*, ou seja, começar com letra minúscula e usar maiúsculas apenas no início de palavras subsequentes.

Exemplos de nomes de métodos:
```java
somar(int n1, int n2){}
abrirConexao(){}
concluirProcessamento() {}
findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada
calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade
```
> [!IMPORTANT]
> Não existe em Java o conceito de métodos globais. Todos os métodos devem SEMPRE ser definidos dentro de uma classe.

- Utilizado para somente uma função de cada vez;
```java
public void calcularEnviar(){
  //um método deve representar uma únida responsabilidade
}
```
- Não existem métodos globais, devem SEMPRE ser definidos dentro de uma classe;
- Caso o método não retorne nenhum valor, deve ser representado pela palavra-chave void
```java
//alguns equívocos estruturais
  public void validar(){
    //este método deveria retornar algum valor, no caso boolean (true ou false)
}
```

### Antes de criar o métodos, faça essas perguntas:

- Qual a proposta principal do método?
```java
public void gravarCliente(String nome, String cpf, Integer telefone, ...){
  //este método tem a finalidade de gravar info de um cliente, pq não criar um 
  //obj cliente e passar como parâmetro? veja abaixo
}
public void gravarCliente(Cliente cliente){}
//ou
public void gravar(Cliente cliente){}
}
```
- Qual o tipo de retorno esperado após executar o método?
```java
public void imprimir(String texto){
  //LOGICA - FINALIDADE DO MÉTODO
  //AQUI NÃO PRECISA DO RETURN POIS NÃO SERÁ RETORNADO NENHUM RESULTADO    
}
```
- Quais os parâmetros serão necessários para execução do método?
```java
public double somar(int num1, int num2){
  //LOGICA - FINALIDADE DO MÉTODO
return ...;
}
```		
- O método possui o risco de apresentar alguma exceção?
```java
//throws Exception: indica que o método ao ser utilizado poderá gerar uma exceção
  public double dividir(int dividendo, int divisor) throws Exception{}
```
- Qual a visibilidade do método?
```java
//este método não pode ser visto por outras classes no projeto
  private void metodoPrivado(){}
```
## Exemplo SmartTV
[CODE]()
