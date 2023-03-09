public class Tiger extends WildAnimals{
    // КОНСТРУКТОР КЛАСС TIGER
    public Tiger(int height, int weight, String colourEyes, String habitat, String locationDate) {
        super(height, weight, colourEyes, habitat, locationDate);
    }

    // МЕТОД КЛАССА TIGER
    @Override
    public void soundMake() {
        System.out.println("Голос: тигр громко рычит!");
    }
}
