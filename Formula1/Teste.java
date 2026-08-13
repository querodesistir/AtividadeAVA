import java.util.ArrayList;
public class Teste{
public static void main(String[] args){
    Patro febre = new Patro(30000, "Megasenna");
 Patro tosse = new Patro(20500, "Pastilha");
 ArrayList<Patro> nossaLista = new ArrayList<Patro>();
 nossaLista.add(febre);
 nossaLista.add(tosse);
 
    Equip dipirona = new Equip("Mop", 1990, nossaLista);
 Piloto jose = new Piloto("JJ Salvação", 21, "BR", 3, dipirona);
 Engenheiro caboco = new Engenheiro("Geraldo", 43, "Britanico",20243017, jose);
 Carro carro1 =  new Carro(7, 1, jose);
 
carro1.mostracar();
 dipirona.mostraequi();
 jose.mostravic();
 febre.mostrapat();
 tosse.mostrapat();
 caboco.mostraeng();
}
}