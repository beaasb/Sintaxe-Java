public class Metodos {
    public static void main(String[] args) {

        somar(int n1, int n2){}

        abrirConexao(){}

        concluirProcessamento(){}

        findById(int id){}

        calcularImprimir(){} //ele calcula ou imprime??

    public double somar(int num1, int num2){
        //LOGICA - FINALIDADE DO MÉTODO
        return ...;
    }

    public void imprimir(String texto){
        //LOGICA - FINALIDADE DO MÉTODO
        //AQUI NÃO PRECISA DO RETURN POIS NÃO SERÁ RETORNADO NENHUM RESULTADO    
    }

    //throws Exception: indica que o método ao ser utilizado poderá gerar uma exceção
    public double dividir(int dividendo, int divisor) throws Exception{}

    //este método não pode ser visto por outras classes no projeto
    private void metodoPrivado(){}

    //alguns equívocos estruturais
    public void validar(){
        //este método deveria retornar algum valor, no caso boolean (true ou false)
    }

    public void calcularEnviar(){
        //um método deve representar uma únida responsabilidade
    }

    public void gravarCliente(String nome, String cpf, Integer telefone, ...){
        //este método tem a finalidade de gravar info de um cliente, pq não criar um 
        //obj cliente e passar como parâmetro? veja abaixo
    }

    public void gravarCliente(Cliente cliente){}
    //ou
    public void gravar(Cliente cliente){}
    }
}
