public class TiposVariaveis {
    public static void main(String[] args) throws Exception {        

        //Declaração de Variáveis

        int idade; // tipo "int", nome "idade", com nenhum valor atribuído
        int anoFabricacao = 2021; // tipo "int", nome "anoFabricacao", valor "2021"
        double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor "2.500"
        
        
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo > string
        long cpf = 9876542109L; // deve colocar 'L' no final. se começar com zero, talvez tenha que ser outro tipo > string
        float pi = 3.14F; // deve colocar 'F' no final, para não o compilador não confundir com outra variável
        double salario = 1275.33;


        //Tipagem Forte
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
        short numeroCurto2 = numeroNormal;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;


        // Constantes 

        // a variável pode ser alterada
		double VALOR_DE_PI = 3.14;
		VALOR_DE_PI = 10.75;
			
		// com o 'final' o valor da variável não pode ser alterado
		final double VALOR_DE_PI = 3.14;
        VALOR_DE_PI = 10.75;

    }
}


