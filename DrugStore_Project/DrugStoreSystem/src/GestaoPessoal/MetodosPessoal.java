/*
 * Metodos do Modulo Gestao de Pessoal
 */
package GestaoPessoal;

/**
 *
 * @author Valeriano Filipe Calológio
 */
public interface MetodosPessoal {
    //Validar Dados, segundo o mecanismo de registo (*.cvs)
    public boolean validarLogin(String usuario,String senha);
    
    //Empregar: Criação de um conjunto de dados pessoais para cada novo Empregado
    public void criarEmpregado();
    
    //Atualização dos dados do Empregado
    public void editarEmpregado();
    
    //Demitir: Eliminação do Empregado assim como na lista de Ativos, mantendo o registo historico
    public void eliminarEmpregado();
    
    //Mecanismo de registo do inicio e fim da atividade diaria de cada Empregado.(Ficheiros *.csv)
    public void inciarAtividade();
    public void terminarAtividade();
}
