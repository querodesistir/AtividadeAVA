import java.util.Scanner;
import java.util.ArrayList; 
public class Estudante{
    Scanner scanner = new Scanner(System.in);
    private double md;
    private String nome;
    private ArrayList<Double> notas;
    public int i;
    public double val;
    public Estudante(double md,String nome, ArrayList<Double> notas, int i, double val){
        this.md = 0;
        this.nome = nome;
        this.notas = notas;
        this.i = 0;
        this.val = val;
    }
     
    public void setNot(ArrayList<Double> notas){
        this.notas = notas;
    }
    public ArrayList<Double> getNotas(){
        return notas;
    }
    public void setMd(double md){
        this.md=md;
    }
    public double getMd(){
        return md;
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
    
    public double Calmd(){
        for(i =0 ;i < 5; i++){
            md = md + notas.get(i);
        }
        md = md/5;
        return md;
    }
}
