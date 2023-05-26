public class Boat extends Vehicle {
	
    protected String mainSailColor;

    public void floatOnWater() {
        System.out.println("Boat is floating.");
    }
}

// Fandago Yacht class - subclass of Boat
class FandagoYacht extends Boat {
    public FandagoYacht(String mainSailColor) {
        this.mainSailColor = mainSailColor;
    }

    @Override
    public void floatOnWater() {
        System.out.println("Fandago Yacht is floating gracefully.");
    }
}
