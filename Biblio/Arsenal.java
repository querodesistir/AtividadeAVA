public class Arsenal{
    protected String titulo;
    protected int quan;
    
    public Arsenal(String titulo, int quan){
    this.titulo = titulo;
    this.quan = quan;
    }
    
    public void setTitu(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitu(){
        return titulo;
    }
    public void setQua(int quan){
        this.quan = quan;
    }
    public int getQua(){
        return quan;
    }
}
