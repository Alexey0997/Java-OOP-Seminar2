/*
На языке Java реализовать абстрактный класс "Животное" со следующими полями:
1.Рост животного
2.Вес животного
3.Цвет глаз животного
И методы:
1.Издать звук
2.Напечатать информацию о животном
*/
public abstract class Animals implements SoundMake{
    // ОПРЕДЕЛЯЕМ ПОЛЯ КЛАССА ANIMALS
    int height;
    int weight;
    String colourEyes;

    // КОНСТРУКТОР КЛАССА ANIMALS
    public  Animals(int height, int weight, String colourEyes) {
        this.height = height;
        this.weight = weight;
        this.colourEyes = colourEyes;
    }
    // ОПРЕДЕЛЯЕМ ПОРЯДОК ВЫВОДА ИНФОРМАЦИИ НА ПЕЧАТЬ
    @Override
    public String toString() {
        return "\nРост животного, см.: " + height +
                "\nВес животного, кг.: " + weight +
                "\nЦвет глаз:          " + colourEyes;
    }

    // АБСТРАКТНЫЕ МЕТОДЫ КЛАССА ANIMALS
    public abstract void soundMake();
}
