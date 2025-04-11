# Escopo

Meu resumo sobre a aula de [Escopo](https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/escopo).

O escopo define onde uma variável pode ser acessada dentro de um programa. Em Java, ele ***depende do bloco em que a variável foi declarada***. \
Uma variável é criada quando o código entra no bloco onde ela foi definida e deixa de existir ao sair desse bloco. Por isso, ela só pode ser usada dentro do seu escopo.\
Na estrutura de uma classe, os atributos são declarados no corpo principal e podem ser acessados por todos os métodos. Já variáveis declaradas **DENTRO DE UM MÉTODO** só existem dentro das chaves desse método.
Entender bem o escopo é essencial para evitar erros e garantir uma boa organização e funcionamento da aplicação.

```java
public class Conta {
	//variavel da classe conta
	double saldo=10.0;
	
	public void sacar(Double valor) {
		//variavel local de método
		double novoSaldo = saldo - valor;
	}
	public void imprimirSaldo(){
		//disponível em toda classe
		System.out.println(saldo);
		//somente o método sacar conhece esta variavel
		System.out.println(novoSaldo);
	
	}
	public double calcularDividaExponencial(){
		//variável local de método
		double valorParcela = 50.0;
		double valorMontante = 0.0; // começando a variável com valor zero
		for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
			//esta variável será reiniciada a cada execução for
			double valorCalculado = valorParcela * x;
			valorMontante = valorMontante + valorCalculado;
		}
		//escopo de fluxo
		//x e valorCalculado nunca estarão disponíveis fora do for
		
		return valorMontante;
	}
}
```
