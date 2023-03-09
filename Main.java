import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // ФОРМИРУЕМ ИСХОДНУЮ БАЗУ ДАННЫХ ЖИВОТНЫХ, НАХОДЯЩИХСЯ В ЗООПАРКЕ
        LinkedList<Animals> animals = new LinkedList<>();
        Animals cat = new Cat(57, 8, "зеленые", "Кузьма", "Мейн Кун",
                "Fel-O-VaxIV, 07.03.2023 г.", "серо-белый", "13.06.2010.");
        Animals dog = new Dog(89, 17, "карие", "Рэкс", "Авчарка",
                "Fel-O-VaxIV, 07.03.2023 г.", "черный", "01.01.2020.");
        Animals tiger = new Tiger(102, 50, "зеленые", "Амурская тайга", "08.03.2023.");
        Animals wolf = new Wolf(50, 30, "черные", "лес", "08.03.2023.");
        Animals chicken = new Chicken(37, 2, "красные");
        Animals stork = new Stork(145, 12, "карие");
        animals.add(cat);
        animals.add(dog);
        animals.add(tiger);
        animals.add(wolf);
        animals.add(chicken);
        animals.add(stork);

        // ВЫЗЫВАЕМ МЕНЮ ДЛЯ ВЗАИМОДЕЙСТВИЯ С ПОЛЬЗОВАТЕЛЕМ
        Zoo.getData(animals);
        Zoo.doSomething(animals);
    }
}