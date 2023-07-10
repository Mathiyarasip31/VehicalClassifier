abstract class vehicle {
    abstract public String start();
    abstract public String stop();

}
class Car extends vehicle{
    public String start(){

        return "Car started";
    }
    public String stop(){
        return "Car stopped";
    }
}
class Motorcycle extends vehicle{
    public String start(){
        return "Motorcycle Started";
    }
    public String stop(){
        return "Motorcycle stopped";
    }
}

class VehicalClassifier{
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        System.out.println(car.start());
        System.out.println(car.stop());
        System.out.println(motorcycle.start());
        System.out.println(motorcycle.stop());
    }
}
