/*
2.Дикое животное со следующими свойствами:
2.1 Место обитания
2.2 Дата нахождения

Для всех классов реализовать методы издавать звук, чтобы он печатал на консоль звук, примерно похожий на звук,
который издаёт животное в реальном мире, а метод напечатать информацию, печатающий на экран все свойства,
которые есть у данного животного.

Так же для всех классов реализовать набор конструкторов, которые необходимы для задания всех свойств объекта,
которые они у него есть.
 */
public abstract class WildAnimals extends Animals{

    // ОПРЕДЕЛЯЕМ ПОЛЯ КЛАССА WildAnimals
    String habitat;              // Место обитания.
    String locationDate;         // Дата нахождения.

    // КОНСТРУКТОР КЛАССА WildAnimals
    public WildAnimals(int height, int weight, String colourEyes, String habitat, String locationDate) {
        super(height, weight, colourEyes);
        this.habitat = habitat;
        this.locationDate = locationDate;
    }

    // ПЕРЕОПРЕДЕЛЯЕМ ПОРЯДОК ВЫВОДА ИНФОРМАЦИИ НА ПЕЧАТЬ
    public String toString() {
        return "\nРост животного, см:   " + height +
                "\nВес животного, кг:    " + weight +
                "\nЦвет глаз:            " + colourEyes +
                "\nМесто обитания:       " + habitat +
                "\nДата нахождения:      " + locationDate;
    }
}
