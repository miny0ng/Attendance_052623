public class Car extends Vehicle {
    String tireType;

    public void drive() {
        System.out.println("Car is driving.");
    }
}

//Toyota VIOS class - subclass of Car
class ToyotaVIOS extends Car {
 public ToyotaVIOS(String tireType) {
     this.tireType = tireType;
 }

 @Override
 public void drive() {
     System.out.println("Toyota VIOS is driving smoothly.");
 }
}