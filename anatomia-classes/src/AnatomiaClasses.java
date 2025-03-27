public class AnatomiaClasses {
    public static void main(String[] args) {
        System.out.print("Olá, tudo bem?");

            String Br = "Brasil"
            double PI = 3.14
            int ESTADOS_BRASILEIRO = 27
            int ANO_2000 = 2000

            // Declaração inválida de variáveis
            int numero&um = 1; //os únicos símbolos permitidos são _ e $
            int 1numero = 1; //uma variável não pode começar com números
            int numero um = 1; //não pode ter espaço no nome da variável
            int long = 1; // long faz parte das palavras reservadas da linguagem

            // Declaração válida de variáveis 
            int numero$um = 1;
            int numero1 = 1;
            int numeroum = 1;
            int longo = 1;

                //Não Recomendado - JAVA BEANS
                double salMedio; // variável abreviada
                String emails = "aluno@escola.com"; // se referir a uma string só, deve ser email
                String myName = "Ana"; // se o idioma é pr-BR, manter

                //Recomendado - JAVA BEANS
                Double salarioMedio;
                String email = "aluno@escola.com";
                String [] emails = {"aluno@escola.com","prof@escola.com"};
                String meuNome = "Ana";

            // Estrutura

            Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)

                //ex
                int idade = 23;
                double altura = 1.62;
                Dog spike; // aqui a variável spike não tem valor


                String meuNome = "Beatriz";				
                int anoFarbicacao = 2022;    
                boolean verdadeira = true;    
                anoFarbicacao = 2018;

        // Métodos
        TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

            //ex
            int somar (int numeroUm, int numero2)
            String formatarCep(long cep)

                String primeiroNome = "Beatriz";
				String segundoNome = "Bernardes";
				String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
				System.out.println(nomeCompleto);
				
				public static String nomeCompleto (String primeiroNome, String segundoNome) {
				   
				    return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
				}
        
        // Indentação
        
                //sem
                int mediaFinal = 3;
			    if(mediaFinal<6)
			    System.out.println("REPROVADO");
			    else if (mediaFinal==6)
			    System.out.println("PROVA MINERVA");
			    else
                System.out.println("APROVADO"); 

                //com
                int mediaFinal = 3;
                if(mediaFinal<6)
                    System.out.println("REPROVADO");
                else if (mediaFinal==6)
                    System.out.println("PROVA MINERVA");
                else
                    System.out.println("APROVADO"); 

     }
 }     


        



