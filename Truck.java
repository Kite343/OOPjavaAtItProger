package TaskOne;

public class Truck extends Transport {

    private boolean isLoaded;
    public Engine engine = new Engine();
    

    public Truck(int weight, byte[] coordinate){
        super(weight, coordinate);
    }

    public Truck(int weight, byte[] coordinate, boolean isLoaded){
        super(weight, coordinate);
        this.isLoaded = isLoaded;
    }
    
    
    public void setValue(float speed, int weight, String color, byte[] coordinate, boolean isLoaded){
        super.setValue(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }

    @Override
    protected String getValue(){
        System.out.println(super.getValue());
        return getLoaded();
    }

    public void setLoaded(boolean loaded) {
        this.isLoaded = loaded;
    }

    public String getLoaded(){
        if(isLoaded)
        return "Грузовик загружен";
        else
        return "Грузовик не загружен";

    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Скорость " + speed);
        
    }
}
