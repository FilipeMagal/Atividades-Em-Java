package creatingclass;

public class ProductStock{

    private String name;
    private double price;
    private int quantity;

    public double getPrice (){                                      //Encapsulamento

        return price;
    }

    public void setPrice (double price){                            //Encapsulamento

        this.price = price;
    }
    public void setName (String name){                              //Encapsulamento

        this.name = name;
    }
    public String getName (){                                       //Encapsulamento
        return name;
    }

    public ProductStock (String name, double price){                //Sobrecarga
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock(){                              //Funções

        return price * quantity;
    }
    public void addValueInStock(int quantity){                      //Funções

        this.quantity += quantity;
    }
    public void removeValueInStock(int quantity){                   //Funções

        this.quantity -= quantity;
    }
    @Override
    public String toString (){                                      //toString
        return name + ", $ "+String.format("%.2f", price)+", "+quantity+" units, Total: $ "+String.format("%.2f", totalValueInStock());
    }
}