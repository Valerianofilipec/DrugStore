package GestaoPessoal;

import static drugstoresystem.DrugStoreSystem.registoHistorico;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Valeriano Filipe Calológio
 */
public class Empregado{
    /*
     * Atributos
     */
    //Nome Completo
    private String nome;
    // 'M'=Masculino, 'F'=Feminino
    private String sexo;
    //Número de Empregado
    private String numeroEmpregado;
    //Tipo de Trabalho ou Trabalho exercido
    private String cargo;
    // Variavel para identificar se o Funcionário está ativo ou não
    private boolean eAtivo;
    //Senha
    private String senha;
    //Empregados Ativos, que pode ser identificado com o nº de funcionario
    private static int Empregados_Ativos = 2;

    /*
     * Metodos Construtores
     */
    Empregado(String nome, String genero, String departamento, String senha, String nFuncionario){
        //chamada de funções modificadores
        porNome(nome);
        porSexo(genero);
        porCargo(departamento);
        this.senha = senha;
        porNumeroEmpregado(nFuncionario);
        eAtivo = true;
        Empregados_Ativos++; 
    }
    
    
    /*
     * Metodos Acessores(obter) e Modificadores(por) 
     */
    public String obterNome() {
        return nome;
    }
    public void porNome(String nome) {
        this.nome = nome;
    }
    public String obterSexo(){
        return sexo;
    }
    public void porSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String obterNumeroEmpregado() {
        return numeroEmpregado;
    }

    public void porNumeroEmpregado(String numeroEmpregado) {
        this.numeroEmpregado = numeroEmpregado;
    }

    public String obterFuncao() {
        return cargo;
    }

    public void porCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String obterCargo(){
        return cargo;
    }

    public static int obterEmpregados_Ativos(){
        return Empregados_Ativos;
    }
    public void porSenha(String senha){
        this.senha = senha;
    }
    
    public String obterSenha(){
        return senha;
    }
    public String obterEAtivo(){
        if (eAtivo)
            return "true";
        else
            return "false";
    }
}
