package ArrayList;

public class MyArrayListPractice {
    public static void main(String[] args) {


        MyArrayList list = new MyArrayList();
        System.out.println("list.size() = " + list.size());
        list.add("Privet");
        list.add("Poca");
        System.out.println("Posle dobavlenui" + list.size());
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");

        System.out.println(list);
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains() = " + list.contains(list));
        list.clear();
        // 1 Test
        System.out.println("Тест 1 (должно быть true): " + list.isEmpty());
        // 2 Test
        System.out.println("(Тест 2 false,если коллекция содержит о ) :" +list.contains(list));
        // 3 Test
        System.out.print("Тест 3, (удаляект всю колекцию):");
        list.clear();

        // Тестирование add(Object o)
        System.out.println("Adding elements:");
        list.add("Hello");
        list.add("World");
        list.add(123);
        System.out.println(list); // Ожидается: list{Hello, World, 123}

        // Тестирование contains(Object o)
        System.out.println("Contains 'Hello': " + list.contains("Hello")); // Ожидается: false
        System.out.println("Contains 'Java': " + list.contains("Java")); // Ожидается: false

        // Тестирование get(int index)
        System.out.println("Element at index 1: " + list.get(1)); // Ожидается: World

        // Тестирование set(int index, Object element)
        list.set(1, "Java");
        System.out.println("After set at index 1: " + list); // Ожидается: list{Hello, Java, 123}

        // Тестирование remove(Object o)
        list.remove("Hello");
        System.out.println("After removing 'Hello': " + list); // Ожидается: list{Java, 123}

        // Тестирование clear()
        list.clear();
        System.out.println("After clear: " + list); // Ожидается: list{}

        // Тестирование add(int index, Object element)
        list.add("First");
        list.add("Second");
        list.add(1, "Middle");
        System.out.println("After adding at index 1: " + list); // Ожидается: list{First, Middle, Second}

        // Тестирование remove(int index)
        list.remove(1);
        System.out.println("After removing at index 1: " + list); // Ожидается: list{First, Second}

        // Тестирование indexOf(Object o)
        System.out.println("Index of 'Second': " + list.indexOf("Second")); // Ожидается: 1
        System.out.println("Index of 'First': " + list.indexOf("First")); // Ожидается: 0
        System.out.println("Index of 'NonExistent': " + list.indexOf("NonExistent")); // Ожидается: -1
        //Тестирование lastIndexOf(Object o)
        System.out.println("list.lastIndexOf(\"Privet\") = " + list.lastIndexOf("Privet"));//Ожидается: -1
        System.out.println("list.lastIndexOf(\"Second\") = " + list.lastIndexOf("Second"));//Ожидается: 1
    }
}
