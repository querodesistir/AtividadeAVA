	
public class Lampada{
boolean onif; 
int min; //valor que consome
int recebe; //val que ganha
//Construtor
Lampada(boolean onif,int min, int recebe){
    this.onif = false;
    this.min = min;
    this.recebe = recebe;
}
public void setWatts(boolean onif,int min, int recebe){
    this.onif = false;
    this.min = min;
    this.recebe = recebe;
}
public boolean testaliga(){
 if(recebe>min){
    onif = true;
}
   return onif;
}
public void ligar(){
if(onif == false){
    System.out.println("desligada");
}
else{
  System.out.println("ligada");
} 
}
}