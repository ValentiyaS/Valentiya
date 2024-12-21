package HWbonbons;

abstract class BoxOfSweets {
    String name;
    double weight;
    double price;

    public BoxOfSweets (String name, double weight, double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    public double getWeight() {
        return weight; // Возвращаем значение поля weight
    }

    // Геттер для цены
    public double getPrice() {
        return price; // Возвращаем значение поля price
    }
    abstract String getDescription();

    @Override
    public String toString() {
        return "Сладость [Название: " + name + ", Вес: " + weight + " кг, Цена: " + price + " руб.]";
    }



}