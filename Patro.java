public class Patro{
    private int vali;
    private String marca;
    
    Patro(int vali, String marca){
        this.vali = vali;
        this.marca = marca;
    }
       public void setvali(int vali){
       this.vali = vali;
   }
    public void setmarca(String marca){
       this.marca = marca;
   }
     public int getvali(){
       return vali;
   }
    public String getmarca(){
       return marca;
   }
   
   public void mostrapat(){
       System.out.println("valor do patrocinio: " + vali + " da marca:" + marca); 
   }
}