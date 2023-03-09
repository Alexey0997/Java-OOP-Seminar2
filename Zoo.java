import java.util.LinkedList;
import java.util.Scanner;
/*
Так же реализовать класс "Зоопарк", в котором будет храниться любая структура данных животных(массив, стек, очередь),
в котором организовать приватный массив объектов-животных со следующими методами:
1.Добавить животное в зоопарк(добавляет новое животное в структуру данных,
для массива использовать следующий алгоритм https://gospodaretsva.com/urok-27-vstavka-elementov-v-massiv.html ,
для стека и очереди вы алгоритмы уже знаете)
2.Убирает животное с номером i из зоопарка
(Использовать этот алгоритм https://gospodaretsva.com/urok-26-udalenie-elementa-iz-odnomernogo-massiva.html
для удаления из массива, для удаления из стека и очереди вы алгоритмы знаете)
3.Посмотреть информацию о животном с номером i
4.Заставить животное с номером i издать звук
5.Напечатать информацию о животных, которые есть на данный момент в зоопарке
6.Заставить всех животных, которые на данный момент есть в зоопарке, издать звук
 */
public class Zoo {

    public static void main(String[] args) {
    }
    // МЕТОД ВЫВОДА ДАННАХ О РАЗЛИЧНЫХ ВИДАХ ПРОДУКТОВ
    public static void getData(LinkedList<Animals> animals) {

        // МЕНЮ ДЛЯ ВЗАИМОДЕЙСТВИЯ С ПОЛЬЗОВАТЕЛЕМ
        System.out.print("""
                Уважаемый пользователь,
                для управления базой данных "Зоопарк" выберете одно из следующих действий:
                Добавить животное в зоопарк                                                    - нажмите 1
                Убрать животное с номером i из зоопарка                                        - нажмите 2
                Посмотреть информацию о животном с номером i                                   - нажмите 3
                Заставить животное с номером i издать звук                                     - нажмите 4
                Напечатать информацию о животных, которые есть на данный момент в зоопарке     - нажмите 5
                Заставить всех животных, которые на данный момент есть в зоопарке, издать звук - нажмите 6
                Ваше решение: \s""");
        Scanner aScanner = new Scanner(System.in);
        int decisionNumber = aScanner.nextInt();

        // ВАРИАНТЫ ВЗАИМОДЕЙСТВИЯ, ПРЕДЛАГАЕМЫЕ В ЗАВИСИМОСТИ ОТ РЕШЕНИЯ ПОЛЬЗОВАТЕЛЯ.
        switch (decisionNumber) {
            case 1 -> {
                System.out.println("\nУКАЖИТЕ № ЖИВОТНОГО, КОТОРОЕ ХОТИТЕ ДОБАВИТЬ В ЗООПАРК: ");
                System.out.print("""
                        Кота     - нажмите 1
                        Собаку   - нажмите 2
                        Тигра    - нажмите 3
                        Волка    - нажмите 4
                        Курицу   - нажмите 5
                        Аиста    - нажмите 6
                        Ваше решение: \s""");
                Scanner fScanner = new Scanner(System.in);
                int addNumber = fScanner.nextInt();
                if (addNumber > 0 & addNumber < 7){

                    // МЕТОД ДОБАВЛЕНИЯ ЖИВОТНЫХ В СПИСОК ЗООПАРКА
                    if (addNumber == 1){                                                              // Добавляем кота.
                        System.out.print("\nРост: ");
                        Scanner gScanner = new Scanner(System.in);
                        int height = gScanner.nextInt();
                        System.out.print("Вес: ");
                        Scanner hScanner = new Scanner(System.in);
                        int weight = hScanner.nextInt();
                        System.out.print("Цвет глаз: ");
                        Scanner iScanner = new Scanner(System.in);
                        String colourEyes = iScanner.next();
                        System.out.print("Кличка: ");
                        Scanner jScanner = new Scanner(System.in);
                        String name = jScanner.next();
                        System.out.print("Порода: ");
                        Scanner kScanner = new Scanner(System.in);
                        String species = kScanner.next();
                        System.out.print("Вакцинации: ");
                        Scanner lScanner = new Scanner(System.in);
                        String vaccination = lScanner.next();
                        System.out.print("Окрас шерсти: ");
                        Scanner mScanner = new Scanner(System.in);
                        String coatColor = mScanner.next();
                        System.out.print("Дата рождения: ");
                        Scanner nScanner = new Scanner(System.in);
                        String birthDate = nScanner.next();
                        Animals newCat = new Cat(height, weight, colourEyes, name, species, vaccination, coatColor, birthDate);
                        System.out.printf("\nВы добавили кота со следующими характеристиками: %s", newCat);
                    }
                    if (addNumber == 2){                                                            // Добавляем собаку.
                        System.out.print("\nРост: ");
                        Scanner gScanner = new Scanner(System.in);
                        int height = gScanner.nextInt();
                        System.out.print("Вес: ");
                        Scanner hScanner = new Scanner(System.in);
                        int weight = hScanner.nextInt();
                        System.out.print("Цвет глаз: ");
                        Scanner iScanner = new Scanner(System.in);
                        String colourEyes = iScanner.next();
                        System.out.print("Кличка: ");
                        Scanner jScanner = new Scanner(System.in);
                        String name = jScanner.next();
                        System.out.print("Порода: ");
                        Scanner kScanner = new Scanner(System.in);
                        String species = kScanner.next();
                        System.out.print("Вакцинации: ");
                        Scanner lScanner = new Scanner(System.in);
                        String vaccination = lScanner.next();
                        System.out.print("Окрас шерсти: ");
                        Scanner mScanner = new Scanner(System.in);
                        String coatColor = mScanner.next();
                        System.out.print("Дата рождения: ");
                        Scanner nScanner = new Scanner(System.in);
                        String birthDate = nScanner.next();
                        Animals newDog = new Dog(height, weight, colourEyes, name, species, vaccination, coatColor, birthDate);
                        System.out.printf("\nВы добавили собаку со следующими характеристиками: %s", newDog);
                    }
                    if (addNumber == 3){                                                             // Добавляем тигра.
                        System.out.print("\nРост: ");
                        Scanner gScanner = new Scanner(System.in);
                        int height = gScanner.nextInt();
                        System.out.print("Вес: ");
                        Scanner hScanner = new Scanner(System.in);
                        int weight = hScanner.nextInt();
                        System.out.print("Цвет глаз: ");
                        Scanner iScanner = new Scanner(System.in);
                        String colourEyes = iScanner.next();
                        System.out.print("Место обитания: ");
                        Scanner jScanner = new Scanner(System.in);
                        String habitat = jScanner.next();
                        System.out.print("Дата нахождения: ");
                        Scanner kScanner = new Scanner(System.in);
                        String locationDate = kScanner.next();
                        Animals newTiger = new Tiger(height, weight, colourEyes, habitat, locationDate);
                        System.out.printf("\nВы добавили тигра со следующими характеристиками: %s", newTiger);
                    }
                    if (addNumber == 4) {                                                            // Добавляем волка.
                        System.out.print("\nРост: ");
                        Scanner gScanner = new Scanner(System.in);
                        int height = gScanner.nextInt();
                        System.out.print("Вес: ");
                        Scanner hScanner = new Scanner(System.in);
                        int weight = hScanner.nextInt();
                        System.out.print("Цвет глаз: ");
                        Scanner iScanner = new Scanner(System.in);
                        String colourEyes = iScanner.next();
                        System.out.print("Место обитания: ");
                        Scanner jScanner = new Scanner(System.in);
                        String habitat = jScanner.next();
                        System.out.print("Дата нахождения: ");
                        Scanner kScanner = new Scanner(System.in);
                        String locationDate = kScanner.next();
                        Animals newWolf = new Wolf(height, weight, colourEyes, habitat, locationDate);
                        System.out.printf("\nВы добавили тигра со следующими характеристиками: %s", newWolf);
                    }

                    if (addNumber == 5){                                                            // Добавляем курицу.
                        System.out.print("\nРост: ");
                        Scanner gScanner = new Scanner(System.in);
                        int height = gScanner.nextInt();
                        System.out.print("Вес: ");
                        Scanner hScanner = new Scanner(System.in);
                        int weight = hScanner.nextInt();
                        System.out.print("Цвет глаз: ");
                        Scanner iScanner = new Scanner(System.in);
                        String colourEyes = iScanner.next();
                        Animals newChicken = new Chicken(height, weight, colourEyes);
                        System.out.printf("\nВы добавили курицу со следующими характеристиками: %s", newChicken);
                    }
                    if (addNumber == 6){                                                             // Добавляем аиста.
                        System.out.print("\nРост: ");
                        Scanner gScanner = new Scanner(System.in);
                        int height = gScanner.nextInt();
                        System.out.print("Вес: ");
                        Scanner hScanner = new Scanner(System.in);
                        int weight = hScanner.nextInt();
                        System.out.print("Цвет глаз: ");
                        Scanner iScanner = new Scanner(System.in);
                        String colourEyes = iScanner.next();
                        Animals newStork = new Stork(height, weight, colourEyes);
                        System.out.printf("\nВы добавили аиста со следующими характеристиками: %s", newStork);
                    }
                }
                else System.out.println("Такого номера нет в списке.");
            }

            // МЕТОД УДАЛЕНИЯ ЖИВОТНЫХ ИЗ БАЗЫ ДАННЫХ ЗООПАРКА
            case 2 -> {
                System.out.println("\nУКАЖИТЕ № ЖИВОТНОГО, КОТОРОЕ ХОТИТЕ УДАЛИТЬ ИЗ ЗООПАРКА: ");
                for (int i = 0; i < animals.size(); i++) {
                    System.out.printf("\n№ %s", i + 1 + " = " + animals.get(i).getClass().getSimpleName());
                }
                System.out.print("\nВаше решение:  ");
                Scanner bScanner = new Scanner(System.in);
                int delIndex = bScanner.nextInt();
                if (delIndex - 1 < animals.size()) {
                    System.out.printf("\nУдален: %s", animals.get(delIndex - 1).getClass().getSimpleName());
                    animals.remove(delIndex - 1);
                    System.out.println("\nВ зоопарке остались следующие животные: ");
                    for (int i = 0; i < animals.size(); i++) {
                        System.out.printf("\n№ %s", i + 1 + " = " + animals.get(i).getClass().getSimpleName());
                    }
                } else System.out.println("Такого номера нет в списке.");
            }

            // МЕТОД ПОЛУЧЕНИЯ ДАННЫХ О ЖИВОТНОМ
            case 3 -> {
                System.out.println("\nУКАЖИТЕ № ЖИВОТНОГО, О КОТОРОМ ХОТИТЕ ПОЛУЧИТЬ ДАННЫЕ: ");
                for (int i = 0; i < animals.size(); i++) {
                    System.out.printf("\n№ %s", i + 1 + " = " + animals.get(i).getClass().getSimpleName());
                }
                System.out.print("\nВаше решение:  ");
                Scanner cScanner = new Scanner(System.in);
                int showIndex = cScanner.nextInt();
                if (showIndex - 1 <= animals.size()) {
                    System.out.printf("\nДанные по Вашему запросу:  %s %s",
                            animals.get(showIndex - 1).getClass().getSimpleName(), animals.get(showIndex - 1));
                } else System.out.println("Такого номера нет в списке.");
            }

            // МЕТОД ПРОСЛУШИВАНИЯ ГОЛОСОВ ЖИВОТНЫХ
            case 4 -> {
                System.out.println("\nУКАЖИТЕ № ЖИВОТНОГО, ЧЕЙ ГОЛОС ВЫ ХОТИТЕ УСЛЫШАТЬ: ");
                for (int i = 0; i < animals.size(); i++) {
                    System.out.printf("\n№ %s", i + 1 + " = " + animals.get(i).getClass().getSimpleName());
                }
                System.out.print("\nВаше решение:  ");
                Scanner dScanner = new Scanner(System.in);
                int soundIndex = dScanner.nextInt();
                if (soundIndex - 1 <= animals.size()) {
                    animals.get(soundIndex - 1).soundMake();
                } else System.out.println("Такого номера нет в списке.");
            }

            // МЕТОД ВЫВОДА ДАННЫХ О ВСЕХ ЖИВОТНЫХ, НАХОДЯЩИХСЯ В ЗООПАРКЕ
            case 5 -> {
                System.out.println("\nНА ДАННЫЙ МОМЕНТ В ЗООПАРКЕ ИМЕЮТСЯ СЛЕДУЮЩИЕ ЖИВОТНЫЕ: ");
                for (int i = 0; i < animals.size(); i++) {
                    System.out.printf("\n№ %s\n %s\n", i + 1 + " = " + animals.get(i).getClass().getSimpleName(), animals.get(i));
                }
            }

            // МЕТОД ВЫЗОВА ЗВУКОВ, КОТОРЫЕ ИЗДАЮТ ВСЕ ЖИВОТНЫЕ ОДНОВРЕМЕННО
            case 6 -> {
                System.out.println("\nВСЕ ЖИВОТНЫЕ ЗООПАРКА ИЗДАЮТ ЗВУКИ: ");
                for (Animals animal : animals) {
                    ((SoundMake) animal).soundMake();
                }
            }
            default -> System.out.println("Такого номера нет в меню.");
        }
    }

