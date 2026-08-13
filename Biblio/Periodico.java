public class Periodico extends Arsenal{
    private int vol;
    
    public Periodico(String titulo, int quan, int vol){
        super(titulo, quan);
        this.vol = vol;
    }
    
    public void setVol(int vol){
        this.vol = vol;
    }
    public int getVol(){
        return vol;
    }
}
