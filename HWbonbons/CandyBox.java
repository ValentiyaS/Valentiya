package HWbonbons;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class CandyBox implements SweetBox {
    private ArrayList<BoxOfSweets> sweets = new ArrayList<>();

    // Метод для добавления сладостей в коробку
    public void addSweet(BoxOfSweets sweet) {
        sweets.add(sweet);
    }

    // Метод для удаления сладости по индексу
    public void remove(int index) {
        if (index >= 0 && index < sweets.size()) {
            sweets.remove(index);
        }
    }

    // Метод для удаления последней сладости
    public void removeLast() {
        if (!sweets.isEmpty()) {
            sweets.remove(sweets.size() - 1);
        }
    }

    // Метод для получения общего веса коробки
    public double getTotalWeight() {
        double totalWeight = 0;
        for (BoxOfSweets sweet : sweets) {
            totalWeight += sweet.weight;
        }
        return totalWeight;
    }

    // Метод для получения общей стоимости коробки
    public double getTotalPrice() {
        double totalPrice = 0;
        for (BoxOfSweets sweet : sweets) {
            totalPrice += sweet.price;
        }
        return totalPrice;
    }

    // Метод для вывода всех сладостей
    public void showAllSweets() {
        for (BoxOfSweets sweet : sweets) {
            System.out.println(sweet.getDescription());
        }
    }

    // Метод для оптимизации коробки по весу
    public void optimizeWeight(double maxWeight) {
        // Удаляем сладости с наименьшим весом и наименьшей ценой
        while (getTotalWeight() > maxWeight && !sweets.isEmpty()) {
            // Сортируем по весу, затем по цене
            sweets.sort(Comparator.comparingDouble(BoxOfSweets::getWeight).thenComparingDouble(BoxOfSweets::getPrice));
            // Удаляем первую сладость из списка (самую лёгкую и дешёвую)
            sweets.remove(0);
        }
    }

    // Метод для оптимизации коробки по цене
    public void optimizePrice(double maxPrice) {
        // Удаляем сладости с наименьшим весом и наименьшей ценой
        while (getTotalPrice() > maxPrice && !sweets.isEmpty()) {
            // Сортируем по цене, затем по весу
            sweets.sort(Comparator.comparingDouble(BoxOfSweets::getPrice).thenComparingDouble(BoxOfSweets::getWeight));
            // Удаляем первую сладость из списка (самую дешёвую и лёгкую)
            sweets.remove(0);
        }
    }
}