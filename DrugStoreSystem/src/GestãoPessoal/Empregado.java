package GestãoPessoal;

/**
 *
 * @author Valeriano Filipe Calológio
 */
public class Empregado extends Pessoa {
    /*
     * Atributos
     */
    //Secções e ou Departamentos. Para permitir o acesso ao módulo verifica-se o atributo booleano 
    private boolean RH, Stock, Recursos, Contabilidade, Vendas;
    //Número de Empregado
    private int numeroEmpregado;
    //Tipo de Trabalho ou Trabalho exercido
    private String funcao;  
    //Empregados Ativos, que pode ser identificado com o nº de funcionario
    private static int Empregados_Ativos = 0;
    /**
     * @return  Empregados_Ativos
     */
    public static int obterEmpregados_Ativos() {
        return Empregados_Ativos;
    }
    
    /*
     * Metodos Acessores(obter) e Modificadores(por) 
     */
    public boolean obterRH() {
        return RH;
    }

    public void porRH(boolean RH) {
        this.RH = RH;
    }

    public boolean obterStock() {
        return Stock;
    }

    public void obterStock(boolean Stock) {
        this.Stock = Stock;
    }

    public boolean obterRecursos() {
        return Recursos;
    }

    public void porRecursos(boolean Recursos) {
        this.Recursos = Recursos;
    }

    public boolean obterContabilidade() {
        return Contabilidade;
    }

    public void porContabilidade(boolean Contabilidade) {
        this.Contabilidade = Contabilidade;
    }

    public boolean obterVendas() {
        return Vendas;
    }

    public void porVendas(boolean Vendas) {
        this.Vendas = Vendas;
    }

    public int obterNumeroEmpregado() {
        return numeroEmpregado;
    }

    public void porNumeroEmpregado(int numeroEmpregado) {
        this.numeroEmpregado = numeroEmpregado;
    }

    public String obterFuncao() {
        return funcao;
    }

    public void porFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    /*
     * Metodos Construtores
     */
    public void Empregado(){
        /*
         * !!!
         * Codigo para entrada de dados para poder criar um trabalhador
         * !!!
         * 
         * 
         * 
         * 
         */
        //????? super("Desconhecido");
        Empregados_Ativos++;
        //mudar "Desconhecido" para variavel de entrada stream
        
        
    }
}
