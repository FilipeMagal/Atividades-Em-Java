package creatingclass;

public class StudyingVectorInUdemy {
    private String name;
    private double price;

    public StudyingVectorInUdemy(String nome, double preco){
        name = nome;
        price = preco;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public void setPrice(double preco) {
        this.price = preco;
    }
    public String toString (){
        return "Nome = "+ name + " Preço = " + price;
    }
}
