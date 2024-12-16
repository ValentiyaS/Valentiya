package HWbonbons;

public class Marmalade extends BoxOfSweets{
    public Marmalade(String name, double weight, double price){

        super(name, weight, price);

    }

    String getDescription(){
        return "Marmalade: " + name + ", " + weight + "g., " + price + "rub.";
    }
}