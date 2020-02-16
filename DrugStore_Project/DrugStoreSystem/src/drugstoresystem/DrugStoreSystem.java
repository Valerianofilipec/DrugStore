/*
 * Programação Orientada a Objetos
 * Trabalho Prático
 * Projecto DrugStoreSystem
 */
package drugstoresystem;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Valeriano Filipe Calológio "20160937"
 */
public class DrugStoreSystem {
    //Criação ou Enstaciar ficheiro.csv
    public static File registoAtividade = new File("RegistoAtividade.csv");
    // ficheiro de regito historico de funcionarios ativos (assim como os não ativos)
    public static File registoHistorico = new File("RegistoHistorico.csv");
    
    
    public static void validarFicheiro(File x){
        //Arquivo existe
        if (x.exists()){
            //tentando ler arquivo
            try{
                //String para a leitura das linhas de ficheiro
                String linhaLida = new String();
                Scanner leitor = new Scanner(x);
                /*
                do{
                    System.out.println(leitor.nextLine());
                }while(leitor.hasNext());
                */  
            }
            catch(FileNotFoundException ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }//Se nao existir
        else
          //JOptionPane.showMessageDialog(null,"Arquivo nao existe!","Erro",0);
            try (Formatter saida = new Formatter(x.getName())) {
                JOptionPane.showMessageDialog(null,"Arquivo '"+x.getName()+"' criado!","Arquivo",1);
                //Escrevendo do Ficheiro
               
            }
            //mostrando erro em caso se nao for possivel gerar arquivo
            catch(Exception erro){
              JOptionPane.showMessageDialog(null,"Arquivo nao pode ser gerado!","Erro",0);
              System.exit(0);
            }
    }
    public static void main(String[] args) {
        // Abri a tela Login, que por fim da acesso a tela principal e seus modulos apresentados
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
    }  
}
