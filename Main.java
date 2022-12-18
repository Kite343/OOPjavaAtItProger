package TaskOne;
// import TaskOne.db.DB;

import TaskOne.db.DB;

public class Main {
    public static void main(String[] args) {
        // 1
        // Car bmw = new Car(250.5f, 2500, "White", new byte[] {0, 0, 0});
        // bmw.engine.setValue(false, 10000);
        // bmw.engine.info();
               
        // Truck truck = new Truck(5600, new byte[] {100, 0, 100}, false);
        // truck.setValue(250.5f, 2500, "White", new byte[] {0, 0, 0});
        // truck.engine.setValue(true, 10);
        // truck.engine.info();

        // // truck.setLoaded(true);
        // // truck.getLoaded();        
        // // System.out.println(truck.getValue());

        // Car flyCar = new Car(250.5f, 2500, "White", new byte[] {0, 0, 0}){
        //     @Override
        //     public void moveObject(float speed) {
        //         super.moveObject(speed);

        //         this.engine.isReady(true);
        //         System.out.println("Машина летит");
        //     }
        // };

        // flyCar.moveObject(450);

        // 2

        // DB db = new DB();

        // info();
        // info("Hello World");

        // 3

        // Person person = new Person();
        // Person.count = 5;
        // System.out.println(Person.count);
        Person obj1 = new Person();
        Person obj2 = new Person();
        Person obj3 = new Person();
        Person obj4 = new Person();
        obj2.getCount();
        obj4.getCount();
    }

    public static void info() {
        System.out.println("Hello");
    }

    public static void info(String word) {
        System.out.println(word + "!");
    }
}