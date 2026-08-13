import java.util.ArrayList;

public class Equip{
   private String nomee;
   private int funano;
   private ArrayList<Patro> patroc;
   
   Equip(String nomee, int funano, ArrayList<Patro> patroc){
       this.nomee = nomee;
       this.funano = funano;
       this.patroc = patroc;
   }
   
      public void setnomee(String nomee){
       this.nomee = nomee;
   }
   
   public void setfuna(int funano){
       this.funano = funano;
   }
   
public void setparoc(ArrayList<Patro> patroc){
       this.patroc = patroc;
   }
   
    public int getfuna(int funano){
       return funano;
   }
      public String getnomee(String nomee){
       return nomee;
   }
   public ArrayList<Patro> getnomee(){
       return patroc;
   }
   
   public void mostraequi(){

       String imprimir = nomee + " criada em " + funano + " possuí seguintes patrocinadores: ";
       
       for (Patro p : patroc) {
      imprimir += p.getmarca() + " | ";
    }
       
       System.out.println(imprimir);
   }
}