    public static void doSomething(LinkedList<Animals> animals){
        // МЕНЮ ДЛЯ ВЗАИМОДЕЙСТВИЯ С ПОЛЬЗОВАТЕЛЕМ
        System.out.println();
        System.out.print("""
                \nЖИВОТНЫЕ МОГУТ ПРОДЕМОНСТРИРОВАТЬ НЕКОТОРЫЕ ДЕЙСТВИЯ
                Выбирете активность, которую бы хотели увидеть:
                Летать                              - нажмите 1
                Проявлять ласку                     - нажмите 2
                Заниматься дрессировкой             - нажмите 3
                Ваше решение: \s""");
        Scanner aScanner = new Scanner(System.in);
        int userWishes = aScanner.nextInt();

        // ВАРИАНТЫ ВЗАИМОДЕЙСТВИЯ, ПРЕДЛАГАЕМЫЕ В ЗАВИСИМОСТИ ОТ РЕШЕНИЯ ПОЛЬЗОВАТЕЛЯ.
        switch (userWishes) {
            case 1 -> {
                System.out.println("\nПТИЦЫ МОГУТ ЛЕТАТЬ\n");
                for (Animals animal : animals) {
                    if (animal instanceof GetAltitude) {
                        ((GetAltitude) animal).getAltitude();
                    }
                }
            }
            case 2 -> {
                System.out.println("\nДОМАШНИЕ ЖИВОТНЫЕ ПРОЯВЛЯЮТ ЛАСКУ\n");
                for (Animals animal : animals) {
                    if (animal instanceof ShowAffection) {
                        ((ShowAffection) animal).showAffection();
                    }
                }
            }
            case 3 -> {
                System.out.println("\nСОБАКИ ПОДДАЮТСЯ ДРЕССИРОВКЕ\n");
                for (Animals animal : animals){
                    if (animal instanceof Training){
                        ((Training) animal).training();
                    }
                }
            }
        }
    }
}
