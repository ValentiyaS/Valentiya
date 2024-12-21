package HWbonbons;
import java.util.List;

interface SweetBox {
    void addSweet(BoxOfSweets sweet);
    void remove(int index);
    void removeLast();
    double getTotalWeight();
    double getTotalPrice();
    void showAllSweets();


    String toString(String name, double weight, double price);
}