public class Plane extends Vehicle {
    double wingsSpan;

    public void fly() {
        System.out.println("Plane is flying.");
    }
}

// U-2 Spy Plane class - subclass of Plane
class U2SpyPlane extends Plane {
    public U2SpyPlane(double wingsSpan) {
        this.wingsSpan = wingsSpan;
    }

    @Override
    public void fly() {
        System.out.println("U-2 Spy Plane is flying at high altitude.");
    }
}