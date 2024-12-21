package HWbonbons;

import java.util.ArrayList;
import java.util.Comparator;

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
        return sweets.stream().mapToDouble(BoxOfSweets::getWeight).sum();
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
        // Сортируем сладости по весу (от меньшего к большему)
        sweets.sort(Comparator.comparingDouble(BoxOfSweets::getWeight));

        System.out.println("Начинаем оптимизацию по весу. Максимальный вес: " + maxWeight);

        // Удаляем сладости с наименьшим весом, пока общий вес больше maxWeight
        while (getTotalWeight() > maxWeight) {
            if (!sweets.isEmpty()) {
                System.out.println("Текущий вес коробки: " + getTotalWeight() + " кг");
                System.out.println("Удаляем сладость: " + sweets.get(0));
                sweets.remove(0);
            } else {
                System.out.println("Коробка пуста, больше нечего удалять.");
                break;
            }
        }

        System.out.println("Оптимизация завершена. Итоговый вес: " + getTotalWeight() + " кг");
    }

    // Метод для оптимизации коробки по цене
    public void optimizePrice(double maxWeight) {
        // Сортируем сладости по цене (от меньшего к большему)
        sweets.sort(Comparator.comparingDouble(BoxOfSweets::getPrice));

        System.out.println("Начинаем оптимизацию по цене. Максимальный вес: " + maxWeight);

        // Удаляем сладости с наименьшей ценой, пока общий вес больше maxWeight
        while (getTotalWeight() > maxWeight) {
            if (!sweets.isEmpty()) {
                System.out.println("Текущий вес коробки: " + getTotalWeight() + " кг");
                System.out.println("Удаляем сладость: " + sweets.get(0)); // Наименьшая цена
                sweets.remove(0);
            } else {
                System.out.println("Коробка пуста, больше нечего удалять.");
                break;
            }
        }

        System.out.println("Оптимизация завершена. Итоговый вес: " + getTotalWeight() + " кг");
    }
    @Override
    public String toString(String name, double weight, double price) {
        return "Сладость [Название: " + name + ", Вес: " + weight + " кг, Цена: " + price + " руб.]";
    }

}