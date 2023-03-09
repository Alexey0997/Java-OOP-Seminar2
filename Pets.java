/*
1.Домашнее животное со следующими свойствами:
1.1 Кличка
1.2 Порода
1.3 Наличие прививок
1.4 Цвет шерсти
1.5 Дата рождения
И методами:
1.5 Проявлять ласку
 */
public abstract class Pets extends Animals implements ShowAffection{
    // ОПРЕДЕЛЯЕМ ПОЛЯ КЛАССА PETS
    String name;                            // Кличка.
    String species;                         // Порода.
    String vaccinations;                    // Наличие прививок.
    String coatColor;                       // Цвет шерсти.
    String birthDate;                       // Дата рождения.


    // КОНСТРУКТОР КЛАССА PETS
    public Pets(int height, int weight, String colourEyes, String name, String species, String vaccinations, String coatColor, String birthDate) {
        super(height, weight, colourEyes);
        this.name = name;
        this.species = species;
        this.vaccinations = vaccinations;
        this.coatColor = coatColor;
        this.birthDate = birthDate;
    }


    // ПЕРЕОПРЕДЕЛЯЕМ ПОРЯДОК ВЫВОДА ИНФОРМАЦИИ НА ПЕЧАТЬ
    @Override
    public String toString() {
        return "\nРост животного, см.:    " + height +
                "\nВес животного, кг.:    " + weight +
                "\nЦвет глаз:             " + colourEyes +
                "\nКличка:                " + name +
                "\nПорода:                " + species +
                "\nНаличие прививок:      " + vaccinations +
                "\nЦвет шерсти:           " + coatColor +
                "\nДата рождения:         " + birthDate;
    }

    // АБСТРАКТНЫЕ МЕТОДЫ КЛАССА PETS
    public abstract void showAffection();    // Метод проявления ласки.
}
