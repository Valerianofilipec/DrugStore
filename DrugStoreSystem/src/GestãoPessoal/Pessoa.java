package GestãoPessoal;

/**
 *
 * @author Valeriano Filipe Calológio
 */
public class Pessoa {
    /*
     * Atributos
    */
    private String nome;
    
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
