public class Piloto extends Pessoa{
   private int vitorias;
   private Equip equipe;
   
   Piloto(String nome, int idade, String nacio,int vitorias, Equip equipe){
       super(nome, idade, nacio);
       this.vitorias = vitorias;
       this.equipe = equipe;
   }
   
   public void setVict(int vitorias){
       this.vitorias = vitorias;
   }
   
    public int getVict(int vitorias){
       return vitorias;
   }
   public Equip getNum(){
       return equipe;
   }
   
   public void mostravic(){
   System.out.println("Vitórias totais do piloto:" + vitorias);
   }

}