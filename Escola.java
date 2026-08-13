import java.util.Scanner;
import java.util.ArrayList; 

public class Escola{
    private ArrayList<Estudante> alunos;
    private ArrayList<Estudante> aprovados;
    private int cont;
    private int minimo;
    public Escola(ArrayList<Estudante> alunos, ArrayList<Estudante> aprovados, int cont, int minimo){
    this.alunos = alunos;
    this.aprovados = aprovados;
    this.cont = 0;
    this.minimo = minimo;
    }
    
    public void Veja(){
        for(Estudante estudante : alunos){
            if(estudante.getMd() > 6.0){
            cont++;
            System.out.println(estudante.getNome() + " foi aprovado!");
            }
            if(cont == 0){
                System.out.println("E todo mundo morreu :D ");
            }
        }
    }
}
