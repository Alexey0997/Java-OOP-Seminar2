/*
1.Кот со свойством:
1.1 Наличие шерсти(доступным только для чтения внешним классам)
 */
public class Cat extends Pets{

    // ОПРЕДЕЛЯЕМ ПОЛЯ КЛАССА Cats
    private final boolean woolPresence = true;       // Наличие шерсти - доступно пользователю только для чтения.

    // ИМПОРТИРУЕМ ХАРАКТЕРИСТИКИ РОДИТЕЛЬСКОГО КЛАССА
    public Cat(int height, int weight, String colourEyes, String name, String species, String vaccinations,
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
                "\nНаличие шерсти:        " + woolPresence;
    }


    // ОПРЕДЕЛИМ МЕТОДЫ ДЛЯ КЛАССА CATS
    @Override
    public void soundMake() {                                                                       // Издает звуки.
        System.out.println("Голос: котик мяукает!");
    }
    @Override                                                                                       // Проявляет ласку.
    public void showAffection() {
        System.out.println("Котик мурлыкает и обтирается о Вашу ногу.");
    }
}
