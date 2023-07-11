abstract class vehicle {
    abstract void start();
    abstract void stop();
}
class Car extends  vehicle{

    @Override
    void start() {
        System.out.println("Car started");
    }

    @Override
    void stop() {
        System.out.println("car stopped");
    }
}
class MotorCycle extends vehicle
{

    @Override
    void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    void stop() {
        System.out.println("Motorcycle started");
    }
}
class VehicalClassifier{
    public static void main(String[] args) {
        MotorCycle motorCycle=new MotorCycle();
        motorCycle.start();
        motorCycle.stop();
        Car car=new Car();
        car.start();
        car.stop();

    }
}
