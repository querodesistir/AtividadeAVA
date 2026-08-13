public class Pessoa{
    protected String nome;
    protected int idade;
    protected String nacio;
    
    Pessoa(String nome, int idade, String nacio){
         this.nome = nome;
         this.idade = 21;
         this.nacio = nacio;
    }
    
    public void setNome(String nome){
         this.nome = nome;
    }
     public void setidade(int idade){
         this.idade = idade;
    }
     public void setNaci(String nacio){
         this.nacio = nacio;
    }
     public String getNome(){
         return nome;
    }
       public int getidade(){
         return idade;
    }
       public String getNaci(){
         return nacio;
    }
     public void mostrapes(){
         System.out.println("nome: " + nome + idade +"anos e é de " + nacio);
     }
}