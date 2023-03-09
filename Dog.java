/*
3.Собака со свойством:
3.1 Наличие дрессировки(доступным только для чтения внешним классам)
и методом:
3.2 Дрессировать
 */
public class Dog extends Pets implements SoundMake, Training {

    // ОПРЕДЕЛЯЕМ ПОЛЯ КЛАССА Dogs
    private final boolean trainingAvailability = false; // Наличие дрессировки - доступно пользователю только для чтения.


    // ИМПОРТИРУЕМ ХАРАКТЕРИСТИКИ РОДИТЕЛЬСКОГО КЛАССА
    public Dog(int height, int weight, String colourEyes, String name, String species, String vaccinations,
               String coatColor, String birthDate) {
        super(height, weight, colourEyes, name, species, vaccinations, coatColor, birthDate);
    }

    // ПЕРЕОПРЕДЕЛЯЕМ ПОРЯДОК ВЫВОДА ИНФОРМАЦИИ НА ПЕЧАТЬ
    @Override
    public String toString() {
        return "\nРост животного, см.:   " + height +
                "\nВес животного,  кг.:   " + weight +
                "\nЦвет глаз:             " + colourEyes +
                "\nКличка:                " + name +
                "\nПорода:                " + species +
                "\nНаличие прививок:      " + vaccinations +
                "\nЦвет шерсти:           " + coatColor +
                "\nДата рождения:         " + birthDate +
                "\nНаличие дрессировки:   " + trainingAvailability;
    }

    // ОПРЕДЕЛИМ МЕТОДЫ ДЛЯ КЛАССА DOGS
    @Override
    public void soundMake() {
        System.out.println("Голос: собака лает!");                                  // Издает звуки.
    }

    @Override                                                                       // Проявляет ласку.
    public void showAffection() {                                                   // Проявляет ласку.
        System.out.println("Собака машет хвостом.");
    }

    @Override
    public void training() {                                                        // Собака готова к дрессировке
        System.out.println("Собака выполнила команду сидеть и ждет дальнейших указаний.");
    }
}
