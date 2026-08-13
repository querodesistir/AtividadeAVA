public class Carro{
    private int numc;
    private int posico;
    private Piloto piloto;
    
    Carro(int numc, int posico, Piloto piloto){
        this.numc = numc;
        this.posico = posico;
        this.piloto = piloto;
    }
    
   public void setNum(int numc){
        this.numc = numc;
    }
   public void setposi(int posico){
       this.posico = posico;
   }
   public void setpilo(Piloto piloto){
        this.piloto = piloto;
    }
   public int getNum(int numc){
       return numc;
   }
   public int getposi(int posico){
       return posico;
   }
   public Piloto getpilo(){
       return piloto;
   }
   
   public void mostracar(){
       System.out.println(numc + " na posição " + posico + " piloto " + piloto.getNome());
   }
}