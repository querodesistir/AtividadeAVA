import java.util.Scanner;
import java.util.ArrayList; 
public class Estudante{
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private ArrayList<Double> notas;
    public int i;
    public double val;
    public Estudante(String nome, ArrayList<Double> notas, int i, double val){
        this.nome = nome;
        this.notas = notas;
        this.i = 0;
        this.val = val;
    }
     
    public void setNot(){
        this.notas = notas;
    }

    public void InsereNotas(){
        if(notas.size() > 5){
      System.out.println("Informe as cinco notas do "+nome);
      for(i =0 ;i < 5; i++){ 
      System.out.println("nota "+(i+1)+": ");
      val = scanner.nextDouble();
      notas.add(val);
    }
        }
    }
}
