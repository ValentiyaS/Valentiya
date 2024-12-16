package HWbonbons;

class Candy extends BoxOfSweets  {
    public Candy(String name, double weight, double price){
        super(name, weight, price);
    }

    String getDescription(){
        return "Candy: " + name + ", " + weight + "g., " + price + "rub.";
    }
}
