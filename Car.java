package TaskOne;

public class Car extends Transport{
    public Engine engine = new Engine();

    public Car(float speed, int weight, String color, byte[] coordinate){
        super(speed, weight, color, coordinate);
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Скорость " + speed);
        
    }
}
