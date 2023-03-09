/*
Так же реализовать абстрактный класс "Птица", реализующий интерфейс животное, у которого будет защищённое поле:
1.Высота полёта
и метод:
2. Летать, выводящий на экран фразу "Я лечу на x метрах, где x - высота полёта
и защищённый конструктор:
3.Конструктор принимающий высоту полёта
И следующие классы-наследники:
1.Курица
2.Аист
 */
public abstract class Birds extends Animals implements GetAltitude{
    // ОПРЕДЕЛИМ ПОЛЯ КЛАССА BIRDS
    private final int flightAltitude = 3;                   // Защищенное поле - высота полета. Данные о высоте можно
                                                            // изменить только в этом поле.

    // КОНСТРУКТОРЫ КЛАССА BIRDS
    protected Birds(int height, int weight, String colourEyes){
        super(height, weight, colourEyes);
    }

    // ПЕРЕОПРЕДЕЛИМ ПОРЯДОК ВЫВОДА ИНФОРМАЦИИ НА ПЕЧАТЬ
    @Override
    public String toString() {
        return "\nРост птицы, см.: " + height +
                "\nВес птицы, г.:   " + weight +
                "\nЦвет глаз:       " + colourEyes +
                "\nВысота полета:   " + flightAltitude;
    }

    // ИСПОЛЬЗУЕМ СЕЛЕКТОР ДЛЯ ПЕРЕДАЧИ ДАННЫХ ДЛЯ ЧТЕНИЯ.
    public int flightAltitude(){
        return flightAltitude;
    }

    // РЕАЛИЗУЕМ АБСТРАКТНЫЙ МЕТОД ВЫВОДА ДАННЫХ О ВЫСОТЕ ПОЛЕТА
    public void getAltitude() {
        System.out.println("Я лечу на высоте " + flightAltitude() + " метров.");
    }
}
