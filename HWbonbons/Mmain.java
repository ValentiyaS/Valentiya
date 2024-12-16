package HWbonbons;
import java.util.Scanner;

public class Mmain {
        public static void main(String[] args) {
            // Создаём сладости
            BoxOfSweets marmalade = new Marmalade("Fruit Jelly", 150, 120); // название, вес, цена
            BoxOfSweets candy = new Candy("Mint Candy", 50, 70);
            BoxOfSweets chocolate = new Chocolate("Dark Chocolate", 200, 250);

            // Создаём коробку для сладостей
            CandyBox sweetBox = new CandyBox();

            // Добавляем сладости в коробку
            sweetBox.addSweet(marmalade);
            sweetBox.addSweet(candy);
            sweetBox.addSweet(chocolate);

            // Информация перед оптимизацией
            System.out.println("Перед оптимизацией:");
            sweetBox.showAllSweets();
            System.out.println("Общий вес: " + sweetBox.getTotalWeight() + " g");
            System.out.println("Общая стоимость: " + sweetBox.getTotalPrice() + " rub");

            // Сканер для ввода данных
            Scanner scanner = new Scanner(System.in);

            // Выбор типа оптимизации
            System.out.println("Выберите оптимизацию: 1 - по весу, 2 - по цене");
            int choice = scanner.nextInt();

            if (choice == 1) {
                // Оптимизация по весу
                System.out.println("Введите максимальный вес для оптимизации:");
                double maxWeight = scanner.nextDouble();

                System.out.println("\nОптимизация веса до макс " + maxWeight + " g:");
                sweetBox.optimizeWeight(maxWeight);
                sweetBox.showAllSweets();
                System.out.println("Общий вес после оптимизации: " + sweetBox.getTotalWeight() + " g");
            } else if (choice == 2) {
                // Оптимизация по цене
                System.out.println("Введите максимальную цену для оптимизации:");
                double maxPrice = scanner.nextDouble();

                System.out.println("\nОптимизация стоимости до макс " + maxPrice + " rub:");
                sweetBox.optimizePrice(maxPrice);
                sweetBox.showAllSweets();
                System.out.println("Общая стоимость после оптимизации: " + sweetBox.getTotalPrice() + " rub");
            } else {
                System.out.println("Неверный выбор. Попробуйте снова.");
            }


            scanner.close();
        }
    }

