public class Engenheiro extends Pessoa{
    private int id;
    private Piloto pipoca;
    
    Engenheiro(String nome, int idade, String nacio, int id, Piloto pipoca){
        super(nome, idade, nacio);
        this.id = id;
        this.pipoca = pipoca;
    }
    
     public void setid(int id){
       this.id = id;
   }
   
      public void setpi(Piloto pipoca){
       this.pipoca = pipoca;
   }
   
    public int getid(){
       return id;
   }
   
   public Piloto getpi(){
       return pipoca;
   }
   
public void mostraeng(){
    System.out.println("o eng." + nome + "(" + id + ") pertence ao Piloto: " + pipoca.getNome());
}
}