package creatingclass;

public class SenaiLuana2 {
    private int cod;
    private String name;

    public SenaiLuana2(int codigo, String nome){
        cod = codigo;
        name = nome;
    }
   public String getName(){
        return name;
   }
    public int getCod(){
        return cod;
    }
   public void setName(String nome){
        name = nome;
   }
    public void setCod(int codigo){
        cod = codigo;
    }

}
