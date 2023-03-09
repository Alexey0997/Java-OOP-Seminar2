/*
4.Волк со свойством:
4.1 Вожак стаи(доступным только для чтения внешним классам)
 */
public class Wolf extends WildAnimals{

    // ОПРЕДЕЛЯЕМ ПОЛЯ КЛАССА WOLF
    private final boolean packLeader = true; // Вожак стаи - доступно пользователю только для чтения.

    // КОНСТРУКТОР КЛАССА WOLF

    public Wolf(int height, int weight, String colourEyes, String habitat, String locationDate) {
        super(height, weight, colourEyes, habitat, locationDate);
    }

    // ПЕРЕОПРЕДЕЛЯЕМ ПОРЯДОК ВЫВОДА ИНФОРМАЦИИ НА ПЕЧАТЬ
    public String toString() {
        return "\nРост животного, см:   " + height +
                "\nВес животного, кг:    " + weight +
                "\nЦвет глаз:            " + colourEyes +
                "\nМесто обитания:       " + habitat +
                "\nДата нахождения:      " + locationDate +
                "\nВожак стаи:           " + packLeader;
    }

    // ИСПОЛЬЗУЕМ СЕЛЕКТОР ПЕРЕДАЧИ ДАННЫХ ДЛЯ ЧТЕНИЯ
    public boolean getPackLeader(){
        return packLeader;
    }


    // ОПРЕДЕЛИМ МЕТОД ДЛЯ КЛАССА WOLFS
    @Override
    public void soundMake() {
        System.out.println("Голос: волк рычит и воет!");

    }
}
