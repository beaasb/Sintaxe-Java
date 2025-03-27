public class Operadores {
    public static void main(String[] args) {
        
        //Atribuição

        String nome = "Beatriz";
        int idade = 25;
        double pesa = 64;
        char sexo = 'F';
        boolean doadorOrgao = true;
        //Date dataNascimento = new Date();
    
        //Aritméticos

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 27;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

            //Concatenação 
            String nomeCompleto = "LINGUAGEM" + " " + "JAVA";
            System.out.println(nomeCompleto);

            String concatenacao  = "?";

            concatenacao = 1+1+1+"1";

            System.out.println(concatenacao);

            concatenacao = 1+"1"+1+1;

            System.out.println(concatenacao);

            concatenacao = 1+"1"+1+"1";

            System.out.println(concatenacao);

            concatenacao = "1"+1+1+1;

            System.out.println(concatenacao);

            concatenacao = "1"+(1+1+1);

            System.out.println(concatenacao);
            
        // Unários
            //Negativo
            int numero = 5;
            numero = - numero;
            System.out.println(numero);

            //Positivo
            numero = numero * -1;
            System.out.println(numero);

            //Incrementação
            numero = numero + 2;
            System.out.println(numero);
            numero++;

            //Decrementação
            numero = numero - 2;
            System.out.println(numero);
            numero--;

            //Negação
            boolean variavel = true;
            System.out.println(!variavel);
            System.out.println(variavel);
            variavel = !variavel;
            System.out.println(variavel);
             
            
        // Ternários
        int a, b;
        a = 5;
        b = 6;
            
                         
            //ex de condicional com if/else
            String resultado = "";
            if (a==b)
                resultado = "verdadeiro";
            else
                resultado = "falso";
            
            String resultado = a==b ? "verdadeiro" : "falso";
            System.out.println(resultado); 
        
        
        // Relacionais
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 > numero2)
        System.out.println("a condição é falsa"); // essa mensagem não aparece pois é falsa dentro da condição
        
        if(numero1 < numero2)
        System.out.println("a condição é verdadeira");

        System.out.println("numero1 é igual ao numero2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente ao numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior que o numero2? " + simNao);
        

        String nomeUm = "Beatriz";
        String nomeDois = new String("Beatriz");
        System.out.println(nomeUm.equals(nomeDois));
        

        //Lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;
    
        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }
        System.out.println("fim");
    }       

}
