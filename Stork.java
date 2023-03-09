public class Stork extends Birds implements GetAltitude{

    // КОНСТРУКТОР КЛАССА STORK
    protected Stork(int height, int weight, String colourEyes) {
        super(height, weight, colourEyes);
    }


    // РЕАЛИЗУЕМ МЕТОДЫ ДЛЯ КЛАССА STORK
    @Override
    public void soundMake() {                                                        // Издает звук.
        System.out.println("Голос: аист громко щелкает и трещит!");
    }
    @Override
    public void getAltitude() {
        System.out.println("Аист: Я лечу на высоте " + flightAltitude()+ " метра."); // Сообщает высоту полета.
    }
}
