package GestaoPessoal;

/**
 *
 * @author Valeriano Filipe Calológio
 */
public class Pessoa {
    /*
     * Atributos
    */
    //Nome Completo
    private String nome;
    // 'M'=Masculino, 'F'=Feminino
    private String Sexo;
    
    
    /*
     * Metodos Acessores(obter) e Modificadores(por)
     */
    
    public String obterNome() {
        return nome;
    }
    public void porNome(String nome) {
        this.nome = nome;
    }
    
    /*
     * Metodos Construtores
     * 
     */
    public void Pessoa(String nome){
        porNome(nome);
    }
}
