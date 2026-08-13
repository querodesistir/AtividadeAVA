public class Libro extends Arsenal{
    private boolean dispor;
    private int dievo;
    
    public Libro(String titulo, int quan, boolean dispor){
        super(titulo,quan);
        this.dispor = true;
        this.dievo = 15;
    }
    
    public void Presta(){
        dispor = false;
        
        System.out.println("Emprestimo feito! Retorne em "+ dievo+" dias");
    }
    
    public void Devolta(){
        dispor = true;
        System.out.println("Obrigado! Espero que o "+ titulo +" tenha sido uma otima experiencia!");
    }
    
    public void setDisp(boolean dispor){
        this.dispor = dispor;
    }
    public boolean getDisp(){
        return dispor;
    }
    public void setDia(int dievo){
        this.dievo = dievo;
    }
    public int getDia(){
        return dievo;
    }
}
