public class Chicken extends Birds implements GetAltitude{
    // КОНСТРУКТОР ДЛЯ КЛАССА CHICKENS
    protected Chicken(int height, int weight, String colourEyes) {
        super(height, weight, colourEyes);
    }

    // РЕАЛИЗУЕМ МЕТОДЫ ДЛЯ КЛАССА CHICKENS
    @Override
    public void soundMake() {                                                        // Издает звуки.
        System.out.println("Голос: курица кудахчет!");

    }
    @Override
    public void getAltitude() {
        System.out.println("Курица: Я планирую с высоты " + flightAltitude()+ " метров.");      // Сообщает высоту полета.
    }
}