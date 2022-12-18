package TaskOne;

public abstract class Transport {
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;
    

    // public Transport(){

    // }

    public Transport(float speed, int weight, String color, byte[] coordinate){
        System.out.println("Object created");
        setValue(speed, weight, color, coordinate);
        // System.out.println(getValue());
    }

    public Transport(int weight, byte[] coordinate){
        this.weight = weight;
        this.coordinate = coordinate;
        // System.out.println(getValue());
    }

    
    public abstract void  moveObject(float speed);    
    
    protected void setValue(float speed, int weight, String color, byte[] coordinate){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    protected String getValue(){
        String info = "Object speed: " + this.speed + ". Weight: " + this.weight + ". Color: " + this.color + ". \n";
        String infoCoord = "Coordinates:\n";
        for(int i = 0; i < coordinate.length; i++){
            infoCoord += coordinate[i] + "\n";
        }
        return info + infoCoord;
    }

    class Engine {
        private boolean isReady;
        private int km;

        public void setValue(boolean isReady,  int km){
            this.isReady = isReady;
            this.km = km;
        }

        public void isReady(boolean isReady) {
            this.isReady = isReady;
        }

        public void info(){
            if(isReady){
                System.out.println("Двигатель исправен");
            }
            else{
                System.out.println("не исправен. Проехал уже " + km + "км");
            }
        }
    }
}
